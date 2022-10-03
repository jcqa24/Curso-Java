package main;

import java.awt.Color;
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
	JComboBox<String> combo1;
	


	public gui(){
		m = new JFrame();
		p1 = new JPanel();
		combo1 = new JComboBox<String>();
		m.setLayout(null);
		
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Rojo");
		combo1.addItem("Negro");
		
		p1.setBounds(0,0,500,500);
		p1.setBackground(Color.green);
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		combo1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String op = (String) combo1.getSelectedItem();
				int i = combo1.getSelectedIndex();
				
				
				switch(i) {
				case 0:
					p1.setBackground(Color.green);
					break;
				case 1:
					p1.setBackground(Color.blue);
					break;
				case 2:
					p1.setBackground(Color.red);
					break;
				case 3:
					p1.setBackground(Color.black);
					break;
				
				}
				
			}
			
			
		});
		
		
		
		p1.add(combo1);
		
		m.add(p1);
		

		
	}
	
}
