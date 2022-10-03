package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class gui extends JFrame {

	JFrame m;
	JButton b1;
	JLabel l1;
	JCheckBox c1;

	public gui(){
		m = new JFrame();
		m.setLayout(null);
		b1 = new JButton();
		l1 = new JLabel();
		c1 = new JCheckBox();
		
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		c1.setBounds(100, 300, 300, 100);
		c1.setText("Acepto los terminos y condiciones");
		
		b1.setBounds(200, 400, 100, 50);
		b1.setText("Continuar");
		b1.setEnabled(false);
		
		l1.setText("Debes aceptar los terminos");
		l1.setBounds(50,50, 200, 50);
		
		
		m.add(b1);
		m.add(l1);
		m.add(c1);
		
		
		c1.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if(c1.isSelected()) {
					l1.setText("Ya aceptaste los terminos");
					b1.setEnabled(true);
				}else {
					l1.setText("Debes aceptar los terminos");
					b1.setEnabled(false);
				}
				
			}
			
			
			
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(! c1.isSelected() ) {
					JOptionPane.showMessageDialog(null, "Debes aceptar los terminos y condiciones");
				}
		}
	});
		
	
	
		
	}
	
}
