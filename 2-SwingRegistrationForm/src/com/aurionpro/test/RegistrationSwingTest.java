package com.aurionpro.test;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationSwingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("Registration from");

		JLabel name, email, password, confirmpassword, gender, city;
		JTextField tname, temail, tpassword, tconfirmpassword;

		name = new JLabel("Name:");
		tname = new JTextField();
		name.setBounds(50, 50, 100, 30);
		tname.setBounds(50, 80, 150, 30);

		email = new JLabel("Email:");
		temail = new JTextField();
		email.setBounds(50, 120, 100, 30);
		temail.setBounds(50, 150, 150, 30);

		password = new JLabel("Password:");
		tpassword = new JTextField();
		password.setBounds(50, 210, 100, 30);
		tpassword.setBounds(50, 240, 150, 30);

		confirmpassword = new JLabel("Confirm Password:");
		tconfirmpassword = new JTextField();
		confirmpassword.setBounds(50, 280, 100, 30);
		tconfirmpassword.setBounds(50, 310, 150, 30);

		gender = new JLabel("Gender:");
		gender.setBounds(50, 350, 100, 30);
		
		city= new JLabel("City");
		city.setBounds(50,450,100,30);

		JRadioButton r1 = new JRadioButton("A) Male");
		JRadioButton r2 = new JRadioButton("B) Female");

		r1.setBounds(50, 380, 100, 30);
		r2.setBounds(50, 400, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Mumbai");
		l1.addElement("Chennai");
		l1.addElement("Pune");
		l1.addElement("New York");
		JList<String> list = new JList<>(l1);
        list.setBounds(100,100, 75,75);  


		frame.add(name);
		frame.add(tname);
		frame.add(email);
		frame.add(temail);
		frame.add(password);
		frame.add(tpassword);
		frame.add(confirmpassword);
		frame.add(tconfirmpassword);
		frame.add(gender);
		frame.add(r1);
		frame.add(r2);
		frame.add(city);
		frame.add(list);

		email = new JLabel("EMail");
		password = new JLabel("Password");
		confirmpassword = new JLabel("Confirm Password");
		gender = new JLabel("Gender");
		city = new JLabel("City");

		frame.setSize(1000, 1000);// 400 width and 500 height
		frame.setLayout(null);// using no layout managers
		frame.setVisible(true);// making the frame visible

	}

}
