package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class gui extends JFrame {
	JFrame main;
	JButton boton, boton2;
	JLabel texto1, texto2;
	JTextField alt,pes;
	boolean visible;
	
	public gui() {
		visible = false;
		main = new JFrame();
		boton = new JButton();
		boton2 = new JButton();
		texto1 = new JLabel();
		texto2 = new JLabel();
		alt = new JTextField();
		pes = new JTextField();

		main.setLayout(null);
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setVisible(true);
		main.setBounds(200, 200, 400, 400);
		boton.setBounds(50, 300, 100, 50);
		boton.setText("Calcular");
		boton2.setBounds(250, 300, 100, 50);
		boton2.setText("Borrar");
		
		alt.setBounds(200,150,150,40);
		pes.setBounds(200,50,150,40);
			
		
		
		texto1.setText("Peso (KG)");
		texto1.setBounds(50,50,150,50);
		texto2.setText("Altura (m)");
		texto2.setBounds(50,150,150,50);
		
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double imc,a,p;
				
				a = Double.valueOf(alt.getText());
				p = Double.valueOf(pes.getText());
				
				imc = p / Math.pow(a, 2);
				
				JOptionPane.showMessageDialog(null, "Tu imc es "+imc);
			}			
		});
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				alt.setText("");
				pes.setText("");
				
			}			
		});
		
		
		main.add(boton);
		main.add(boton2);
		main.add(alt);
		main.add(pes);
		main.add(texto1);
		main.add(texto2);
		
		
	}

}
