package main;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class gui extends JFrame {

	JFrame m;
	JButton b1,b2;
	JTextArea contenido;
	JTextField a1,a2;
	JLabel img;
	JFileChooser fc;

	
	public void muestraContenido(String name) throws IOException{
        String linea;
        try {
            FileReader f = new FileReader(name);
            BufferedReader b = new BufferedReader(f);
            do{
                linea = b.readLine();
                contenido.setText(contenido.getText() + linea + "\n");
            }while(linea != null);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	public gui(){
		m = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		contenido = new JTextArea();
		a1 = new JTextField();
		a2 = new JTextField();
		img = new JLabel();
		
		
		
		a1.setBounds(10,10,450,50);
		b1.setBounds(500,10,150,50);
		contenido.setBounds(10,80,670,350);
		img.setBounds(10,610,50,50);
		a2.setBounds(10,550,450,50);
		b2.setBounds(500,550,150,50);
		
		
		
		b1.setText("Abrir archivo");
		b2.setText("Abrir imagen");
		
		a1.setEditable(false);
		contenido.setEditable(false);
		
		m.setLayout(null);		
		m.setBounds(200,200,700,700);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto","txt");
				fc.setFileFilter(filtro);
				
				int res = fc.showOpenDialog(m);
				
				if(res != JFileChooser.CANCEL_OPTION) {
					File name = fc.getSelectedFile();
					if(name == null || name.getName().equals("")) {
						JOptionPane.showMessageDialog(m, "Error al abrir el archivo");
					}else {
						a1.setText(name.getAbsolutePath());
						try {
							muestraContenido(name.getAbsolutePath());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen","png","jpg","gif");
				fc.setFileFilter(filtro);
				
				int res = fc.showOpenDialog(m);
				
				if(res != JFileChooser.CANCEL_OPTION) {
					File name = fc.getSelectedFile();
					if(name == null || name.getName().equals("")) {
						JOptionPane.showMessageDialog(m, "Error al abrir el archivo");
					}else {
						ImageIcon imagen = new ImageIcon(name.getAbsolutePath());
						img.setIcon(imagen);
						a2.setText(name.getAbsolutePath());
					}
				}
				
			}
		});
		
		m.add(b1);
		m.add(b2);
		m.add(a1);
		m.add(a2);
		m.add(img);
		m.add(contenido);



		
	}
	
}
