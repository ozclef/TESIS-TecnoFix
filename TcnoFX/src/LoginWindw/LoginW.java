//package LoginWindw;

//public class LoginW {

//}



package LoginWindw;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import RegistrarSesion.RegistrarW;
public class LoginW extends JFrame implements ActionListener {

	public LoginW() {
		
		componentes();
	}
	
	
	public void componentes() {
		
		
		
		this.setTitle("iniciar sesión");
		this.setSize(350, 350);
		this.setLocationRelativeTo(null);
	//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(230,230,250));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		lbCE.setText("Correo Electronico: ");
		lbCE.setBounds(70, 20, 200, 20);
		this.add(lbCE);
		
		txtCE.setBounds(20, 40, 270, 30);
		this.add(txtCE);
		
		lbContraseña.setText("Contraseña: ");
		lbContraseña.setBounds(90, 70, 200, 20);
		this.add(lbContraseña);
		
		txtContraseña.setBounds(20, 100, 270, 30);
		this.add(txtContraseña);
		
		btnAcceder.setText("Acceder");
		btnAcceder.setBounds(20, 200, 150, 25);
		btnAcceder.setBackground(new Color(124,252,0));
		this.add(btnAcceder);
		
		btnCancelar.setText("Cancelar");
		btnCancelar.setBounds(180, 200, 150, 25);
		btnCancelar.setBackground(new Color(255,69,0));
		this.add(btnCancelar);
		
		btnCuenta.setText("Registrarse");
		btnCuenta.setBounds(60, 260, 120, 25);
		this.add(btnCuenta);
		
		
		
		
		
		this.show();
		}
		
		
		

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object escuchador = new Object();
		escuchador =e.getSource();
		
		if (escuchador == btnAcceder)  {
			
		//	Object jpassClave;
		//	char clave[]=((Object) jpassClave).getPassword();
			
		}
		
		
		
		if (escuchador == btnCancelar) {
			
			this.dispose();
			
			
		}
		
		
		if (escuchador == btnCuenta) {
			
			this.dispose();
			
			RegistrarW VentRegis =new RegistrarW();
			VentRegis.setVisible(true);
			
			
		}
		
		
		
	}
	JLabel lbCE=new JLabel();
	JTextField txtCE=new JTextField();
	
	JLabel lbContraseña=new JLabel();
	JTextField txtContraseña=new JTextField();
	
	JButton btnCancelar=new JButton();
	JButton btnAcceder=new JButton();
	JButton btnCuenta=new JButton();
	JButton btnRegis=new JButton();
	
	
}