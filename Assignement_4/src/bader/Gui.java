package bader;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField HumanName;
	private JTextField Buydog;
	private JButton btnPrintInfo;
	private JTextField Info;
	private JTextField Fel;
	
	private Human human;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		HumanName = new JTextField();
		HumanName.setHorizontalAlignment(SwingConstants.CENTER);
		HumanName.setFont(new Font("Calibri", Font.PLAIN, 22));
		HumanName.setBounds(76, 97, 203, 54);
		contentPane.add(HumanName);
		HumanName.setColumns(10);
		
		Buydog = new JTextField();
		Buydog.setHorizontalAlignment(SwingConstants.CENTER);
		Buydog.setFont(new Font("Calibri", Font.PLAIN, 22));
		Buydog.setColumns(10);
		Buydog.setBounds(76, 164, 203, 53);
		contentPane.add(Buydog);
		
		Fel = new JTextField();
		Fel.setColumns(10);
		Fel.setBounds(37, 440, 639, 39);
		contentPane.add(Fel);
		
		JButton btnNewButton = new JButton("NEW HUMAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(HumanName.getText().length() > 3){
					human = new Human(HumanName.getText());
				}
				if(HumanName.getText().length() < 3){
					Fel.setText("ERROR: Name has to be longer than 3 characters.");
					
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(314, 112, 128, 25);
		contentPane.add(btnNewButton);
		
		JButton btnBuyDog = new JButton("BUY DOG");
		btnBuyDog.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnBuyDog.setBackground(new Color(255, 255, 255));
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fel.setText("");
				Dog dog = new Dog(Buydog.getText());
				human.buyDog(dog);
			}
		});
		btnBuyDog.setBounds(314, 178, 128, 25);
		contentPane.add(btnBuyDog);
		
		btnPrintInfo = new JButton("PRINT INFO");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Info.setText(human.getInfo());
				
				
			}
		});
		btnPrintInfo.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnPrintInfo.setBackground(new Color(255, 255, 255));
		btnPrintInfo.setBounds(314, 309, 116, 25);
		contentPane.add(btnPrintInfo);
		
		Info = new JTextField();
		Info.setBounds(37, 384, 639, 39);
		contentPane.add(Info);
		Info.setColumns(10);
		
		Fel = new JTextField();
		Fel.setColumns(10);
		Fel.setBounds(37, 440, 639, 39);
		contentPane.add(Fel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(Gui.class.getResource("/bader/KennelGUI.png")));
		lblNewLabel.setBounds(-153, 0, 972, 642);
		contentPane.add(lblNewLabel);
	}
}
