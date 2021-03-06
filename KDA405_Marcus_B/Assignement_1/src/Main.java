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
import java.awt.Button;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JList;
import javax.swing.border.EtchedBorder;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Dimension;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("BASEBALL CLUB Malmo");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\sports ball19.png"));
		lblNewLabel_9.setBounds(39, 358, 240, 60);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 117, 144, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 144, 205);
		panel.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Andersso", "Jana"},
				{"Anapurna", "Sikh"},
				{"Aruna", "Jeff"},
				{"Bobbi", "Bob"},
				{"Cartsens", "Monica"},
				{"Carl\u00E9n", "Poppi"},
				{"Dans\u00E4ter", "Virre"},
				{"Eriksson", "Erka"},
				{"Fabianus", "Ladislaous"},
				{"Gustavsson", "Carl"},
				{"Hansson", "Ina"},
				{"Hobert", "Madde"},
				{"Isaksson", "Ronny"},
				{"Jeffson", null},
				{null, null},
				{"g", null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Efternamn", "F�rnamn"
			}
		));
		
		JLabel lblNewLabel_1 = new JLabel("Profilbild");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\profilbild.jpg"));
		lblNewLabel_1.setBounds(156, 117, 184, 205);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("SPARA");
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(433, 413, 97, 25);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnJanaAndersson = new JEditorPane();
		dtrpnJanaAndersson.setBackground(new Color(204, 204, 255));
		dtrpnJanaAndersson.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 17));
		dtrpnJanaAndersson.setText("Jana Andersson");
		dtrpnJanaAndersson.setBounds(407, 117, 121, 22);
		contentPane.add(dtrpnJanaAndersson);
		
		JLabel lblNewLabel = new JLabel("Namn:");
		lblNewLabel.setBounds(352, 116, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Adress:");
		lblNewLabel_3.setBounds(352, 152, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Postnr:");
		lblNewLabel_4.setBounds(352, 181, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ort:");
		lblNewLabel_5.setBounds(352, 210, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Personnr:");
		lblNewLabel_6.setBounds(352, 239, 43, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\telephone46 (1).png"));
		lblNewLabel_7.setBounds(352, 268, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		editorPane_1.setBackground(new Color(204, 204, 255));
		editorPane_1.setForeground(Color.BLACK);
		editorPane_1.setBounds(407, 146, 123, 22);
		contentPane.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(new Color(204, 204, 255));
		editorPane_2.setBounds(407, 175, 123, 22);
		contentPane.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(new Color(204, 204, 255));
		editorPane_3.setBounds(407, 204, 123, 22);
		contentPane.add(editorPane_3);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBackground(new Color(204, 204, 255));
		editorPane_4.setBounds(407, 233, 123, 22);
		contentPane.add(editorPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBackground(new Color(204, 204, 255));
		editorPane_5.setBounds(407, 262, 123, 22);
		contentPane.add(editorPane_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\mail59.png"));
		lblNewLabel_8.setBounds(352, 297, 56, 24);
		contentPane.add(lblNewLabel_8);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBackground(new Color(204, 204, 255));
		editorPane_6.setBounds(407, 300, 121, 22);
		contentPane.add(editorPane_6);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(25, 13, 119, 26);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("ARKIV");
		mnNewMenu.setSelectedIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\tool1285.png"));
		mnNewMenu.setBackground(new Color(0, 0, 0));
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\tool1285.png"));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\printer67.png"));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("AVSLUTA");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_1.add(mnNewMenu_2);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(407, 13, 119, 26);
		contentPane.add(menuBar_1);
		
		JMenu mnNewMenu_3 = new JMenu("MEDLEM");
		mnNewMenu_3.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\social20.png"));
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_3.setBounds(170, 13, 123, 24);
		contentPane.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Ny medlem");
		mnNewMenu_3.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Hitta medlem");
		mnNewMenu_5.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\magnifying-glass32.png"));
		mnNewMenu_4.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("HJ\u00C4LP");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_6.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\question13.png"));
		mnNewMenu_6.setBounds(320, 13, 123, 25);
		contentPane.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("Om programmet");
		mnNewMenu_6.add(mnNewMenu_7);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\sport.jpg"));
		lblNewLabel_2.setBounds(0, 0, 554, 451);
		contentPane.add(lblNewLabel_2);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
