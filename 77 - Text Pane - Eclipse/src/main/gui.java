package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class gui extends JFrame {

	JFrame m;
	JSpinner tam;
	JComboBox<String> fuente,color;
	SpinnerModel m1;
	JTextPane texto;
		


	public gui(){
		m = new JFrame();

		m1 = new SpinnerNumberModel(12,12,24,1);
		tam = new JSpinner(m1);
		fuente = new JComboBox<String>();
		color = new JComboBox<String>();
		
		texto = new JTextPane();
		
		texto.setBounds(25,100,750,500);
		texto.setContentType("text/plain");
		
		tam.setBounds(25,20,60,35);
		fuente.setBounds(135,20,100,35);
		color.setBounds(285,20,100,35);
		
		fuente.addItem("SansSerif");
		fuente.addItem("Fira Code");
		fuente.addItem("Hack");
		
		color.addItem("Negro");
		color.addItem("Verde");
		color.addItem("Azul");
		color.addItem("Rojo");
				
		tam.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				texto.setFont(new Font(texto.getFont().getFamily(),Font.PLAIN, (int) tam.getValue()));
				
			}
		});
		
		fuente.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				texto.setFont(new Font(fuente.getSelectedItem().toString(),Font.PLAIN,texto.getFont().getSize()));
				
			}
		});
		
		color.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int opc = color.getSelectedIndex();
				
				switch (opc) {
				case 0:
					texto.setForeground(Color.BLACK);
					break;
				case 1:
					texto.setForeground(Color.GREEN);
					break;
				case 2:
					texto.setForeground(Color.BLUE);
					break;
				case 3:
					texto.setForeground(Color.RED);
					break;
				default:
					break;
				}
				
				
			}
		});
		
		
		m.setLayout(null);
		m.setVisible(true);
	
		m.setBounds(0,0,800,700);
		
		m.add(tam);
		m.add(color);
		m.add(fuente);
		m.add(texto);
		
	}
	
	 
	
}
