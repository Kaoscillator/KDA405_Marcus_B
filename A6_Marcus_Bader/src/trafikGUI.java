import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class trafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fr�nField;
	private JTextField tillField;
	private JTextField stationField;
	private JTextArea stationArea;
	private JTextArea tripArea;

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
		setBounds(100, 100, 707, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		fr�nField = new JTextField();
		fr�nField.setHorizontalAlignment(SwingConstants.CENTER);
		fr�nField.setText("FR\u00C5N");
		fr�nField.setForeground(new Color(0, 0, 51));
		fr�nField.setFont(new Font("Calibri", Font.PLAIN, 19));
		fr�nField.setBounds(86, 111, 127, 34);
		contentPane.add(fr�nField);
		fr�nField.setColumns(10);

		tillField = new JTextField();
		tillField.setHorizontalAlignment(SwingConstants.CENTER);
		tillField.setText("TILL");
		tillField.setForeground(new Color(0, 0, 51));
		tillField.setFont(new Font("Calibri", Font.PLAIN, 19));
		tillField.setColumns(10);
		tillField.setBounds(86, 175, 127, 33);
		contentPane.add(tillField);

		JLabel lblVljHllplats = new JLabel("V\u00E4lj H\u00E5llplats");
		lblVljHllplats.setForeground(new Color(0, 102, 153));
		lblVljHllplats.setHorizontalAlignment(SwingConstants.CENTER);
		lblVljHllplats.setFont(new Font("Calibri", Font.BOLD, 20));
		lblVljHllplats.setBounds(10, 56, 265, 42);
		contentPane.add(lblVljHllplats);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(335, 30, 329, 195);
		contentPane.add(scrollPane);

		tripArea = new JTextArea();
		tripArea.setForeground(UIManager.getColor("CheckBox.foreground"));
		scrollPane.setViewportView(tripArea);
		tripArea.setRows(20);
		tripArea.setColumns(10);

		JButton s�kButton = new JButton("S\u00F6k");
		s�kButton.setForeground(new Color(0, 102, 153));
		s�kButton.setBackground(Color.WHITE);
		s�kButton.setToolTipText("");
		s�kButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				tripArea.setText("Hittar dina resor...");
				new TripTr�d().start();

			}

		});
		s�kButton.setFont(new Font("Calibri", Font.BOLD, 26));
		s�kButton.setBounds(86, 228, 127, 42);
		contentPane.add(s�kButton);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(335, 241, 329, 195);
		contentPane.add(scrollPane_1);

		stationArea = new JTextArea();
		stationArea.setForeground(UIManager.getColor("CheckBox.foreground"));
		scrollPane_1.setViewportView(stationArea);
		stationArea.setRows(20);
		stationArea.setColumns(10);

		stationField = new JTextField();
		stationField.setHorizontalAlignment(SwingConstants.CENTER);
		stationField.setText("RESM\u00C5L");
		stationField.setFont(new Font("Calibri", Font.PLAIN, 19));
		stationField.setForeground(new Color(0, 0, 51));
		stationField.setColumns(10);
		stationField.setBounds(86, 293, 127, 34);
		contentPane.add(stationField);

		JButton stationButton = new JButton("S\u00F6k");
		stationButton.setForeground(new Color(0, 102, 153));
		stationButton.setBackground(Color.WHITE);
		stationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stationArea.setText("S�ker...");
				new StationTr�d().start();

			}
		});
		stationButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 26));
		stationButton.setBounds(86, 354, 127, 42);
		contentPane.add(stationButton);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
				lblNewLabel.setIcon(new ImageIcon(trafikGUI.class.getResource("/Bild/Sk\u00E5netrafiken1.png")));
				lblNewLabel.setBounds(0, 0, 689, 485);
				contentPane.add(lblNewLabel);
		
				JPanel panel = new JPanel();
				panel.setBackground(Color.WHITE);
				panel.setBounds(0, 0, 689, 485);
				contentPane.add(panel);
	}

	private class StationTr�d extends Thread {
		@Override
		public void run() {
			String hittaStation = stationField.getText();// tar str�ngen fr�n
															// stationfield
			System.out.println("// Stations when searching for stations containing \"Malm\"");
			ArrayList<Station> searchStations = new ArrayList<Station>(); // S�tter
																			// i
																			// g�ng
																			// arraylistan
																			// och
																			// s�ker
			searchStations.addAll(Parser.getStationsFromURL(hittaStation));
			stationArea.setText("");// Clearar s�krutan innan den b�rjar visa
									// s�kningen
			for (Station s : searchStations) {// s�tter ig�ng
				stationArea.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
			}

		}
	}

	private class TripTr�d extends Thread {
		@Override
		public void run() {

			String fr�n = fr�nField.getText();
			String till = tillField.getText();
			String searchURL = Constants.getURL(fr�n, till, 5);
			Journeys journeys = Parser.getJourneys(searchURL);
			tripArea.setText("");
			for (Journey journey : journeys.getJourneys()) {
				System.out.print(journey.getStartStation() + " - ");
				System.out.print(journey.getEndStation());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);
				tripArea.append(" Departs " + time + " that is in " + journey.getTimeToDeparture()
						+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late" + "\n");

			}
		}
	}

}
