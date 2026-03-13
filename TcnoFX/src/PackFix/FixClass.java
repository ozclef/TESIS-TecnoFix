package PackFix;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//
public class FixClass extends  JFrame  implements ActionListener {


//package Fix;

	public FixClass() {
		FixComp();
	}
	
	
	JLabel  Titulo  = new  JLabel();
	
	JLabel Describe  = new JLabel();
	JTextField Descripcion = new JTextField();
	
	
	public void FixComp() {
		
		this.setTitle("Fix   -   Manda tu dispositivo");
		this.setSize(960, 540);
		this.setLocationRelativeTo(null);
		//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(230,230,235));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(null);
		this.show();
		this.setVisible(true);
		
		
		
		Titulo.setText("Mande su dispositivo para reapararlo ");
		Titulo.setBounds(30, 10, 100, 25);
		this.add(Titulo);
		
		Descripcion.setBounds(20, 80, 500, 300);
		this.add(Descripcion);
		
		Describe.setBounds(25, 60, 100, 15);
		this.add(Describe);
		
		}
	
	
	
	
	
	
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}