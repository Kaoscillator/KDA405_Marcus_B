import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextArea;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCalculator = new Calculator();
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Calibri", Font.BOLD, 60));
		
		

		/*textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(255, 204, 51));
		textField.setFont(new Font("Calibri", Font.BOLD, 70));
		textField.setBounds(74, 122, 329, 109);
		contentPane.add(textField);
		textField.setColumns(10);*/
		
		
		
		

		
		
		

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
				myCalculator.plus();
			}
		});
		textArea.setForeground(Color.ORANGE);
		textArea.setBounds(79, 115, 313, 126);
		contentPane.add(textArea);
		btnNewButton_1.setBounds(353, 464, 57, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				
				textArea.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(274, 498, 50, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btnNewButton_3.setBounds(79, 300, 50, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btnNewButton_4.setBounds(181, 298, 40, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		btnNewButton_5.setBounds(267, 298, 50, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnNewButton_6.setBounds(82, 365, 50, 25);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btnNewButton_7.setBounds(182, 365, 50, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btnNewButton_8.setBounds(270, 365, 50, 25);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.setForeground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton_9.setBounds(83, 431, 50, 25);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.setForeground(Color.BLACK);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btnNewButton_10.setBounds(181, 435, 50, 21);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.setForeground(Color.BLACK);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btnNewButton_11.setBounds(83, 498, 50, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setForeground(Color.BLACK);
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				textArea.append("");
			}
		});
		btnNewButton_12.setBounds(353, 365, 50, 25);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.setBackground(Color.WHITE);
		btnNewButton_14.setForeground(Color.BLACK);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
				textArea.append("");
				/*int i = myCalculator.getResult();*/
			}
		});
		btnNewButton_14.setBounds(353, 299, 50, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("00");
		btnNewButton_15.setForeground(Color.BLACK);
		btnNewButton_15.setBackground(Color.WHITE);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				myCalculator.numberButtonPressed(00);
			}
		});
		btnNewButton_15.setBounds(182, 498, 50, 23);
		contentPane.add(btnNewButton_15);
		
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btnNewButton.setBounds(267, 431, 54, 25);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\KGB\\Desktop\\Programmering II\\Assignement2\\Calculatormerr\u00E4tt.png"));
		lblNewLabel.setBounds(12, 37, 468, 573);
		contentPane.add(lblNewLabel);

	}
}
