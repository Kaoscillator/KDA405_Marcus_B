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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtStorlek;
	private JTextField txtFrg;
	private JTextField txtPris;
	private Shop bikeshop;

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
		bikeshop = new Shop();
		setTitle(" ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 521);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//bikesTest = new BikesTest();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(362, 125, 196, 192);
		contentPane.add(scrollPane);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.BOLD, 15));
		textArea.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(textArea);
		//textArea.setText(TestBike.bikesTest());
		
		txtStorlek = new JTextField();
		txtStorlek.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtStorlek.setBackground(new Color(204, 204, 204));
		txtStorlek.setColumns(10);
		txtStorlek.setBounds(30, 221, 116, 22);
		contentPane.add(txtStorlek);
		
		txtFrg = new JTextField();
		txtFrg.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtFrg.setBackground(new Color(204, 204, 204));
		txtFrg.setColumns(10);
		txtFrg.setBounds(30, 295, 116, 22);
		contentPane.add(txtFrg);
		
		txtPris = new JTextField();
		txtPris.setForeground(new Color(0, 0, 0));
		txtPris.setBackground(new Color(204, 204, 204));
		txtPris.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtPris.setColumns(10);
		txtPris.setBounds(30, 151, 116, 22);
		contentPane.add(txtPris);
		
		JButton btnNewButton = new JButton("NEUE BIKE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String color_1 = txtFrg.getText();//sätter text
				int price_1 = Integer.parseInt(txtPris.getText());
				int size_1 = Integer.parseInt (txtStorlek.getText());
				bikeshop.addBike(color_1, size_1, price_1);
				textArea.setText(bikeshop.getMainBikes());
				/*txtFrg.setText("");
				txtStorlek.setText("");
				txtPris.setText("");*/
				
		
			}
		});
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setBounds(198, 186, 129, 67);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PRICE");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(30, 129, 116, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SIZE");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(30, 186, 116, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COLOR");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(30, 266, 116, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(ShopGUI.class.getResource("/Bader/Bike shop ratt.png")));
		lblNewLabel.setBounds(0, 0, 615, 489);
		contentPane.add(lblNewLabel);
	}
}
