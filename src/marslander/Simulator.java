/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class Simulator.java
 * Compute the new simulation state of the Mars Lander.
 */
package marslander;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Simulator 
{
    private static final float GRAVITY = -12.2f;
    
    private InputReader input;
    private MarsLander mLander;
    private Display display;
    
    private boolean PODBTN = false; //UP = FALSE
    private boolean EPD = false;
    private boolean PDMG = false;
    private boolean FLT20 = false;
    private boolean POS = false;
    private boolean LC = false;
    private boolean IPDZ = false;
    private boolean LOS = false;
    private boolean PODCMD = false; //UP = FALSE
    private boolean PODPOS = false; //UP = FALSE
    
    private int time; //seconds
    private float altitude; //feet
    private float velocity; //feet/second
    private float fuel; //gallons
    private Rocket rr1;
    private Rocket rr2;
    private Rocket rr3;
    private Rocket rOFF;
    private Rocket mode;
    private int terrAtt;
    private int landAtt;
    private int cmdAtt;
    
    private int counterPDMG;
    private float randPDMG;
    
    public Simulator(InputReader in, MarsLander m, Display d)
    {
        input = in;
        mLander = m;
        display = d;
        
        rr1 = new Rocket("rr1",1.25f,17);
        rr2 = new Rocket("rr2",1.65f,19);
        rr3 = new Rocket("rr3",1.8f,13.7f);
        rOFF = new Rocket("off",0,0);
    }
    
    /*
      Get the PREVIOUS values from the lander.
    */
    public void getInputs()
    {
        PODBTN = mLander.getPODBTN();
        EPD = mLander.getEPD();
        PDMG = mLander.getPDMG();
        FLT20 = mLander.getFLT20();
        POS = mLander.getPOS();
        LC = mLander.getLC();
        IPDZ = mLander.getIPDZ();
        LOS = mLander.getLOS();
        PODCMD = mLander.getPODCMD();
        PODPOS = mLander.getPODPOS();
        
        time = mLander.getTime();
        altitude = mLander.getAltitude();
        velocity = mLander.getVelocity();
        fuel = mLander.getFuel();
        mode = mLander.getMode();
        terrAtt = mLander.getTerrAtt();
        landAtt = mLander.getLandAtt();
        cmdAtt = mLander.getCmdAtt();
        counterPDMG = mLander.getCounter();
        randPDMG = mLander.getRand();
        
        
        
    }
    
    public void calculate()
    {
            DecimalFormat sig1 = new DecimalFormat("#.#");
            sig1.setRoundingMode(RoundingMode.DOWN);
            DecimalFormat sigV = new DecimalFormat("#.#");
            sig1.setRoundingMode(RoundingMode.DOWN);
            DecimalFormat sig2 = new DecimalFormat("#.##");
            sig2.setRoundingMode(RoundingMode.DOWN);
            
            //check if EPD is enabled - then POD must be down
            if(EPD)
            {
                PODCMD = true;
                mLander.setPODCMD(true);
            }
            else
            {
                PODCMD = PODPOS;
                mLander.setPODCMD(PODPOS);
                
            }
            
            //The pod position indicator is equal to the command from the last iteration. ???
            //PODBTN is read once per iteration before calculations are performed.
           
            PODPOS = PODBTN;
            mLander.setPODPOS(PODBTN);
            
            landAtt += cmdAtt;
            mLander.setCmdAtt(0);
            mLander.setLandAtt(landAtt);
            
           // System.out.println("alt" + altitude);
            //Rocket modes are based off previous altitude
            if(altitude >= 6500)
            {
                mode = rr1;
                mLander.setMode(rr1);
                
            }
            else if(altitude <= 6499.9f && altitude >= 3500)
            {
                mode = rr2;
                mLander.setMode(rr2);
            }
            else if(altitude <= 3499.9f && altitude >= 0)
            {
                mode = rr3;
                mLander.setMode(rr3);
            }
            else if(altitude < 0)
            {
                mode = rOFF;
                mLander.setMode(rOFF);
            }
            
            
            //calculate current values
            if(altitude >= 0)
            {
                time++;
                mLander.setTime(time);
              //  System.out.println(time);
              //  float a = altitude - (time-0.5f)*(mLander.getMode().getRate() + GRAVITY);
              //  float b = new Float(sig1.format(a));
               /// System.out.println("A:" + b);
                altitude = new Float(sig1.format(altitude - (time-0.5f)*(mLander.getMode().getRate() + GRAVITY)));
                
                if(altitude < 0)
                {
                    //Note 1 - Motor program is switched to Off when the calculated altitude <0
                    mLander.setMode(rOFF);
                    //See note 2
                }
                else
                {
                    velocity = new Float(sigV.format(velocity + (mLander.getMode().getRate() + GRAVITY)));
                    fuel = new Float(sig2.format(fuel - mode.getGPS()));
                }
                
            }
            else
            {
                //When alt < 0
                
                //Note 2 - calculated altitude, velocity, 
                //fuel remaining, remaining fuel time are 
                //set to their previous values respectively.
                time++;
                mLander.setTime(time);
                System.out.println(time);
            }
            
            
            
    }
    
    public void computeState()
        {
           // System.out.println(velocity);
            mLander.setAltitude(altitude);
            mLander.setVelocity(velocity);
            mLander.setFuel(fuel);
            
            //check if EPD is enabled - then POD must be down
            if(EPD)
            {
                PODCMD = true;
                mLander.setPODCMD(true);
            }
            else
            {
                PODCMD = PODPOS;
                mLander.setPODCMD(PODPOS);
                
            }

            //counter toward 40sec PDMG alarm
            if(PODPOS == true && velocity < -100)
            {
                counterPDMG ++;
                mLander.setCounter(counterPDMG);
            }
            
            //FLT20
            //Less than 20 seconds fuel remains
            //See prof calculations and test cases
            if((fuel < 36 && (mode.getRRMode().equals("rr3") || mode.getRRMode().equals("off"))) ||
                    (fuel < 25 && mode.getRRMode().equals("rr1")) || (fuel < 33 && mode.getRRMode().equals("rr2")))
            {
               FLT20 = true;
               mLander.setFLT20(true);
               System.out.println("FLT20");
            }

            
            //POS
            //Pod is down with velocity <-100 fps
            if(PODPOS == true && velocity < -100)
            {
                 POS = true;   
                 mLander.setPOS(true);
                 System.out.println("POS");
            }
            else
            {
                POS = false;   
                mLander.setPOS(false);
            }
            
            //IPDZ
            //Pod is up with -50 > velocity >= -100 and alt >= 0
            if(PODPOS == false && velocity < -50 && velocity >= -100 && altitude >= 0)
            {
                IPDZ = true;
                mLander.setIPDZ(true);
                System.out.println("IPDZ");
            }
            else
            {
                IPDZ = false;
                mLander.setIPDZ(false);
            }
            
         //   System.out.println(counterPDMG);
            
            //PDMG
            //Pod is down with velocity <-100 fps 40 seconds or longer
            if(counterPDMG >= 40)
            {
                PDMG = true;
                mLander.setPDMG(true);
                System.out.println("PDMG");
            }// no else, once damaged it stays damaged
            
            //EPD
            //Pod is up with velocity >=-50 and alt >= 0. When the warning
            //is issued, PODCMD is issued down - it takes one second to deploy
            //the pod (PODPOS = PODCMD) one second later. When the EPD is or
            //has been enabled, the PODBTN is set to D.
            if(PODPOS == false && velocity >= -50 && altitude >= 0)
            {
                EPD = true; 
                mLander.setEPD(true);
                PODCMD = true; //set to Down
                mLander.setPODCMD(true);
                PODBTN = true; //set to Down
                mLander.setPODBTN(true);
                System.out.println("EPD");
                System.out.println("PODCMD");
                System.out.println("PODBTN");
            }//no else, once epd is enabled it stays enabled
            
            //LC
            //if the altitude is <0 and the pod is up then the
            //lander crashes. If the pod is down but the pod damaged
            //alarm is alerted then there is a 70 percent chance that
            //the lander will crash because of the stress on the
            //pod. The lander also crashes if the attitude is >5 
            //degrees different than the terrain.
            if((altitude < 0 && (PODPOS == false || Math.abs(terrAtt - landAtt) > 5)) || (PODPOS == true && PDMG == true && randPDMG >= .3))
            {
                System.out.println(Math.abs(terrAtt - landAtt));
                LC = true;
                mLander.setLC(true);
                System.out.println("LC");
            } //no else, once lander crashes, it's done
            
            
            //LOS
            //If the altitude is <0 and the pod is down then the 
            //lander is safely on Mars. See previous note about 
            //the pod damaged alarm and terrain/attitude.
            if(altitude < 0 && PODPOS == true && LC == false && !(Math.abs(terrAtt - landAtt) > 5))
            {
                LOS = true;
                mLander.setLOS(true);
                System.out.println("LOS");
            }//no else, once it lands, it's done
            
             //Get random value for pod damage
            Random rand = new Random();
       
           // randPDMG = rand.nextFloat();
            
            DecimalFormat sig2 = new DecimalFormat("#.##");
            sig2.setRoundingMode(RoundingMode.DOWN);
            randPDMG = new Float(sig2.format(rand.nextFloat()));
          // System.out.println("RAND: " + randPDMG);
            mLander.setRand(randPDMG);

        }   
        

        public void updateDisplay()
        {
            display.update();
        }
    
        
    
    
}
