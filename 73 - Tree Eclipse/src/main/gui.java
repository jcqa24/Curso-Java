package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	JTextArea contenido;
	JTree arbol;

	public gui() {
		m = new JFrame();
		contenido = new JTextArea();

		contenido.setBounds(200, 20, 250, 400);
		contenido.setLineWrap(true);

		contenido.setEditable(false);

		DefaultMutableTreeNode Paises = new DefaultMutableTreeNode("Paises");
		DefaultMutableTreeNode America = new DefaultMutableTreeNode("America");
		DefaultMutableTreeNode Africa = new DefaultMutableTreeNode("Africa");
		DefaultMutableTreeNode Asia = new DefaultMutableTreeNode("Asia");
		DefaultMutableTreeNode Europa = new DefaultMutableTreeNode("Europa");
		DefaultMutableTreeNode Oceania = new DefaultMutableTreeNode("Oceania");
		DefaultMutableTreeNode Norteamerica = new DefaultMutableTreeNode("Norteamerica");
		DefaultMutableTreeNode Centroamerica = new DefaultMutableTreeNode("Centroamerica");
		DefaultMutableTreeNode Sudamerica = new DefaultMutableTreeNode("Sudamerica");
		DefaultMutableTreeNode Mexico = new DefaultMutableTreeNode("México");
		DefaultMutableTreeNode Guatemala = new DefaultMutableTreeNode("Guatemala");
		DefaultMutableTreeNode Brasil = new DefaultMutableTreeNode("Brasil");
		DefaultMutableTreeNode Espana = new DefaultMutableTreeNode("España");
		DefaultMutableTreeNode Alemania = new DefaultMutableTreeNode("Alemania");
		DefaultMutableTreeNode China = new DefaultMutableTreeNode("China");
		DefaultMutableTreeNode Japon = new DefaultMutableTreeNode("Japon");
		DefaultMutableTreeNode Sudafrica = new DefaultMutableTreeNode("Sudafrica");
		DefaultMutableTreeNode Congo = new DefaultMutableTreeNode("Republica del Congo");
		DefaultMutableTreeNode Australia = new DefaultMutableTreeNode("Australia");

		DefaultTreeModel modelo = new DefaultTreeModel(Paises);

		modelo.insertNodeInto(America, Paises, 0);
		modelo.insertNodeInto(Asia, Paises, 1);
		modelo.insertNodeInto(Africa, Paises, 2);
		modelo.insertNodeInto(Europa, Paises, 3);
		modelo.insertNodeInto(Oceania, Paises, 4);
		modelo.insertNodeInto(Norteamerica, America, 0);
		modelo.insertNodeInto(Centroamerica, America, 1);
		modelo.insertNodeInto(Sudamerica, America, 2);
		modelo.insertNodeInto(Mexico, Norteamerica, 0);
		modelo.insertNodeInto(Guatemala, Centroamerica, 0);
		modelo.insertNodeInto(Brasil, Sudamerica, 0);
		modelo.insertNodeInto(Espana, Europa, 0);
		modelo.insertNodeInto(Alemania, Europa, 1);
		modelo.insertNodeInto(China, Asia, 0);
		modelo.insertNodeInto(Japon, Asia, 1);
		modelo.insertNodeInto(Sudafrica, Africa, 0);
		modelo.insertNodeInto(Congo, Africa, 1);
		modelo.insertNodeInto(Australia, Oceania, 0);

		arbol = new JTree(modelo);
		arbol.setBounds(5, 20, 150, 400);

		arbol.addTreeSelectionListener(new TreeSelectionListener() {

			@Override
			public void valueChanged(TreeSelectionEvent e) {
				try {
					contenido.setText("");
					String seleccion = arbol.getLastSelectedPathComponent().toString();

					switch (seleccion) {
					case "México":
						muestraContenido("./Info/Mexico.txt");
						break;
					case "Japon":
						muestraContenido("./Info/Japon.txt");
						break;
					case "Alemania":
						muestraContenido("./Info/Alemania.txt");
						break;
					default:
						contenido.setText("Por el momento la informacion no esta disponible");
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		m.setLayout(null);
		m.setBounds(200, 200, 500, 500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);

		m.add(contenido);
		m.add(arbol);

	}

	public void muestraContenido(String name) throws IOException {
		String linea;
		try {
			FileReader f = new FileReader(name);
			BufferedReader b = new BufferedReader(f);
			do {

				linea = b.readLine();
				if (linea != null)
					contenido.setText(contenido.getText() + linea + "\n");
			} while (linea != null);

		} catch (FileNotFoundException ex) {
			Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
