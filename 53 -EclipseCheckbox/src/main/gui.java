package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class gui extends JFrame {

	JFrame m;
	JButton b1;
	JLabel l1;
	JRadioButton a,b,c,si,no;
	ButtonGroup g1,g2;
	
	

	public gui(){
		m = new JFrame();
		m.setLayout(null);
		b1 = new JButton();
		l1 = new JLabel();
		a =  new JRadioButton();
		b =  new JRadioButton();
		c =  new JRadioButton();
		si =  new JRadioButton();
		no =  new JRadioButton();
		g1 = new ButtonGroup();
		g2 = new ButtonGroup();
		
		g1.add(a);
		g1.add(b);
		g1.add(c);
		
		g2.add(si);
		g2.add(no);
		
		
		
		
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
		b1.setBounds(200, 400, 100, 50);
		b1.setText("Continuar");
		
		
		a.setBounds(50,100,100,50);
		b.setBounds(50,200,100,50);
		c.setBounds(50,300,100,50);
		
		si.setBounds(300,200,100,50);
		no.setBounds(300,100,100,50);
		
		
		a.setText("Opcion A");
		b.setText("Opcion B");
		c.setText("Opcion C");
		
		si.setText("Si");
		no.setText("No");
		
		
		l1.setText("Selecciona una opcion");
		l1.setBounds(50,50, 200, 50);
		
		
		
		m.add(b1);
		m.add(l1);
		m.add(a);
		m.add(b);
		m.add(c);
		m.add(si);
		m.add(no);
		
		

		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(a.isSelected())
					JOptionPane.showMessageDialog(null, "Seleccionaste la opcion A");
				else if(b.isSelected())
					JOptionPane.showMessageDialog(null, "Seleccionaste la opcion B");
				else if(c.isSelected())
					JOptionPane.showMessageDialog(null, "Seleccionaste la opcion C");
				else
					JOptionPane.showMessageDialog(null, "Debes seleccionar una opcion");
		}
	});
		
	
	
		
	}
	
}
