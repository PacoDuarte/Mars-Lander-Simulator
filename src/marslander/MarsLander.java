/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class MarsLander
 * Holds the current state of the MarsLander.
 * 
 */

package marslander;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class MarsLander
{
    private boolean PODBTN = false; //UP = FALSE
    private boolean EPD = false;
    private boolean PDMG = false;
    private boolean FLT20 = false;
    private boolean POS = false;
    private boolean LC = false;
    private boolean IPDZ = false;
    private boolean LOS = false;
    private boolean PODCMD = false; //UP == FALSE
    private boolean PODPOS = false; //UP == FALSE
    
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
    
    public MarsLander()
    {
                time = 0;
                altitude = 14318;
                velocity = -250*5280/3600;
                fuel = 135;
                rr1 = new Rocket("rr1", 1.25f,17);
                rr2 = new Rocket("rr2", 1.65f,19);
                rr3 = new Rocket("rr3",1.8f,13.7f);
                rOFF = new Rocket("off",0,0);
                mode = rr1;
                Random rand = new Random();
                terrAtt = rand.nextInt((10 - (-10)) + 1) + -10;
                   //Get random value for pod damage
                    Random rand2 = new Random();
       
           // randPDMG = rand.nextFloat();
            
            DecimalFormat sig2 = new DecimalFormat("#.##");
            sig2.setRoundingMode(RoundingMode.DOWN);
            randPDMG = new Float(sig2.format(rand2.nextFloat()));
                landAtt = 1;
                cmdAtt = 0;
                counterPDMG = 0;
    }
    
    public void setTime(int t)
    {
        time = t;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public void setAltitude(float a)
    {
        altitude = a;
    }
    
    public float getAltitude()
    {
        return altitude;
    }
    
    public void setVelocity(float v)
    {
        velocity = v;
    }
    
    public float getVelocity()
    {
        return velocity;
    }
    
    public void setFuel(float f)
    {
        fuel = f;
    }
    
    public float getFuel()
    {
        return fuel;
    }
    
    public void setMode(Rocket m)
    {
        mode = m;
    }
    
    public Rocket getMode()
    {
        return mode;
    }
    
    public void setTerrAtt(int a)
    {
        terrAtt = a;
    }
    
    public int getTerrAtt()
    {
        return terrAtt;
    }
    
    public void setLandAtt(int l)
    {
        landAtt = l;
    }
    
    public int getLandAtt()
    {
        return landAtt;
    }
    
    public void setCmdAtt(int c)
    {
        cmdAtt = c;
    }
    
    public int getCmdAtt()
    {
        return cmdAtt;
    }
    
    public void setCounter(int c)
    {
        counterPDMG = c;
    }
    
    public int getCounter()
    {
        return counterPDMG;
    }
    
    public void setRand(float r)
    {
        randPDMG = r;
    }
    
    public float getRand()
    {
        return randPDMG;
    }
    
    public void setPODBTN(boolean b)
    {
        PODBTN = b;
    }
    
    public boolean getPODBTN()
    {
        return PODBTN;
    }
    
    public void setEPD(boolean b)
    {
        EPD = b;
    }
    
    public boolean getEPD()
    {
        return EPD;
    }
    
    public void setPDMG(boolean b)
    {
        PDMG = b;
    }
    
    public boolean getPDMG()
    {
        return PDMG;
    }
    
    public void setFLT20(boolean b)
    {
        FLT20 = b;
    }
    
    public boolean getFLT20()
    {
        return FLT20;
    }
    
    public void setPOS(boolean b)
    {
        POS = b;
    }
    
    public boolean getPOS()
    {
        return POS;
    }
    
    public void setLC(boolean b)
    {
        LC = b;
    }
    
    public boolean getLC()
    {
        return LC;
    }
    
    public void setIPDZ(boolean b)
    {
        IPDZ = b;
    }
    
    public boolean getIPDZ()
    {
        return IPDZ;
    }
    
    public void setLOS(boolean b)
    {
        LOS = b;
    }
    
    public boolean getLOS()
    {
        return LOS;
    }
    
    public void setPODCMD(boolean b)
    {
        PODCMD = b;
    }
    
    public boolean getPODCMD()
    {
        return PODCMD;
    }
    
    public void setPODPOS(boolean b)
    {
        PODPOS = b;
        PODCMD = b;
        PODBTN = b;
    }
    
    public boolean getPODPOS()
    {
        return PODPOS;
    }
    
    
}