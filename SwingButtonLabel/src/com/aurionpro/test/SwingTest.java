package com.aurionpro.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTest {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Click");
		JTextField tf1, tf2;
		button1.setBounds(50, 250, 100, 40);

		JLabel label1, label2;
		tf1 = new JTextField(" Name");
		tf2 = new JTextField("Surname");

		label1 = new JLabel("First NAME");
		label2 = new JLabel("SurNAME");

		label1.setBounds(50, 50, 100, 60);
		label2.setBounds(50, 150, 100, 60);

		tf1.setBounds(50, 100, 200, 30);
		tf2.setBounds(50, 200, 200, 30);
		frame.add(label1);
		frame.add(label2);
		frame.add(button1);
		frame.add(tf1);
		frame.add(tf2);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel l3 = new JLabel("Form Submited");
				l3.setBounds(50, 250, 100, 60);
				frame.add(l3);

			}
		});

		frame.setSize(400, 500);// 400 width and 500 height

		frame.setLayout(null);// using no layout managers
		frame.setVisible(true);// making the frame visible

	}

}
