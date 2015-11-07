import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class TestCaseScanner {
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_testCaseList()
    {
        ArrayList<Integer> testCaseList = new ArrayList<Integer>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 0:
                            //System.out.println("Test Case Number " + testVar);
                            testCaseList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Integer var : testCaseList) 
//            {
//                System.out.println("PerCou tIn = " + var.toString());
//            }
            
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return testCaseList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_altitudeInList()
    {
        ArrayList<Float> altitudeInList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 1:
                            //System.out.println("!!!!!Altitude (feet) = " + testVar);
                            altitudeInList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
        //    for (Float var : altitudeInList) 
        //    {
       //         System.out.println("AltIn = " + var.toString());
       //     }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return altitudeInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_podPosInList()
    {
        ArrayList<String> podPosInList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 2:
                            //System.out.println("Pod Position = " + testVar);
                            podPosInList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : podPosInList) 
//            {
//                System.out.println("PodPosIn = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return podPosInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_velocityInList()
    {
        ArrayList<Float> velocityInList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 3:
                            //System.out.println("Velocity (fps) = " + testVar);
                            velocityInList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : velocityInList) 
//            {
//                System.out.println("VelocityIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return velocityInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_fuelRemInList()
    {
        ArrayList<Float> fuelRemInList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 4:
                            //System.out.println("Fuel rem = " + testVar);
                            fuelRemInList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : fuelRemInList) 
//            {
//                System.out.println("FuelRemIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fuelRemInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_randValInList()
    {
        ArrayList<Float> randValInList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 5:
                            //System.out.println("Random value = " + testVar);
                            randValInList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : randValInList) 
//            {
//                System.out.println("RandValIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return randValInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_attCmdInList()
    {
        ArrayList<Integer> attCmdInList = new ArrayList<Integer>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 6:
                            //System.out.println("Attitude cmd = " + testVar);
                            attCmdInList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Integer var : attCmdInList) 
//            {
//                System.out.println("AlitCMDIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return attCmdInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_cumAttInList()
    {
        ArrayList<Integer> cumAttInList = new ArrayList<Integer>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 7:
                            //System.out.println("Cum Attitude = " + testVar);
                            cumAttInList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : cumAttInList) 
//            {
//                System.out.println("CumAttIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cumAttInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_grndAttInList()
    {
        ArrayList<Integer> grndAttInList = new ArrayList<Integer>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 8:
                            //System.out.println("Ground attitude = " + testVar);
                            grndAttInList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : grndAttInList) 
//            {
//                System.out.println("GroundAttIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grndAttInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_perCountInList()
    {
        ArrayList<Integer> perCountInList = new ArrayList<Integer>();
        try 
        {
            
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 9:
                            //System.out.println("Pod Damaged P Count = " + testVar);
                            perCountInList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Integer var : perCountInList) 
//            {
//                System.out.println("PerCou tIn = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perCountInList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_FLT20outList()
    {
        ArrayList<String> FLT20outList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 10:
                            //System.out.println("FLT20 = " + testVar);
                            FLT20outList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : FLT20outList) 
//            {
//                System.out.println("FLT20 = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return FLT20outList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_POSoutList()
    {
        ArrayList<String> POSoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 11:
                            //System.out.println("POS = " + testVar);
                            POSoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : POSoutList) 
//            {
//                System.out.println("POS = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return POSoutList;
    }
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_IPDZoutList()
    {
        ArrayList<String> IPDZoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 12:
                            //System.out.println("IPDZ = " + testVar);
                            IPDZoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : IPDZoutList) 
//            {
//                System.out.println("IPDZ = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return IPDZoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_PDMGoutList()
    {
        ArrayList<String> PDMGoutList = new ArrayList<String>();
        try 
        {
            
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 13:
                            //System.out.println("PDMG = " + testVar);
                            PDMGoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : PDMGoutList) 
//            {
//                System.out.println("PDMG = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PDMGoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_EPDoutList()
    {
        ArrayList<String> EPDoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 14:
                            //System.out.println("EPD = " + testVar);
                            EPDoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : EPDoutList) 
//            {
//                System.out.println("EPD = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return EPDoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_LCoutList()
    {
        ArrayList<String> LCoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 15:
                            //System.out.println("LC = " + testVar);
                            LCoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : LCoutList) 
//            {
//                System.out.println("LC = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LCoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_LOSoutList()
    {
        ArrayList<String> LOSoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 16:
                            //System.out.println("LOS = " + testVar);
                            LOSoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : LOSoutList) 
//            {
//                System.out.println("LOS = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LOSoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_MPoutList()
    {
        ArrayList<String> MPoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 17:
                            //System.out.println("Motor  Program = " + testVar);
                            MPoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : MPoutList) 
//            {
//                System.out.println("MotorPOut = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MPoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_altitudeOutList()
    {
        ArrayList<Float> altitudeOutList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 18:
                            //System.out.println("Altitude = " + testVar);
                            altitudeOutList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : altitudeOutList) 
//            {
//                System.out.println("AltOut = " + var.toString());
//            } 
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return altitudeOutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_velocityOutList()
    {
        ArrayList<Float> velocityOutList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 19:
                            //System.out.println("Velocity (fps) = " + testVar);
                            velocityOutList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : velocityOutList) 
//            {
//                System.out.println("VelocityOut = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return velocityOutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Float> scan_fuelRemOutList()
    {
        ArrayList<Float> fuelRemOutList = new ArrayList<Float>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 20:
                            //System.out.println("FuelRemOut = " + testVar);
                            fuelRemOutList.add(Float.parseFloat(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : fuelRemOutList) 
//            {
//                System.out.println("FuelRemOut = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fuelRemOutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_podPosOutList()
    {
        ArrayList<String> podPosOutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 21:
                            //System.out.println("PODPOS = " + testVar);
                            podPosOutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : podPosOutList) 
//            {
//                System.out.println("podPosOut = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return podPosOutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_podCMDoutList()
    {
        ArrayList<String> podCMDoutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 22:
                            //System.out.println("PODCMD = " + testVar);
                            podCMDoutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (String var : podCMDoutList) 
//            {
//                System.out.println("podCMDOut = " + var);
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return podCMDoutList;
    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<Integer> scan_attOutList()
    {
        ArrayList<Integer> attOutList = new ArrayList<Integer>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 23:
                            //System.out.println("Attitude = " + testVar);
                            attOutList.add(Integer.parseInt(testVar));
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
//            for (Float var : attOutList) 
//            {
//                System.out.println("AttitiudeOut = " + var.toString());
//            }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return attOutList;

    }
    
    /**
     * @param args the command testLine arguments
     */
    @SuppressWarnings("null")
    public ArrayList<String> scan_podCommandOutList()
    {
        ArrayList<String> podCommandOutList = new ArrayList<String>();
        try 
        {
            Scanner s = new Scanner(new File("testCases.txt"));
            String[] testVars;
            while (s.hasNextLine())
            {
                String testLine = s.nextLine();              
                testVars = testLine.split("\t");
                int testVarIndex = 0;
                
                for (String testVar : testVars) 
                {
                    switch(testVarIndex)
                    {
                        case 24:
                            //System.out.println("Pod Command = " + testVar);
                            podCommandOutList.add(testVar);
                            testVarIndex++;
                            break;
                        case 25:
                            testVarIndex = 0;
                            break;
                        default:
                            testVarIndex++;
                    }
                }
            }
          //  for (String var : podCommandOutList) 
        //   {
     //           System.out.println("podCommandOut = " + var);
     //     }
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(TestCaseScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return podCommandOutList;
    }
}
