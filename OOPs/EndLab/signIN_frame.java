import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signIN_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signIN_frame frame = new signIN_frame();
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
	public signIN_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(179, 96, 152, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(179, 230, 152, 46);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(372, 103, 239, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(372, 237, 239, 39);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUP_IN obj = new signUP_IN();
				String Username = textField.getText();
				String Password = passwordField.getText();
				int i = obj.checkLogin(Username, Password);
				if( i == -1) {
					JOptionPane.showMessageDialog(null,  "Incorrect Password or Username!"); 
				}
				else {
					String Name = obj.Name.get(i);
					JOptionPane.showMessageDialog(null, "Welcome " + Name);
				}
					
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(179, 355, 175, 62);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("BACK TO HOME");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnExit.setBounds(470, 355, 224, 62);
		contentPane.add(btnExit);
	}
}
