package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.MaskFormatter;

public class gui extends JFrame {

	JFrame m;
	JLabel l1;
	JLabel l2;
	JButton b1;
	JFormattedTextField fecha;
	
	//99-99-99-99-99
	
	public gui() throws Exception{
		m = new JFrame();
		l1 = new JLabel();
		l2 = new JLabel();
		b1 = new JButton();

		fecha = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		
		m.setLayout(null);		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
		fecha.setBounds(50, 150, 200, 50);
		
		l1.setBounds(50,50,300,50);
		l1.setText("Ingresa tu fecha de nacimiento");
		l2.setBounds(50,250,300,50);
		l2.setText("Tu edad es :");

		
		b1.setBounds(175,400,150,25);
		b1.setText("Calcular edad");
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					Date f1 = (Date) fecha.getValue();
					
					LocalDate f2 = LocalDate.now();
					
					LocalDate f3 = f1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					
					long edad = ChronoUnit.YEARS.between(f3, f2);
					
					l2.setText("Tu edad es: "+edad);
			}
		});

		
				
		m.add(l1);
		m.add(l2);
		m.add(b1);
		m.add(fecha);


		

		
	}
	
}
