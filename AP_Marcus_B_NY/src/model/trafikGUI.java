package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class trafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField från;
	private JTextField till;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trafikGUI frame = new trafikGUI();
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
	public trafikGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 55, 43);
		contentPane.add(panel);
		
		från = new JTextField();
		från.setBounds(97, 123, 116, 22);
		contentPane.add(från);
		från.setColumns(10);
		
		till = new JTextField();
		till.setColumns(10);
		till.setBounds(97, 186, 116, 22);
		contentPane.add(till);
		
		JLabel lblVljHllplats = new JLabel("V\u00E4lj H\u00E5llplats");
		lblVljHllplats.setBounds(10, 56, 156, 42);
		contentPane.add(lblVljHllplats);
		
		JLabel lblFrn = new JLabel("FR\u00C5N");
		lblFrn.setBounds(12, 126, 56, 16);
		contentPane.add(lblFrn);
		
		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(10, 192, 75, 16);
		contentPane.add(lblTill);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(20);
		textArea.setColumns(10);
		textArea.setBounds(415, 30, 221, 195);
		contentPane.add(textArea);
		
		JButton sökButton = new JButton("S\u00F6k");
		sökButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 19));
		sökButton.setBounds(97, 237, 116, 33);
		contentPane.add(sökButton);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(20);
		textArea_1.setColumns(10);
		textArea_1.setBounds(415, 242, 221, 195);
		contentPane.add(textArea_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(97, 305, 116, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 365, 116, 22);
		contentPane.add(textField_1);
		
		JLabel lblTgresaSkanetrafiken = new JLabel("T\u00C5GRESA SKANETRAFIKEN");
		lblTgresaSkanetrafiken.setFont(new Font("Calibri", Font.BOLD, 19));
		lblTgresaSkanetrafiken.setBounds(136, 13, 239, 36);
		contentPane.add(lblTgresaSkanetrafiken);
	}
}
