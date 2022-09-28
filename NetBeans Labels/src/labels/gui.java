package labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui extends JFrame {
	JFrame main;
	JButton boton;
	JLabel texto1;
	boolean visible;
	
	public gui() {
		visible = false;
		main = new JFrame();
		boton = new JButton();
		texto1 = new JLabel();
		main.setLayout(null);
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setVisible(true);
		main.setBounds(200, 200, 300, 600);
		boton.setBounds(95, 450, 100, 50);
		boton.setText("Click aqui");
		
		texto1.setText("Hola Mundo");
		texto1.setBounds(95,200,150,50);
		texto1.setFont(new Font("Arial",Font.PLAIN,16));
		texto1.setForeground(Color.BLUE);
		texto1.setVisible(false);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				texto1.setText("SUSCRIBETE!!!");
				if(visible) {
					texto1.setVisible(false);
					visible = false;
				}else {
					texto1.setVisible(true);
					visible = true;
				}
				
				
			}
			
		});
		
		
		main.add(boton);
		main.add(texto1);
		
		
	}

}
