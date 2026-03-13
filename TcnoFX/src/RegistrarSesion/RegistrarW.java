 //     package RegistrarSesion;

//     public class RegistrarW {

//     }



package RegistrarSesion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import LoginWindw.LoginW;

//import Java.sca 
public class RegistrarW extends JFrame implements ActionListener {

	
	
	
	public String contraseña;
	
	
	
	private  int longitud ;
	
	
	public void Password (int longitud) {
		
		
		this.longitud =longitud;
		contraseña=generaPassword();
	//	System.out.print("La contraseña generada es :"  contraseña);
	//	if (esFuerte()==true) {
			
		System.out.print("Laconstraseña generada es fuerte");
			
			
		}
		
		
		//else {
			
		//	System.out.print("Laconstraseña generada es debil");
//
//		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
//	}
	
	
	
	
	
	







		//private boolean (boolean esFuerte() {
		// TODO Auto-generated method stub
		//return false;
	//       }






	private String generaPassword() {
		// TODO Auto-generated method stub
		return null;
	}






	public RegistrarW() {
		componentes();
	}
	
	
	public void componentes() {
		this.setTitle("Registro de Cuenta");
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(230,230,250));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.show();
		
		
		lbNombre.setText("Nombre: ");
		lbNombre.setBounds(50, 10, 100, 30);
		this.add(lbNombre);
		
		txtNombre.setBounds(10, 45, 220, 28);
		this.add(txtNombre);
		
		lbApellidos.setText("Apellidos: ");
		lbApellidos.setBounds(280, 10, 100, 30);
		this.add(lbApellidos);
		
		txtApellidos.setBounds(250, 45, 220, 28);
		this.add(txtApellidos);
		
		lbFecha.setText("Fecha de Nacimiento: ");
		lbFecha.setBounds(10, 85, 150, 30);
		this.add(lbFecha);
		
		txtDia.setBounds(20, 120, 70, 30);
		this.add(txtDia);
		
		txtMes.setBounds(100, 120, 75, 30);
		this.add(txtMes);
		
		txtAño.setBounds(185, 120, 90, 30);
		this.add(txtAño);
		
		lbCE.setText("Correo Electronico: ");
		lbCE.setBounds(30, 150, 150, 20);
		this.add(lbCE);
		
		txtCE.setBounds(20, 170, 350, 30);
		this.add(txtCE);
		
		lbContraseña.setText("Contraseña: ");
		lbContraseña.setBounds(30, 220, 100, 20);
		this.add(lbContraseña);
		
		txtContraseña.setBounds(20, 245, 200, 30);
		this.add(txtContraseña);
		
		lbConfirmacion.setText("Confirmacion de contraseña: ");
		lbConfirmacion.setBounds(230, 220, 200, 20);
		this.add(lbConfirmacion);
		
		txtConfirmacion.setBounds(230, 245, 200, 30);
		this.add(txtConfirmacion);
		
		btnRegistrar.setText("Registrar");
		btnRegistrar.setBounds(40, 400, 150, 25);
		btnRegistrar.setBackground(new Color(124,252,0));
		this.add(btnRegistrar);
		
		btnCancelar.setText("Cancelar");
		btnCancelar.setBounds(200, 400, 150, 25);
		btnCancelar.setBackground(new Color(255,69,0));
		this.add(btnCancelar);
		
		btnCuenta.setText("Tengo una cuenta");
		btnCuenta.setBounds(80, 425, 170, 25);
		btnCuenta.setBackground(new Color(00,200,200));
		this.add(btnCuenta);
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent r) {
		Object s = new Object();
		s=r.getSource();
		Object escuchador = new Object();
		
		if (escuchador == btnCancelar) {
			
			
			
		}
		
		if (escuchador == btnCuenta)  {
			LoginW  Loguear= new LoginW();
			Loguear.setVisible(true);
			
		}
		
		
		
	}
	JLabel lbNombre=new JLabel();
	JTextField txtNombre=new JTextField();
	
	JLabel lbApellidos=new JLabel();
	JTextField txtApellidos=new JTextField();
	
	JLabel lbFecha=new JLabel();
	Choice txtDia=new Choice();
	Choice txtMes=new Choice();
	Choice txtAño=new Choice();
	
	JLabel lbCE=new JLabel();
	JTextField txtCE=new JTextField();
	
	JLabel lbContraseña=new JLabel();
	JTextField txtContraseña=new JTextField();
	
	JLabel lbConfirmacion=new JLabel();
	JTextField txtConfirmacion=new JTextField();
	
	JButton btnCancelar=new JButton();
	JButton btnRegistrar=new JButton();
	JButton btnCuenta=new JButton();
}
