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
	JLabel l1;
	JLabel l2;
	JSlider s1;

	


	public gui(){
		m = new JFrame();
		l1 = new JLabel();
		l2 = new JLabel();
		s1 = new JSlider();
		
		m.setLayout(null);		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		s1.setBounds(50,100,400,50);
		s1.setPaintLabels(true);
		s1.setPaintTicks(true);
		s1.setMajorTickSpacing(10);
		s1.setMaximum(80);
		s1.setMinimum(20);
		s1.setValue(20);
		
		l1.setBounds(50,50,100,50);
		l1.setText("Tu edad es: ");
		l2.setBounds(150,50,50,50);
		l2.setText("20");
		
		
		s1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int edad = s1.getValue();
				
				l2.setText(String.valueOf(edad));
				
			}
		});


		
		m.add(l1);
		m.add(l2);
		m.add(s1);
		

		
	}
	
}
