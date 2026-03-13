package principal;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class princ extends JFrame implements ActionListener
{
	DefaultListModel modelo=new DefaultListModel();
	DefaultListModel modelo2=new DefaultListModel();
	DefaultListModel modelo3=new DefaultListModel();
	DefaultListModel modelo4=new DefaultListModel();
	DefaultListModel modelo5=new DefaultListModel();
	
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
		
		
		txtN.setText("Nombre:");
		txtN.setBounds(50,80,100,20);		
		this.add(txtN);
		
		txtNomb.setBounds(50,100,200,30);
		this.add(txtNomb);
		
		
		txtD.setText("Direcciòn:");
		txtD.setBounds(50,130,100,20);
		this.add(txtD);
		
		txtDirec.setBounds(50,150,200,30);
		this.add(txtDirec);
		
		
		txtT.setText("Telèfono:");
		txtT.setBounds(50,180,100,20);
		this.add(txtT);
		
		txtTelef.setBounds(50,200,200,30);
		this.add(txtTelef);
		
		
		txtC.setText("Correo Electrònico:");
		txtC.setBounds(50,230,100,20);
		this.add(txtC);
		
		txtCorreo.setBounds(50,250,200,30);
		this.add(txtCorreo);
		
		
		txtNot.setText("NOTAS: ");
		txtNot.setBounds(50,280,100,20);
		this.add(txtNot);
		
		txtNotas.setBounds(50,300,200,30);
		this.add(txtNotas);
		
		
		btnAceptar.setText("Agregar");
		btnAceptar.setBounds(50,350,90,30);
		btnAceptar.addActionListener(this);
		this.add(btnAceptar);
		
		
		txtNo.setText("Nombres: ");
		txtNo.setBounds(300,80,100,20);
		this.add(txtNo);
		
		lstNomb.setBounds(300,100,100,100);
		this.add(lstNomb);
		
		txtDi.setText("Direcciones");
		txtDi.setBounds(420,80,100,20);
		this.add(txtDi);
		
		lstDirec.setBounds(420,100,100,100);
		this.add(lstDirec);
		
		txtTe.setText("Telèfonos:");
		txtTe.setBounds(540,80,100,20);
		this.add(txtTe);
		
		lstTelef.setBounds(540,100,100,100);
		this.add(lstTelef);
		
		txtCo.setText("Correos:");
		txtCo.setBounds(660,80,100,20);
		this.add(txtCo);
		
		lstCorreo.setBounds(660,100,100,100);
		this.add(lstCorreo);
		
		txtNote.setText("NOTAS:");
		txtNote.setBounds(300,200,100,20);
		this.add(txtNote);
		
		lstNotas.setBounds(300,220,100,100);
		this.add(lstNotas);
		
		
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
			
			modelo2.addElement(txtDirec.getText());
			lstDirec.setModel(modelo2);
			
			modelo3.addElement(txtTelef.getText());
			lstTelef.setModel(modelo3);
			
			modelo4.addElement(txtCorreo.getText());
			lstCorreo.setModel(modelo4);
			
			modelo5.addElement(txtNotas.getText());
			lstNotas.setModel(modelo5);
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
	
	
	JLabel txtN=new JLabel();
	JLabel txtD=new JLabel();
	JLabel txtC=new JLabel();
	JLabel txtT=new JLabel();
	JLabel txtNot=new JLabel();
	
	JLabel txtNo=new JLabel();
	JLabel txtDi=new JLabel();
	JLabel txtCo=new JLabel();
	JLabel txtTe=new JLabel();
	JLabel txtNote=new JLabel();
	
	JTextField txtNomb=new JTextField();
	JTextField txtDirec=new JTextField();
	JTextField txtCorreo=new JTextField();
	JTextField txtTelef=new JTextField();
	JTextField txtNotas=new JTextField();
	
		
	JList lstNomb=new JList();
	JList lstDirec=new JList();
	JList lstTelef=new JList();
	JList lstCorreo=new JList();
	JList lstNotas=new JList();
	

}
