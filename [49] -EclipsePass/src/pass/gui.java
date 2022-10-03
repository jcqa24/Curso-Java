package pass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui extends JFrame {

	JFrame m;
	JButton log;
	JLabel l1,l2;
	JTextField u;
	JPasswordField p;

	
	public gui(){
		m = new JFrame();
		m.setLayout(null);
		log = new JButton();
		l1 = new JLabel();
		l2 = new JLabel();
		u = new JTextField();
		p =  new JPasswordField();
		
		m.setBounds(200,200,500,500);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
		
		log.setBounds(350, 400, 100, 50);
		log.setText("Login");
		
		l1.setText("Usuario");
		l1.setBounds(50,50, 100, 50);
		
		l2.setText("Password");
		l2.setBounds(50,200, 100, 50);
		
		u.setBounds(50,100, 300, 50);

		p.setBounds(50,250,300,50);
		
		m.add(log);
		m.add(p);
		m.add(l1);
		m.add(l2);
		m.add(u);
	
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pass , user;
				
				pass = new String(p.getPassword());
				
				user = u.getText();
				
				p.setText("");
				u.setText("");
				
				if((user.equals("root")) && (pass.equals("toor")) ) {
					JOptionPane.showMessageDialog(null,"Login correcto");
				}else {
					JOptionPane.showMessageDialog(null,"Login incorrecto");
					
				}
				
				
				
				
								
			}
		});
		
	}
	
}
