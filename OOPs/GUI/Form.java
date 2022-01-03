// A very rudimentary program to give the front-end GUI look of a login form
import java.io.*;
import java.awt.*;

class Form{
	public static void main(String [] args){
	
		// Declaration of Frame called Login Form 
		Frame f = new Frame("Login Form");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		
		// Labels declaration
		Label l2 = new Label("Username: ");
		Label l3 = new Label("Password: ");
		f.add(l2);
		f.add(l3);
		l2.setBounds(10,150,100,100);
		l3.setBounds(10,250,100,100);
		
		// Text input fields for username and password
		TextField t1 = new TextField("Enter Username");
		TextField t2 = new TextField("Enter Password");
		f.add(t1);
		f.add(t2);
		t1.setBounds(150,175,250,50);
		t2.setBounds(150,275,250,50);
		
		// Button for submit
		Button b1 = new Button("Submit");
		f.add(b1);
		b1.setBounds(175,350,200,50);
		b1.setBackground(Color.pink);
		
		// Changing background color
		f.setBackground(Color.cyan);
	}
}
