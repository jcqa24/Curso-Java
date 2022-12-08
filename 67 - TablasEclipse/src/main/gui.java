package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class gui extends JFrame {

	JFrame m;
	JLabel l1;
	JLabel l2;
	JTextField c1, c2;
	JButton ba, bd, bm;
	JTable t1;
	DefaultTableModel mt;
	JScrollPane s1;
	

	public gui() {
		m = new JFrame();
		l1 = new JLabel();
		l2 = new JLabel();
		c1 = new JTextField();
		c2 = new JTextField();
		ba = new JButton();
		bd = new JButton();
		bm = new JButton();
		mt = new DefaultTableModel();
		s1 = new JScrollPane();
		
		String ids[] = {"Calificacion1","Calificacion 2","Promedio"};
		mt.setColumnIdentifiers(ids);
		
		t1 = new JTable(mt);
		
		t1.setBounds(10,50,480,250);
		s1.setBounds(10,50,480,250);
		
		s1.setViewportView(t1);
		

		m.setLayout(null);
		m.setBounds(200, 200, 500, 500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);

		c1.setBounds(55, 340, 100, 25);
		c2.setBounds(305, 340, 100, 25);
		l1.setBounds(50, 300, 200, 50);
		l1.setText("Ingresa tu calificacion 1");
		l2.setBounds(300, 300, 200, 50);
		l2.setText("Ingresa tu calificacion 2");

		ba.setBounds(55, 400, 100, 30);
		ba.setText("Agregar");
		bd.setBounds(200, 400, 100, 30);
		bd.setText("Borrar");
		bm.setBounds(355, 400, 100, 30);
		bm.setText("Modificar");

		ba.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					double cali1 = Double.valueOf(c1.getText());
					double cali2 = Double.valueOf(c2.getText());
					double prom = (cali1 + cali2)/2;
					c1.setText("");
					c2.setText("");
					
					mt.addRow(new Object[] { cali1,cali2,prom});
			}

		});

		bd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mt.removeRow(t1.getSelectedRow());
			}
		});

		bm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mt.setValueAt(c1.getText(), t1.getSelectedRow(),0);
				mt.setValueAt(c2.getText(), t1.getSelectedRow(),1);
				mt.setValueAt((Double.valueOf(c1.getText()) + Double.valueOf(c2.getText()))/2, t1.getSelectedRow(),2);
				c1.setText("");
				c2.setText("");

			}
		});

		m.add(l1);
		m.add(l2);
		m.add(c1);
		m.add(c2);
		m.add(ba);
		m.add(bd);
		m.add(bm);
		m.add(s1);

	}

}
