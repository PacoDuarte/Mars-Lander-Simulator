/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class Main.java
 * Until altitude < 0, run the simulation of the MarsLander every second.
 * 
 */

package marslander;
//import TestCaseScanner.*;
//import java.util.ArrayList;

public class Main 
{
        InputReader in;
        MarsLander m1;
        Display d;
        Simulator s;
        

        //TestCaseScanner _s = new TestCaseScanner();
        //ArrayList<Integer> myList = _s.scan_testCaseList();
        
        
        public Main()
        {
            m1 = new MarsLander();
            d = new Display(m1);
            d.setVisible(true);
            in = new InputReader(d,m1);
            in.setActions();
            s = new Simulator(in,m1,d);
        }
        
        public void run()
        {
            while(m1.getAltitude() >= 0)
            {
                s.getInputs();      //Get pilot and sensor inputs
                s.calculate();      //Do calculations for fuel, alt, and velocity
                s.computeState();   //Compute the new state of the lander
                s.updateDisplay();  //Update the display 
                
                //Delay for one second
                try 
                {
                    Thread.sleep(1000);                 //1000 milliseconds is one second.
                } catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
         /**
	 * Launch the application.
	 */
	public static void main(String[] args) 
        {
            Main m = new Main();
            m.run();
	}
}
