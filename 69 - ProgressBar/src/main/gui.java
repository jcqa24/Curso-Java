package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class gui extends JFrame {

	JFrame m;
	JButton b1,b2;
	JProgressBar barra;
	
	

	public gui() {
		m = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		barra = new JProgressBar();
		
		
		m.setLayout(null);
		m.setBounds(200, 200, 500, 500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);

		b1.setBounds(55, 400, 100, 30);
		b1.setText("Correcto");
		b2.setBounds(200, 400, 100, 30);
		b2.setText("Incorrecta");
		
		barra.setBounds(50,50,400,50);
		
		barra.setStringPainted(true);
		
		barra.setValue(100);
				
		barra.setOrientation(0);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(barra.getValue() < 100) {
					barra.setValue(barra.getValue() +10);
				}
				
				/**
				Thread t1 = new Thread() {
					
					public void run() {
						
						while(barra.getValue() <= 100) {
							barra.setValue(barra.getValue() + 10);
							try {
								Thread.sleep(250);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
					}
					
				};
				
				t1.start();
				*/
				
			}

		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				barra.setValue(barra.getValue() - 10);
				
				if(barra.getValue() == 0) {
					JOptionPane.showMessageDialog(m, "El juego termino");
				}
			}
		});

		
		m.add(barra);
		m.add(b1);
		m.add(b2);		
	}

}
