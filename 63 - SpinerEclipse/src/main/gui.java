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
	JLabel l3;
	JButton b1;
	JSpinner s1;
	JSpinner s2;
	SpinnerModel m1;
	SpinnerModel m2;

	public gui(){
		m = new JFrame();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		b1 = new JButton();
		
		m1 = new SpinnerNumberModel(10.0, 5.0, 10.0, 0.1);
		m2 = new SpinnerNumberModel(10.0, 5.0, 10.0, 0.1);
		
		s1 = new JSpinner(m1);
		s2 = new JSpinner(m2);
		
		s1.setBounds(250,60,50,25);
		s2.setBounds(250,160,50,25);
	
		
		m.setLayout(null);		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
		l1.setBounds(50,50,300,50);
		l1.setText("Tu primer calificacion");
		l2.setBounds(50,150,300,50);
		l2.setText("Tu segunda calificacion");
		l3.setBounds(50,250,300,50);
		l3.setText("Tu promedio es: ");
		
		b1.setBounds(175,400,150,25);
		b1.setText("Calcular promedio");
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double c1,c2;
				c1 = (Double) s1.getValue();
				c2 = (Double) s2.getValue();
				l3.setText("Tu promedio es: "+(c1+c2)/2);
				
				
			}
		});

		
				
		m.add(l1);
		m.add(l2);
		m.add(l3);
		m.add(b1);
		m.add(s1);
		m.add(s2);

		

		
	}
	
}
