package Bader;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;

public class ShopGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCykel;
	private JTextField txtStorlek;
	private JTextField txtFrg;
	private JTextField txtPris;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JTextArea textArea_5;
	private JTextArea textArea_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopGUI frame = new ShopGUI();
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
	public ShopGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 521);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(48, 245, 196, 192);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(204, 204, 204));
		scrollPane.setViewportView(textArea);
		
		txtCykel = new JTextField();
		txtCykel.setText("CYKEL");
		txtCykel.setBackground(new Color(204, 204, 204));
		txtCykel.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtCykel.setBounds(48, 113, 116, 22);
		contentPane.add(txtCykel);
		txtCykel.setColumns(10);
		
		txtStorlek = new JTextField();
		txtStorlek.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtStorlek.setText("STORLEK");
		txtStorlek.setBackground(new Color(204, 204, 204));
		txtStorlek.setColumns(10);
		txtStorlek.setBounds(236, 112, 116, 22);
		contentPane.add(txtStorlek);
		
		txtFrg = new JTextField();
		txtFrg.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtFrg.setText("F\u00C4RG");
		txtFrg.setBackground(new Color(204, 204, 204));
		txtFrg.setColumns(10);
		txtFrg.setBounds(420, 112, 116, 22);
		contentPane.add(txtFrg);
		
		txtPris = new JTextField();
		txtPris.setText("PRIS");
		txtPris.setForeground(new Color(0, 0, 0));
		txtPris.setBackground(new Color(204, 204, 204));
		txtPris.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtPris.setColumns(10);
		txtPris.setBounds(48, 160, 116, 22);
		contentPane.add(txtPris);
		
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(204, 204, 204));
		textField_4.setColumns(10);
		textField_4.setBounds(236, 159, 116, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(204, 204, 204));
		textField_5.setColumns(10);
		textField_5.setBounds(420, 159, 116, 22);
		contentPane.add(textField_5);
		
		textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(153, 153, 153));
		textArea_1.setBounds(48, 136, 116, 22);
		contentPane.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setBackground(new Color(153, 153, 153));
		textArea_2.setBounds(236, 136, 116, 22);
		contentPane.add(textArea_2);
		
		textArea_3 = new JTextArea();
		textArea_3.setBackground(new Color(153, 153, 153));
		textArea_3.setBounds(420, 136, 116, 22);
		contentPane.add(textArea_3);
		
		textArea_4 = new JTextArea();
		textArea_4.setBackground(new Color(153, 153, 153));
		textArea_4.setBounds(48, 183, 116, 22);
		contentPane.add(textArea_4);
		
		textArea_5 = new JTextArea();
		textArea_5.setBackground(new Color(153, 153, 153));
		textArea_5.setBounds(236, 183, 116, 22);
		contentPane.add(textArea_5);
		
		textArea_6 = new JTextArea();
		textArea_6.setBackground(new Color(153, 153, 153));
		textArea_6.setBounds(420, 183, 116, 22);
		contentPane.add(textArea_6);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		btnNewButton.setBounds(256, 413, 96, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(ShopGUI.class.getResource("/Bader/Bike shop ratt.png")));
		lblNewLabel.setBounds(0, 0, 615, 489);
		contentPane.add(lblNewLabel);
	}

	
}
