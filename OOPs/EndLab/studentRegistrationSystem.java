import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;

import java.awt.*;
import java.swing.*;

public class studentRegistrationSystem {

	private JFrame frame;
	private JTextField textField_rollno;
	private JTextField textField_name;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String args []) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentRegistrationSystem window = new studentRegistrationSystem();
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
	public studentRegistrationSystem() {
		initialize();
	}
	
	String checkBoxData[] = {"Date of Birth","10th Certificate", "12th Certificate","College ID card","Aadhar Card","Passport" };
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 880, 586);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 846, 59);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(271, 0, 294, 59);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 81, 420, 350);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_rollno = new JLabel("ROLL NO");
		lbl_rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_rollno.setBounds(21, 47, 115, 34);
		panel_1.add(lbl_rollno);
		
		textField_rollno = new JTextField();
		textField_rollno.setBounds(172, 44, 210, 37);
		panel_1.add(textField_rollno);
		textField_rollno.setColumns(10);
		
		JComboBox comboBox = new JComboBox(checkBoxData);
		comboBox.setBounds(172, 178, 210, 38);
		panel_1.add(comboBox);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(172, 110, 210, 37);
		panel_1.add(textField_name);
		
		JLabel lbl_name = new JLabel("NAME");
		lbl_name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_name.setBounds(21, 110, 115, 34);
		panel_1.add(lbl_name);
		
		JLabel lbl_idProof = new JLabel("PROOF OF ID");
		lbl_idProof.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_idProof.setBounds(21, 182, 115, 34);
		panel_1.add(lbl_idProof);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(440, 81, 416, 350);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 396, 328);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ROLL NO", "NAME", "PROOF OF ID"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(83);
		table.getColumnModel().getColumn(1).setPreferredWidth(182);
		table.getColumnModel().getColumn(2).setPreferredWidth(128);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 442, 846, 96);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAddRecord = new JButton("ADD RECORD");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {(Integer.parseInt(textField_rollno.getText())),textField_name.getText(), comboBox.getSelectedItem()} );
				
			}
				
		});
		btnAddRecord.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddRecord.setBounds(41, 24, 159, 49);
		panel_3.add(btnAddRecord);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_rollno.setText("");
				textField_name.setText("");

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(270, 24, 116, 49);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Record deleted successfully!");
				}
				else
				{
					JOptionPane.showConfirmDialog(btnDelete, "DELETE ERROR");
				}	
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(466, 24, 116, 49);
		panel_3.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(655, 24, 116, 49);
		panel_3.add(btnExit);
	}
}
