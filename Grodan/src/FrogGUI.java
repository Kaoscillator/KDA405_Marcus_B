import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexten;
	private Frog[] myFrogs;/**array*/
	
	private ArrayList <Frog> frogArmy = new ArrayList<Frog>89,
	


	/**
	 * Launch the application. VAriabler
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrogGUI frame = new FrogGUI();
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
	public FrogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		frog frog1 = newFrog (1,"Björn",100);
		
		String frog1Name = frog1.getName();
		int frogAge = frog1.getAge[];
	    int frogSize = frog1.getSize();
	    int frogSize = frog1.getSize();
	    
	    myFrogs = new Frog[3];
	    
	    myFrogs [0] = new Frog(70, "Joel", 1);
	    myFrogs [1] = new Frog(20,"Grodanboll",40);
	    myFrogs [2] = new Frog(10, "minigrodan",1);
	    
	    
	    	
	    	for(int i=0; i <100>; i++)}
	 frogArmy.add(new frog(1,"identiskgroda",20));
	    
}
		
		
		
		
		txtTexten = new JTextField();
		txtTexten.setText("frog1Name");
		txtTexten.setBounds(158, 130, 642, 276);
		contentPane.add(txtTexten);
		txtTexten.setColumns(10);
		
		for (int i = 0; i <myFrogs.length; i = i+1){
			txtText.setText(myFrogs[i].getName()+ " ");
		}
		
	
	}
}
