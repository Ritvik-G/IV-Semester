import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class signUP_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	static signIN_frame frame;
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUP_frame frame = new signUP_frame();
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
	public signUP_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(156, 52, 112, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setBounds(150, 133, 118, 48);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(151, 202, 127, 48);
		contentPane.add(lblPassword);
		
		textField_name = new JTextField();
		textField_name.setBounds(371, 59, 311, 34);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		textField_username = new JTextField();
		textField_username.setColumns(10);
		textField_username.setBounds(371, 140, 311, 34);
		contentPane.add(textField_username);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUP_IN obj = new signUP_IN();
				int retVal = obj.insertRecord(textField_name.getText(), textField_username.getText(), passwordField.getText());
				if(retVal==-1)
					JOptionPane.showMessageDialog(null, "Name already exists!");
				else if(retVal==-2)
					JOptionPane.showMessageDialog(null,"Username already exists");
				else
					JOptionPane.showMessageDialog(null, "Successful SIGN UP!");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(166, 295, 185, 60);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(371, 209, 314, 34);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("BACK TO HOME");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(489, 295, 193, 58);
		contentPane.add(btnNewButton_1);
	}
}
