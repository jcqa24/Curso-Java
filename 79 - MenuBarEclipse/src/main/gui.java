package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class gui extends JFrame {

	JFrame m;
	JMenuBar menuBar;
	JMenu menu1,menu2,menu3,menu4;
	JMenuItem itemAbrir,itemCerrar;
	JEditorPane contenido;
	File name;
	JCheckBoxMenuItem theme;


	public gui(){
		m = new JFrame();
		
		contenido= new JEditorPane();
		contenido.setBounds(0,0,1000,800);
		
		
		
		m.setLayout(null);		
		m.setBounds(100,100,1000,800);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		menuBar = new JMenuBar();
		m.setJMenuBar(menuBar);
		
		itemAbrir = new JMenuItem("Abrir Archivo");
		itemCerrar = new JMenuItem("Guardar Archivo");
		menu1=new JMenu("Archivo");
		menu2=new JMenu("Acerca de");
		menu3=new JMenu("Salir");
		menu4 =new JMenu("Tema");
		theme = new JCheckBoxMenuItem("Activar modo obscuro");
		
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu4);
        menuBar.add(menu3);
		
        menu1.add(itemAbrir);
        menu1.add(itemCerrar);
        
        menu4.add(theme);
        
        m.add(contenido);
        
        theme.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(theme.isSelected()) {
					contenido.setBackground(Color.black);
					contenido.setForeground(Color.white);
				}else {
					contenido.setBackground(Color.white);
					contenido.setForeground(Color.black);
				}
				
			}
		});
        
        
        itemAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Open();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
        
        itemCerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Save();
					JOptionPane.showMessageDialog(rootPane, "Archivo guardado");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
        
        menu3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		
        menu2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(m, "Creado por : PROGRAMATUTOS \n 2023");
				
			}
		});
        
       
		

	}
	
	public void Save() throws IOException {
        FileWriter fw = new FileWriter(name.getAbsolutePath());
        fw.write(contenido.getText());
        
        fw.close();

    }
	
    public void Open() throws IOException {

        JFileChooser fc = new JFileChooser();
        String linea;
        FileReader f;
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        fc.setFileFilter(filtro);

        int res = fc.showOpenDialog(rootPane);

        if (res != JFileChooser.CANCEL_OPTION) {
            name = fc.getSelectedFile();

            if (name == null || name.getName().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Error al abrir el archivo");
            } else {
                try {
                    f = new FileReader(name.getAbsolutePath());
                    BufferedReader b = new BufferedReader(f);
                    do {
                        linea = b.readLine();
                        if (linea != null) {
                            contenido.setText(contenido.getText() + linea + "\n");
                        }
                    } while (linea != null);
                    f.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Error al abrir el archivo");
                }

            }

        }

    }
	
}