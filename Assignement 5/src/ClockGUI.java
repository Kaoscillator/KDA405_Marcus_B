import java.awt.BorderLayout;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ClockGUI extends JFrame {

    private JPanel contentPane;
    private ClockLogic clockLogic;
    private JLabel lblClock;
    private JLabel lblNewLabel_1;
    private JTextField txthour;
    private JTextField txtminute;
    private JLabel lblAlarmmessage;
    private JLabel lblAlarmset;
    private boolean alarmSet;
        
    public void ClockGUI(){
    }
    
    public void setTimeOnLabel(String time){
    	lblClock.setText(time);//Vad gör denna?
    }
    
    public void activateAlarm(boolean activate){   
    	 if(activate)
         {
             lblAlarmset.setText(" TIME TO WAKE!");
         }else{
             lblAlarmset.setText(" ");
         }
     }
 
    
    
  
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClockGUI frame = new ClockGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ClockGUI() {
    	setTitle("ALARM CLOCK");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ClockGUI.class.getResource("/Image/clock.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 609, 516);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblAlarmset = new JLabel("Alarm set:");
        lblAlarmset.setFont(new Font("Calibri", Font.ITALIC, 16));
        lblAlarmset.setBounds(114, 271, 137, 25);
        contentPane.add(lblAlarmset);
        
        
        
        JButton btnsetAlarm = new JButton("SET");
        btnsetAlarm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 String hourString = txthour.getText();
                 int hour = Integer.parseInt(hourString);
                 String minuteString = txtminute.getText();
                 int minute = Integer.parseInt(minuteString);
                 clockLogic.setAlarm(hour, minute);
                 alarmSet = true;
                 lblAlarmset.setText("Alarm at: " + txthour.getText() + " : " + txtminute.getText());
        	}
        });
        
        btnsetAlarm.setBackground(new Color(153, 255, 153));
        btnsetAlarm.setFont(new Font("Calibri", Font.BOLD, 18));
        btnsetAlarm.setBounds(299, 409, 97, 25);
        contentPane.add(btnsetAlarm);
        
        lblClock = new JLabel("");
        lblClock.setForeground(SystemColor.activeCaptionBorder);
        lblClock.setBackground(SystemColor.activeCaptionBorder);
        lblClock.setIcon(null);
        lblClock.setHorizontalAlignment(SwingConstants.CENTER);
        lblClock.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 59));
        
        lblClock.setBounds(0, 0, 591, 469);
        contentPane.add(lblClock);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(ClockGUI.class.getResource("/bader/AlarmClock.png")));//Hämtar från thread
        lblNewLabel.setBounds(28, 83, 533, 317);
        contentPane.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("HOUR");
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(50, 413, 56, 16);
        contentPane.add(lblNewLabel_1);
        
        txthour = new JTextField();
        txthour.setFont(new Font("Calibri", Font.BOLD, 13));
        txthour.setBounds(106, 410, 64, 22);
        contentPane.add(txthour);
        txthour.setColumns(10);
        
        JLabel minutes = new JLabel("MIN");
        minutes.setFont(new Font("Calibri", Font.PLAIN, 18));
        minutes.setBounds(182, 413, 56, 16);
        contentPane.add(minutes);
        
        txtminute = new JTextField();
        txtminute.setFont(new Font("Calibri", Font.BOLD, 13));
        txtminute.setBounds(223, 409, 64, 25);
        contentPane.add(txtminute);
        txtminute.setColumns(10);
        
        JButton clearButton = new JButton("CLEAR");
        clearButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 clockLogic.clearAlarm();
        		 alarmSet = false;
                 lblAlarmset.setText("Alarm at: ");
        	}
        });
        clearButton.setForeground(new Color(0, 0, 51));
        clearButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
        clearButton.setBackground(new Color(255, 204, 255));
        clearButton.setBounds(416, 409, 97, 25);
        contentPane.add(clearButton);
        
        clockLogic = new ClockLogic(this);
    }
public boolean isAlarm(){
	return alarmSet;
	
}
public void checkAlarm(int hour, int minute){
	clockLogic.checkAlarmTime(hour, minute);
}

public void Alarm(){
	 lblAlarmset.setText("ALARM");
	
}
}






