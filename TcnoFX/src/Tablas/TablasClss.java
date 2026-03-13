package Tablas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TablasClss extends JFrame  implements ActionListener{
	
	public void Tabla1()  {
		
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
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
