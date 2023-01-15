package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class gui extends JFrame {

	JFrame m;
	JButton b1;
	JEditorPane html,texto;
		


	public gui(){
		m = new JFrame();
		b1 = new JButton();
		html = new JEditorPane();
		texto = new JEditorPane();
		
		m.setLayout(null);
		m.setVisible(true);
		
		
		b1.setBounds(525,300,125,30);
		b1.setText("Preview");
		
		texto.setBounds(10,10,500,600);
		texto.setContentType("text/plain");
		
		html.setBounds(660,10,500,600);
		html.setContentType("text/html");
		html.setEditable(false);
		
		m.setBounds(0,0,1200,700);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				html.setText(texto.getText());
			}
		});
		
		
		
		m.add(b1);
		m.add(html);
		m.add(texto);
		
	}
	
	 
	
}
