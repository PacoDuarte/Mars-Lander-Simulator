/*
 * @author Priscilla Paz, Tim McCoy, Emery Barnes, Francisco Martinez
 * CSE 4321
 * Project Part 4
 *
 * class Display
 * Update the alerts and values on the GUI.
 * 
 */

package marslander;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Display extends JFrame
{
        private MarsLander mLander;
    
        private JPanel contentPane;
	private JTextField altTextField;
	private JTextField velTextField;
	private JTextField txtRr;
	private JTextField txtRr_1;
	private JTextField txtRr_2;
	private JTextField txtOff;
	private JTextField fuelTextField;
	private JTextField terrTextField;
	private JTextField landTextField;
        
        private JLabel lblFuelRemaining;
        private Panel alarmFLT20;
        private Panel alarmPOS;
        private Panel alarmPDMG;
        private Panel alarmLC;
        private Panel warningEPD;
        private Panel indicatorIPDZ;
        private Panel indicatorLOS;
        private Panel indicatorPODCMD;
        private Panel indicatorPODPOS;
        
        private JPanel panel;
        
        //Pilot commands
        public JButton btnDown;
        public JButton btnUp;
        public JButton btnLowerAtt;
        public JButton btnRaiseAtt;
        
    public Display(MarsLander m)
    {
        mLander = m;
        makeFrame();
        addComponents();
    }
    
    
    public void makeFrame()
    {
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(59, 36, 180, 322);
		contentPane.add(panel);
		panel.setLayout(null);
              
    }
    
    public void addComponents()
    {
                JLabel lblNewLabel = new JLabel("Alarm");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblWarning = new JLabel("Warning");
		lblWarning.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarning.setBounds(58, 125, 46, 14);
		panel.add(lblWarning);
		
		JLabel lblIndicator = new JLabel("Indicator");
		lblIndicator.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblIndicator.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndicator.setBounds(51, 185, 66, 14);
		panel.add(lblIndicator);
		
		alarmFLT20 = new Panel();
		alarmFLT20.setBounds(21, 44, 41, 20);
		panel.add(alarmFLT20);
		alarmFLT20.setBackground(Color.WHITE);
		
		alarmPOS = new Panel();
		alarmPOS.setBackground(Color.WHITE);
		alarmPOS.setBounds(101, 44, 41, 20);
		panel.add(alarmPOS);
		
		alarmPDMG = new Panel();
		alarmPDMG.setBackground(Color.WHITE);
		alarmPDMG.setBounds(21, 87, 41, 20);
		panel.add(alarmPDMG);
		
		alarmLC = new Panel();
		alarmLC.setBackground(Color.WHITE);
		alarmLC.setBounds(101, 87, 41, 20);
		panel.add(alarmLC);
		
		warningEPD = new Panel();
		warningEPD.setBackground(Color.YELLOW);
		warningEPD.setBounds(63, 145, 41, 20);
		panel.add(warningEPD);
		
		indicatorIPDZ = new Panel();
		indicatorIPDZ.setBackground(Color.WHITE);
		indicatorIPDZ.setBounds(21, 218, 41, 20);
		panel.add(indicatorIPDZ);
		
		indicatorLOS = new Panel();
		indicatorLOS.setBackground(Color.GREEN);
		indicatorLOS.setBounds(21, 276, 41, 20);
		panel.add(indicatorLOS);
		
		indicatorPODCMD = new Panel();
		indicatorPODCMD.setBackground(Color.WHITE);
		indicatorPODCMD.setBounds(101, 218, 41, 20);
		panel.add(indicatorPODCMD);
		
		indicatorPODPOS = new Panel();
		indicatorPODPOS.setBackground(Color.WHITE);
		indicatorPODPOS.setBounds(101, 276, 41, 20);
		panel.add(indicatorPODPOS);
		
		altTextField = new JTextField();
		altTextField.setEditable(false);
		altTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		altTextField.setText("+0.0");
		altTextField.setColumns(10);
		altTextField.setBounds(318, 56, 124, 20);
		contentPane.add(altTextField);
		
		velTextField = new JTextField();
		velTextField.setEditable(false);
		velTextField.setText("-0.0");
		velTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		velTextField.setColumns(10);
		velTextField.setBounds(318, 149, 124, 20);
		contentPane.add(velTextField);
		
		JLabel lblAltitude = new JLabel("Altitude");
		lblAltitude.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblAltitude.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltitude.setBounds(356, 31, 46, 14);
		contentPane.add(lblAltitude);
		
		JLabel lblVelocity = new JLabel("Velocity");
		lblVelocity.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblVelocity.setHorizontalAlignment(SwingConstants.CENTER);
		lblVelocity.setBounds(356, 121, 46, 14);
		contentPane.add(lblVelocity);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_10.setBounds(322, 218, 124, 175);
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		txtRr = new JTextField();
		txtRr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtRr.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtRr.setBackground(Color.WHITE);
		txtRr.setHorizontalAlignment(SwingConstants.CENTER);
		txtRr.setEditable(false);
		txtRr.setText("RR1");
		txtRr.setColumns(10);
		txtRr.setBounds(23, 11, 76, 20);
		panel_10.add(txtRr);
		
		txtRr_1 = new JTextField();
		txtRr_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtRr_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtRr_1.setText("RR2");
		txtRr_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRr_1.setEditable(false);
		txtRr_1.setColumns(10);
		txtRr_1.setBackground(Color.WHITE);
		txtRr_1.setBounds(23, 54, 76, 20);
		panel_10.add(txtRr_1);
		
		txtRr_2 = new JTextField();
		txtRr_2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtRr_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtRr_2.setText("RR3");
		txtRr_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRr_2.setEditable(false);
		txtRr_2.setColumns(10);
		txtRr_2.setBackground(Color.WHITE);
		txtRr_2.setBounds(23, 102, 76, 20);
		panel_10.add(txtRr_2);
		
		txtOff = new JTextField();
		txtOff.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtOff.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtOff.setForeground(Color.WHITE);
		txtOff.setText("Off");
		txtOff.setHorizontalAlignment(SwingConstants.CENTER);
		txtOff.setEditable(false);
		txtOff.setColumns(10);
		txtOff.setBackground(new Color(70, 130, 180));
		txtOff.setBounds(23, 144, 76, 20);
		panel_10.add(txtOff);
		
		JLabel lblMotorProgram = new JLabel("Motor Program");
		lblMotorProgram.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblMotorProgram.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotorProgram.setBounds(339, 193, 86, 14);
		contentPane.add(lblMotorProgram);
		
		JLabel lblPodPositonSwitch = new JLabel("Pod Positon Switch");
		lblPodPositonSwitch.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodPositonSwitch.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblPodPositonSwitch.setBounds(613, 36, 110, 14);
		contentPane.add(lblPodPositonSwitch);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_11.setBounds(609, 31, 124, 157);
		contentPane.add(panel_11);
		panel_11.setLayout(null);
		
		btnDown = new JButton("Down");
		btnDown.setForeground(new Color(255, 250, 250));
		btnDown.setFont(new Font("Calibri", Font.PLAIN, 10));
		btnDown.setBackground(new Color(70, 130, 180));
		btnDown.setBounds(26, 90, 76, 20);
		panel_11.add(btnDown);
                
		btnUp = new JButton("Up");
		btnUp.setForeground(new Color(255, 250, 250));
		btnUp.setFont(new Font("Calibri", Font.PLAIN, 10));
		btnUp.setBackground(new Color(70, 130, 180));
		btnUp.setBounds(26, 39, 76, 20);
		panel_11.add(btnUp);
		
		lblFuelRemaining = new JLabel("Fuel Remaining");
		lblFuelRemaining.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuelRemaining.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblFuelRemaining.setBounds(613, 193, 120, 14);
		contentPane.add(lblFuelRemaining);
		
		fuelTextField = new JTextField();
		fuelTextField.setEditable(false);
		fuelTextField.setText("0.0");
		fuelTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		fuelTextField.setColumns(10);
		fuelTextField.setBounds(610, 234, 124, 20);
		contentPane.add(fuelTextField);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(100);
		progressBar.setBounds(599, 209, 146, 14);
		contentPane.add(progressBar);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_12.setLayout(null);
		panel_12.setBounds(609, 284, 124, 70);
		contentPane.add(panel_12);
		
		JLabel lblNewLabel_1 = new JLabel("-1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 45, 25, 14);
		panel_12.add(lblNewLabel_1);
		
		JLabel label = new JLabel("+1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(89, 45, 25, 14);
		panel_12.add(label);
		
		btnLowerAtt = new JButton("<");
		btnLowerAtt.setForeground(new Color(255, 250, 250));
		btnLowerAtt.setBackground(new Color(70, 130, 180));
		btnLowerAtt.setFont(new Font("Calibri", Font.PLAIN, 10));
		btnLowerAtt.setBounds(10, 11, 46, 34);
		panel_12.add(btnLowerAtt);
                
		btnRaiseAtt = new JButton(">");
		btnRaiseAtt.setForeground(new Color(255, 250, 250));
		btnRaiseAtt.setBackground(new Color(70, 130, 180));
		btnRaiseAtt.setFont(new Font("Calibri", Font.PLAIN, 10));
		btnRaiseAtt.setBounds(66, 11, 48, 34);
		panel_12.add(btnRaiseAtt);
                
		JLabel lblAttitude = new JLabel("Attitude");
		lblAttitude.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttitude.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblAttitude.setBounds(613, 265, 120, 14);
		contentPane.add(lblAttitude);
		
		terrTextField = new JTextField();
		terrTextField.setEditable(false);
		terrTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		terrTextField.setText("-1");
		terrTextField.setColumns(10);
		terrTextField.setBounds(613, 373, 46, 20);
		contentPane.add(terrTextField);
		
		landTextField = new JTextField();
		landTextField.setEditable(false);
		landTextField.setText("+1");
		landTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		landTextField.setColumns(10);
		landTextField.setBounds(687, 373, 46, 20);
		contentPane.add(landTextField);
		
		JLabel lblTerrain = new JLabel("Terrain");
		lblTerrain.setHorizontalAlignment(SwingConstants.CENTER);
		lblTerrain.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblTerrain.setBounds(613, 358, 46, 14);
		contentPane.add(lblTerrain);
		
		JLabel lblLander = new JLabel("Lander");
		lblLander.setHorizontalAlignment(SwingConstants.CENTER);
		lblLander.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblLander.setBounds(687, 357, 46, 14);
		contentPane.add(lblLander);
    }
    
    public void update()
    {
            DecimalFormat sig1 = new DecimalFormat("#.#");
            sig1.setRoundingMode(RoundingMode.DOWN);
            float alt = new Float(sig1.format(mLander.getAltitude()));
            float vel = new Float(sig1.format(mLander.getVelocity()));
            
            DecimalFormat sig2 = new DecimalFormat("#.##");
            sig2.setRoundingMode(RoundingMode.DOWN);
            float fuel = new Float(sig2.format(mLander.getFuel()));
            
            
            setTextField(alt,altTextField);
            setTextField(vel,velTextField);
            setTextField(fuel,fuelTextField);
            setTextField(mLander.getTerrAtt(),terrTextField);
            setTextField(mLander.getLandAtt(),landTextField);
            
            if(mLander.getFLT20())
            {
                alarmFLT20.setBackground(Color.RED);
            }
            else
            {
                alarmFLT20.setBackground(Color.WHITE);
            }
            
            if(mLander.getPOS())
            {
                alarmPOS.setBackground(Color.RED);
            }
            else
            {
                alarmPOS.setBackground(Color.WHITE);
            }
            
            if(mLander.getPDMG())
            {
                alarmPDMG.setBackground(Color.RED);
            }
            else
            {
                alarmPDMG.setBackground(Color.WHITE);
            }
            
            if(mLander.getLC())
            {
                alarmLC.setBackground(Color.RED);
            }
            else
            {
                alarmLC.setBackground(Color.WHITE);
            }
            
            if(mLander.getEPD())
            {
                warningEPD.setBackground(Color.YELLOW);
            }
            else
            {
                warningEPD.setBackground(Color.WHITE);
            }
            
            if(mLander.getIPDZ())
            {
                indicatorIPDZ.setBackground(Color.GREEN);
            }
            else
            {
                indicatorIPDZ.setBackground(Color.WHITE);
            }
            
            if(mLander.getLOS())
            {
                indicatorLOS.setBackground(Color.GREEN);
            }
            else
            {
                indicatorLOS.setBackground(Color.WHITE);
            }
            
            if(mLander.getPODCMD())
            {
                indicatorPODCMD.setBackground(Color.GREEN);
            }
            else
            {
                indicatorPODCMD.setBackground(Color.WHITE);
            }
            
            if(mLander.getPODPOS())
            {
                indicatorPODPOS.setBackground(Color.GREEN);
            }
            else
            {
                indicatorPODPOS.setBackground(Color.WHITE);
            }
            
            
            if(mLander.getPODBTN())
            {
                btnUp.setBackground(Color.GRAY);
                btnDown.setBackground(Color.BLUE);
            }
            else
            {
                btnUp.setBackground(Color.BLUE);
                btnDown.setBackground(Color.GRAY);
            }
            
            
            if(mLander.getMode().getRRMode().equals("rr1"))
            {
                txtRr.setBackground(Color.BLUE);
                txtRr_1.setBackground(Color.WHITE);
                txtRr_2.setBackground(Color.WHITE);
                txtOff.setBackground(Color.GRAY);
            }
            else if(mLander.getMode().getRRMode().equals("rr2"))
            {
                txtRr.setBackground(Color.WHITE);
                txtRr_1.setBackground(Color.BLUE);
                txtRr_2.setBackground(Color.WHITE);
                txtOff.setBackground(Color.GRAY);
            }
            else if(mLander.getMode().getRRMode().equals("rr3"))
            {
                txtRr.setBackground(Color.WHITE);
                txtRr_1.setBackground(Color.WHITE);
                txtRr_2.setBackground(Color.BLUE);
                txtOff.setBackground(Color.GRAY);
            }
            else if(mLander.getMode().getRRMode().equals("off"))
            {
                txtRr.setBackground(Color.WHITE);
                txtRr_1.setBackground(Color.WHITE);
                txtRr_2.setBackground(Color.WHITE);
                txtOff.setBackground(Color.BLUE);
            }
    
            
    }
    
  
    
    
     public void setTextField(float value, JTextField textField)
        {
            if(value >= 0)
            {
                 textField.setText("+" + value);
            }
            else
            {
                textField.setText(Float.toString(value));
            }
        }
        
        public void setTextField(int value, JTextField textField)
        {
            if(value >= 0)
            {
                 textField.setText("+" + value);
            }
            else
            {
                textField.setText(Integer.toString(value));
            }
        }
    
    
}
