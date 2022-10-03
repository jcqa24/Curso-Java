package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class gui extends JFrame {

	JFrame m;
	JPanel p1;
	JLabel l1;
	JToggleButton b1;

	


	public gui(){
		m = new JFrame();
		p1 = new JPanel();
		l1 = new JLabel();
		b1 = new JToggleButton();

		m.setLayout(null);
		p1.setLayout(null);
		
		
		

		p1.setBounds(0,0,500,500);
		p1.setBackground(Color.black);
		
		
		b1.setBounds(200,230,75,40);
		b1.setText("OFF");
		b1.setBackground(Color.gray);
		
		l1.setBounds(130,100,450,150);
		l1.setText("Luces Apagadas");
		l1.setFont(new Font("Fira Code", Font.PLAIN, 24));
		l1.setForeground(Color.white);
		
		
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);


		
		
		p1.add(l1);
		p1.add(b1);
		
		
		m.add(p1);
		

		
	}
	
}
