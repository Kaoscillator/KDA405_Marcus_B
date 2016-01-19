import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import javax.swing.Box;
import javax.swing.JMenuBar;
import java.awt.List;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea txtrMalmFc = new JTextArea();
		txtrMalmFc.setText("Malm\u00F6 FC");
		txtrMalmFc.setForeground(Color.LIGHT_GRAY);
		contentPane.add(txtrMalmFc);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar);
		
		List list = new List();
		list.setBackground(new Color(0, 153, 204));
		contentPane.add(list);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(new Color(0, 51, 0));
		contentPane.add(verticalBox);
	}

}
