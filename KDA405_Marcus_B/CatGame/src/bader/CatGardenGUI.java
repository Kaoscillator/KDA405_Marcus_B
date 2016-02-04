package bader;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class CatGardenGUI extends JFrame {

	private JPanel contentPane;
	
	private CatGarden garden;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatGardenGUI frame = new CatGardenGUI();
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
	public CatGardenGUI() {
		
		garden = new CatGarden ("Mor Anna 8");
		for (int i = 0; i < 50; i++){
			
			
			Cat d = new Cat("Green","Olle"+i);
			Random r = new Random();
			
			int age = r.nextInt(300);
			d.setAge(age);
			garden.addCat(d);
		
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Cat Kill");
		lblNewLabel.setBounds(0, 0, 0, 0);
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 13, 351, 184);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText(garden.getCats());
		
		JButton btnNewButton = new JButton("Kill a cat");
		btnNewButton.setBounds(274, 223, 97, 25);
		panel_1.add(btnNewButton);
		/*btnKillACat.addActionListener(new ActionListener() {
			 +			public void actionPerformed(ActionEvent arg0) {
			 +				//This method is called when the Killcat button is pressed
			 +				//So kill it
			 +				garden.killCat();
			 +				//Set new text in the textArea
			 +				textArea.setText(garden.getCats());
			 +			
			 +			}
			 +		});
			 +		contentPane.add(btnKillACat, BorderLayout.SOUTH);*/
		}
	
}
