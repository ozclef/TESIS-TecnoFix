package principal;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class princ extends JFrame implements ActionListener
{
	DefaultListModel modelo=new DefaultListModel();
	public princ() {
		componentes();
	}
	
	public void componentes() {
		this.setTitle("Agrega en tu Lista");
		this.setSize(960, 540);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(138,43,226));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mnuArchivo.setText("Archivo");		
		mnuRegistrar.setText("Registrar");
		mnuEliminar.setText("Eliminar");
		mnuSalir.setText("Salir");
		mnuArchivo.add(mnuRegistrar);
		mnuArchivo.add(mnuEliminar);
		mnuArchivo.add(mnuSalir);
		
		mnuRegistrar.addActionListener(this);
		mnuEliminar.addActionListener(this);
		mnuSalir.addActionListener(this);
		
		mnuAyuda.setText("Ayuda");
		mnuAcerca.setText("Acerca de...");
		mnuAyuda.add(mnuAcerca);
		
		mnbrBarra.add(mnuArchivo);
		mnbrBarra.add(mnuAyuda);
		
		this.setJMenuBar(mnbrBarra);
		
		txtNomb.setBounds(50,100,200,30);
		this.add(txtNomb);
		
		txtDirec.setBounds(50,150,200,30);
		this.add(txtDirec);
		
		txtTelef.setBounds(50,200,200,30);
		this.add(txtTelef);
		
		txtCorreo.setBounds(50,250,200,30);
		this.add(txtCorreo);
		
		txtNotas.setBounds(50,300,200,30);
		this.add(txtNotas);
		
		btnAceptar.setText("Agregar");
		btnAceptar.setBounds(50,350,90,30);
		btnAceptar.addActionListener(this);
		this.add(btnAceptar);
		
		
		
		lstNomb.setBounds(300,100,100,60);
		this.add(lstNomb);
		
		lstDirec.setBounds(420,100,100,60);
		this.add(lstDirec);
		
		
		this.show(true);	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object escuchador=new Object();
		escuchador=e.getSource();
		
		if (escuchador==mnuRegistrar) {
			JOptionPane.showMessageDialog(null, "Registrate");
		}
		else if (escuchador==mnuEliminar) {
			JOptionPane.showMessageDialog(null, "Eliminar esto");
		}
		
		else if (escuchador==btnAceptar) {
			modelo.addElement(txtNomb.getText());
			lstNomb.setModel(modelo);
			modelo.addElement(txtDirec.getText());
			lstDirec.setModel(modelo);
			
		}
		
	}
	
	
		
	
	 
	JMenuBar mnbrBarra=new JMenuBar();
	
	JMenu mnuArchivo=new JMenu();
	JMenuItem mnuRegistrar=new JMenuItem();
	JMenuItem mnuEliminar=new JMenuItem();
	JMenuItem mnuSalir=new JMenuItem();
	
	JMenu mnuAyuda=new JMenu();
	JMenuItem mnuAcerca=new JMenuItem();
	
	JButton btnAceptar=new JButton();
	
	
	JTextField txtNomb=new JTextField();
	JTextField txtDirec=new JTextField();
	JTextField txtCorreo=new JTextField();
	JTextField txtTelef=new JTextField();
	JTextField txtNotas=new JTextField();
	
		
	JList lstNomb=new JList();
	JList lstDirec=new JList();
	

}
