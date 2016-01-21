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
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setForeground(Color.GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Andersson", "Jan"},
				{"Bengtsson", "Sanne"},
				{"Danske", "Liridon"},
				{"Hansson", "Bruno"},
				{"Herald", "Poppy"},
				{"Isaksson", "Lars"},
				{"Jazz", "Toni"},
				{"Kittel", "Tom"},
				{"Mauritzon", "Karin"},
				{"M\u00E5rtensson", null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBounds(15, 43, 100, 205);
		contentPane.add(table);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(15, 43, 100, 205);
		contentPane.add(scrollPane);
		
		JMenu mnArkiv = new JMenu("ARKIV");
		mnArkiv.setBounds(15, 13, 331, 24);
		contentPane.add(mnArkiv);
		
		JLabel lblJanAndersson = new JLabel("Jan Andersson");
		lblJanAndersson.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 13));
		lblJanAndersson.setBounds(407, 106, 106, 16);
		contentPane.add(lblJanAndersson);
		
		JLabel lblNewLabel = new JLabel("620809-4098");
		lblNewLabel.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 13));
		lblNewLabel.setBounds(407, 135, 106, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblSrmlandsgatan = new JLabel("S\u00F6rmlandsgatan 12");
		lblSrmlandsgatan.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 13));
		lblSrmlandsgatan.setBounds(407, 164, 135, 16);
		contentPane.add(lblSrmlandsgatan);
		
		JLabel lblMalm = new JLabel("214 33 Malm\u00F6");
		lblMalm.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 13));
		lblMalm.setBounds(407, 193, 106, 16);
		contentPane.add(lblMalm);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\KGB\\Documents\\eclipse\\profil.jpg"));
		lblNewLabel_1.setBounds(197, 43, 184, 205);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblJananderssongmailcom = new JLabel("jan.andersson@gmail.com");
		lblJananderssongmailcom.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 13));
		lblJananderssongmailcom.setBounds(407, 222, 147, 16);
		contentPane.add(lblJananderssongmailcom);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
