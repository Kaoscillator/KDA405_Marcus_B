import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class housegui extends JFrame {

	private JPanel contentPane; 
	private House [] myHouses;
	private ArrayList<House> manyHouses = new ArrayList<House>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					housegui frame = new housegui();
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
	public housegui() {
		getContentPane().setLayout(null);
		
		
		
		
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 887, 627);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(null);
		
		
	House myHouse1 = new House (2003,500);
	House myHouse2 = new House (1990,600);
	House myHouse3 = new House (2014,800);
	
	
	System.out.println("Hus ett är byggt " + myHouse1.getYearBuilt() + " som är " + myHouse1.getSize()+ " stort.");
	System.out.println("Hus två är byggt " + myHouse2.getYearBuilt() + " som är " + myHouse2.getSize()+ " stort.");
	System.out.println("Hus tre är byggt " + myHouse3.getYearBuilt() + " som är " + myHouse3.getSize()+ " stort.");
	
	textArea.append("Hus ett är byggt " + myHouse1.getYearBuilt() + " som är " + myHouse1.getSize()+ " stort." + "\n");
	textArea.append("Hus två är byggt " + myHouse2.getYearBuilt() + " som är " + myHouse2.getSize()+ " stort." + "\n");
	textArea.append("Hus tre är byggt " + myHouse3.getYearBuilt() + " som är " + myHouse3.getSize()+ " stort." + "\n");
	
	myHouses = new House [10];
	
	myHouses [0] = new House (1857, 200);/*arrayList*/
	myHouses [1]= new House (1950, 234);
	myHouses [2]= new House (1967, 150);
	myHouses [3]= new House (1987, 167);
	myHouses [4]= new House (1965, 50);
	myHouses [5]= new House (1975, 59);
	myHouses [6]= new House (1987, 300);
	myHouses [7]= new House (2000, 34);
	myHouses [8]= new House (2008, 500);
	myHouses [9]= new House (2009, 657);
	
	for (int i = 0; i<10; i++) {
		
		textArea.append("Hus nummer" + (i+1) + "Är byggt" + String.valueOf(myHouses[i].getYearBuilt()) + "och är" + String.valueOf(myHouses[i].getSize()) + "kvm" + "\n");
		
		
	}
	
	Random random = new Random();
	
	for (int i = 0; i<100; i++) {
		
		int size = random.nextInt((1000-10) + 1) +10;
		int year = random.nextInt((2015-1800) + 1) +1800;
		
		manyHouses.add(new House(year, size));
		
		textArea.append("Hus nummer " + (i+1) + "Är byggt " + manyHouses.get(i).getYearBuilt() + "och är " + manyHouses.get(i).getSize() + "kvm" + "\n");
	}
	}
	
	}





