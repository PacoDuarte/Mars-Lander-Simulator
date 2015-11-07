/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class InputReader
 * Get the pilots commands from the GUI - Attitude and PODBTN
 * 
 */

package marslander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Priscilla
 */
public class InputReader 
{
    Display display;
    
    private MarsLander mLander;
    
    private int landAtt; 
    private int landCmd; 
    
    public InputReader(Display d, MarsLander m)
    {
        display = d;
        mLander = m;
        landAtt = 1;
        landCmd = 0;
    }
    
    public void setActions()
    {
        display.btnDown.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { mLander.setPODBTN(true); }
                           });
        
        display. btnUp.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { 
                                   if(!mLander.getEPD()){mLander.setPODBTN(false);} }
                           });
        
        display.btnLowerAtt.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) 
                               {
                                   //landAtt = mLander.getLandAtt();
                                   landCmd = mLander.getCmdAtt();
                                   if(landAtt > -10) 
                                    {    
                                         landAtt --;
                                         landCmd --; 
                                         mLander.setCmdAtt(landCmd);
                                    } 
                               
                               }
                           });
        
        display.btnRaiseAtt.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) 
                               {
                                   //landAtt = mLander.getLandAtt();
                                   landCmd = mLander.getCmdAtt();
                                   if(landAtt < 10) 
                                    {    
                                         landAtt ++;
                                         landCmd ++; 
                                         mLander.setCmdAtt(landCmd);
                                    } 
                               }
                           });
        
    }
    
}
