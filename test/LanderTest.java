/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import marslander.Display;
import marslander.InputReader;
import marslander.MarsLander;
import marslander.Simulator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim
 */
public class LanderTest {
    
    public LanderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    /**
     *
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
         @Test
     public void landerTest() throws FileNotFoundException, UnsupportedEncodingException 
     {
        
        TestCaseScanner testScanner = new TestCaseScanner();
       
        ArrayList<Float> altitudeInList = testScanner.scan_altitudeInList();
        ArrayList<String> podPosInList = testScanner.scan_podPosInList();
        ArrayList<Float> velocityInList = testScanner.scan_velocityInList();
        ArrayList<Float> fuelRemInList = testScanner.scan_fuelRemInList();
        ArrayList<Float> randValInList = testScanner.scan_randValInList();
        ArrayList<Integer> attCmdInList = testScanner.scan_attCmdInList();
        ArrayList<Integer> cumAttInList = testScanner.scan_cumAttInList();
        ArrayList<Integer> grndAttInList = testScanner.scan_grndAttInList();
        ArrayList<Integer> perCountInList = testScanner.scan_perCountInList();

        //expected output
        ArrayList<String> FLT20outList = testScanner.scan_FLT20outList();
        ArrayList<String> POSoutList = testScanner.scan_POSoutList();
        ArrayList<String> IPDZoutList = testScanner.scan_IPDZoutList();
        ArrayList<String> PDMGoutList = testScanner.scan_PDMGoutList();
        ArrayList<String> EPDoutList = testScanner.scan_EPDoutList();
        ArrayList<String> LCoutList = testScanner.scan_LCoutList();
        ArrayList<String> LOSoutList = testScanner.scan_LOSoutList();
        ArrayList<String> MPoutList = testScanner.scan_MPoutList();
        ArrayList<Float> altitudeOutList = testScanner.scan_altitudeOutList();
        ArrayList<Float> velocityOutList = testScanner.scan_velocityOutList();
        ArrayList<Float> fuelRemOutList = testScanner.scan_fuelRemOutList();
        ArrayList<String> podPosOutList = testScanner.scan_podPosOutList();
        ArrayList<String> podCMDoutList = testScanner.scan_podCMDoutList();
        ArrayList<Integer> attOutList = testScanner.scan_attOutList();

        InputReader in;
        MarsLander m1;
        Display d;
        Simulator s;
        boolean tempPodPosition = false;
        
        for(int testCase = 0; testCase < 53; testCase++)
        {
            m1 = new MarsLander();

            //set all setters with correct test variable
            m1.setAltitude(altitudeInList.get(testCase));
            
            if (podPosInList.get(testCase).equals("U"))
                tempPodPosition = false;
            if (podPosInList.get(testCase).equals("D"))
                tempPodPosition = true;
            
            m1.setPODPOS(tempPodPosition);
            m1.setVelocity(velocityInList.get(testCase));
            m1.setFuel(fuelRemInList.get(testCase));
            m1.setRand(randValInList.get(testCase));
            m1.setCmdAtt(attCmdInList.get(testCase));
            m1.setTerrAtt(grndAttInList.get(testCase));
            m1.setLandAtt(cumAttInList.get(testCase));
            m1.setCounter(perCountInList.get(testCase));

       
            d = new Display(m1);
            d.setVisible(false);
            in = new InputReader(d,m1);
            in.setActions();
            s = new Simulator(in,m1,d);

            s.getInputs();      //Get pilot and sensor inputs
            s.calculate();      //Do calculations for fuel, alt, and velocity
            s.computeState();   //Compute the new state of the lander
            s.updateDisplay();  //Update the display 
            
            //set all expected output vars from test lists
            String expFLT20out;
            expFLT20out = FLT20outList.get(testCase);
      
            String expPOSout;
            expPOSout = POSoutList.get(testCase);
       
            String expIPDZout;
            expIPDZout = IPDZoutList.get(testCase);
           
            String expPDMGout;
            expPDMGout = PDMGoutList.get(testCase);
        
            String expEPDout;
            expEPDout = EPDoutList.get(testCase);
       
            String expLCout;
            expLCout = LCoutList.get(testCase);
        
            String expLOSout;
            expLOSout = LOSoutList.get(testCase);
          
            String expMPout;
            expMPout = MPoutList.get(testCase).toLowerCase();
           
            Float expAltitudeOut;
            expAltitudeOut = altitudeOutList.get(testCase);
        
            Float expVelocityOut;
            expVelocityOut = velocityOutList.get(testCase);
              
            Float expFuelRemOut;
            expFuelRemOut = fuelRemOutList.get(testCase);
      
            String expPodPosOut;
            expPodPosOut = podPosOutList.get(testCase);
        
            String expPodCMDout;
            expPodCMDout = podCMDoutList.get(testCase);
     
            int expAttOut;
            expAttOut = attOutList.get(testCase);
            //set all actual variables using getters
            
            String actFLT20out = "";
            if (m1.getFLT20() == true)
                actFLT20out = "TRUE";
            if (m1.getFLT20() == false)
                actFLT20out = "FALSE";
                    
            String actPOSout = "";
            if (m1.getPOS()== true)
                actPOSout = "TRUE";
            if (m1.getPOS() == false)
                actPOSout = "FALSE";
            
            
            String actIPDZout = "";
            if (m1.getIPDZ()== true)
                actIPDZout = "TRUE";
            if (m1.getIPDZ() == false)
                actIPDZout = "FALSE";
            
            String actPDMGout = "";
            if (m1.getPDMG()== true)
                actPDMGout = "TRUE";
            if (m1.getPDMG() == false)
                actPDMGout = "FALSE";
            
            String actEPDout = "";
            if (m1.getEPD()== true)
                actEPDout = "TRUE";
            if (m1.getEPD() == false)
                actEPDout = "FALSE";
            
            String actLCout = "";
            if (m1.getLC()== true)
                actLCout = "TRUE";
            if (m1.getLC() == false)
                actLCout = "FALSE";
            
            
            String actLOSout = "";
            if (m1.getLOS()== true)
                actLOSout = "TRUE";
            if (m1.getLOS() == false)
                actLOSout = "FALSE";
            
            String actMPout;
            actMPout = m1.getMode().getRRMode();
            
            Float actAltitudeOut;
            actAltitudeOut = m1.getAltitude();
            
            Float actVelocityOut;
            actVelocityOut = m1.getVelocity();
            
            Float actFuelRemOut;
            actFuelRemOut = m1.getFuel();
            
            String actPodPosOut = "";
            if (m1.getPODPOS() == true)
                actPodPosOut = "D";
            if (m1.getPODPOS() == false)
                actPodPosOut = "U";

            
            String actPodCMDout = "";
            if (m1.getPODCMD() == true)
                actPodCMDout = "D";
            if (m1.getPODCMD() == false)
                actPodCMDout = "U";
            
            int actAttOut;
            actAttOut = m1.getLandAtt();
            
            //run comparison, write results to a log file
            //include testcase number and test result at least.
            String FLT20Message ="FLT20 Success";
            String POSMessage ="POS Success";
            String IPDZMessage ="IPDZ Success";
            String PDMGMessage ="PDMG Success";
            String EPDMessage ="EPD Success";
            String LCMessage ="LC Success";
            String LOSMessage ="LOS Success";
            String MPMessage ="MP Success";
            String AltituteMessage ="Altitude Success";
            String VelocityMessage = "Velocity Success";
            String FuelMessage = "Fuel Success";
            String PodPosMessage = "PodPos Success";
            String PodCMDMessage = "PodCMD Success";
            String AttMessage = "Att Success";
            
            assertEquals(FLT20Message,actFLT20out,expFLT20out);
            assertEquals(POSMessage,actPOSout,expPOSout);
            assertEquals(IPDZMessage,actIPDZout,expIPDZout);
            assertEquals(PDMGMessage,actPDMGout,expPDMGout);
            assertEquals(EPDMessage,actEPDout,expEPDout);
            assertEquals(LCMessage,actLCout,expLCout);
            assertEquals(LOSMessage,actLOSout,expLOSout);
            assertEquals(MPMessage,actMPout,expMPout);
            assertEquals(AltituteMessage,actAltitudeOut,expAltitudeOut);
            assertEquals(VelocityMessage,actVelocityOut,expVelocityOut);
            assertEquals(FuelMessage,actFuelRemOut,expFuelRemOut);
            assertEquals(PodPosMessage,actPodPosOut,expPodPosOut);
            assertEquals(PodCMDMessage,actPodCMDout,expPodCMDout);
            assertEquals(AttMessage,actAttOut,expAttOut);    
            
            System.out.println(FLT20Message);
            System.out.println(POSMessage);
            System.out.println(IPDZMessage);
            System.out.println(PDMGMessage);
            System.out.println(EPDMessage);
            System.out.println(LCMessage);
            System.out.println(LOSMessage);
            System.out.println(MPMessage);
            System.out.println(AltituteMessage);
            System.out.println(VelocityMessage);
            System.out.println(FuelMessage);
            System.out.println(PodPosMessage);
            System.out.println(PodCMDMessage);
            System.out.println("Test " + (testCase + 1) + " done.");
            
            try (
            PrintWriter writer = new PrintWriter("Test_"+(testCase + 1) +"_Log"+".txt", "UTF-8")) 
            {
                writer.println(FLT20Message);
                writer.println(POSMessage);
                writer.println(IPDZMessage);
                writer.println(PDMGMessage);
                writer.println(EPDMessage);
                writer.println(LCMessage);
                writer.println(LOSMessage);
                writer.println(MPMessage);
                writer.println(AltituteMessage);
                writer.println(VelocityMessage);
                writer.println(FuelMessage);
                writer.println(PodPosMessage);
                writer.println(PodCMDMessage);
            }            
        }
     }
}
