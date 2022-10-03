package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui extends JFrame {

	JFrame m;
	JButton clear, send;
	JLabel l1;
	JTextArea a1;


	
	public gui(){
		m = new JFrame();
		m.setLayout(null);
		clear = new JButton();
		send = new JButton();
		l1 = new JLabel();
		a1 = new JTextArea();
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		a1.setBounds(50,100,400, 250);
		
		clear.setBounds(200, 400, 100, 50);
		clear.setText("Limpiar");
		
		send.setBounds(350, 400, 100, 50);
		send.setText("Enviar");
		
		l1.setText("Ingresa tu comentario:");
		l1.setBounds(50,50, 200, 50);
		

		
		m.add(clear);
		m.add(send);
		m.add(l1);
		m.add(a1);

	
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		
					int i;
					String [] msn = a1.getText().split("\n");
					//for(i=0;i<msn.length;i++)
						System.out.println(msn[4]);
					
					System.out.println("Ingresaste " + msn.length+" filas ");
			}
		});
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a1.setText("");
		}
	});
		
	}
	
}
