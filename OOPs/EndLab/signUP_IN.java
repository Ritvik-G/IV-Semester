import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class signUP_IN {
	// added these static elements...
	public static ArrayList<String> Name = new ArrayList<>();
	public static ArrayList<String> Username = new ArrayList<>();
	public static ArrayList<String> Password = new ArrayList<>();
	// static keyword makes the variables the properties of the class itself not the object instance
	private static int theSize = 0; // denotes the total number of entries in the above arrays
	
	public boolean isNamePresent(String Name) {
		for(int i=0; i<theSize; i++) {
			if(this.Name.get(i).equals(Name))
				return true;
		}
		return false;
	}
	
	public boolean isUsernamePresent(String Username) {
		for(int i=0; i<theSize; i++) {
			if(this.Username.get(i).equals(Username))
				return true;
		}
		return false;
	}
	
	public int insertRecord(String Name, String Username, String Password) {
		if(isNamePresent(Name))
			return -1; // Name already present! not inserted\
		else if (isUsernamePresent(Username))
			return -2; // User Name already present! not inserted\
		this.Name.add(Name);
		this.Username.add(Username);
		this.Password.add(Password);
		theSize++;
		return 0; // success! Record inserted..
	}
	
	public int checkLogin(String Username, String Password) {
		// this returns the index of the record if present else returns -1;
		int i = 0;
		while(i<theSize) {
			if(this.Username.get(i).equals(Username))
				break;
			i++;
		}
		if(i == theSize)
			return -1; // User Name not found
		if(this.Password.get(i).equals(Password))
			return i; // successful login
		return -1; // wrong password
	}
	
	
	
	JFrame frame;  // removed the private keyword

	/**
	 * Launch the application.
	 */
	public static void main(String args []) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUP_IN window = new signUP_IN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signUP_IN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
				signUP_frame obj1 = new signUP_frame();
				obj1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(92, 98, 160, 86);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signIN_frame obj2 = new signIN_frame();
				obj2.setVisible(true);
			}
		});
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignIn.setBounds(339, 98, 167, 86);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(243, 239, 135, 52);
		frame.getContentPane().add(btnNewButton_1);
	}
}
