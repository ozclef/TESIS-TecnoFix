package VistaPrevProd;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class VistPrevProd  extends JFrame implements  ActionListener {
	
	public VistPrevProd() {
		
		componentesVist();
	}
	

	private static final String SCALE_DEFAULT = null;
	//private Object data;
	//private Object columnas;
	//DefaultListModel modeloTabla=new DefaultListModel();
	//DefaultListModel modelo=new DefaultListModel();
	
	
	

	private void componentesVist() {
		// TODO Auto-generated method stub
		
		
		
		

		this.setTitle("Vista Previa ");
		this.setSize(854,540);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0,200,250));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		//VarbleNombreProd =new 
		
		//TextNombrePrd.setText(string = VarbleNombreProd );
		TextNombrePrd.setBounds(50, 80, 100, 30);
		this.add(TextNombrePrd);
		
		
		//Text
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	JTextField TextNombrePrd=new JTextField();
	
	
	
	
	
	
	

}
