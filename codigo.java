package interfaz;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class codigo extends JFrame implements ActionListener
{
	DefaultListModel modelo=new DefaultListModel();
	
	public codigo() {
		componentes();
	}
	
	public void componentes() {
		this.setTitle("Ventana");
		this.setSize(800, 800);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(255,228,255));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mnuArchivo.setText("Archivo");
		mnuAbrir.setText("Abrir");
		mnuNuevo.setText("Nuevo");
		mnuGuardar.setText("Guardar");
		mnuArchivo.add(Abrir);
		mnuArchivo.add(Nuevo);
		mnuArchivo.add(Guardar);
		
		mnuAbrir.addActionListener(this);
		mnuNuevo.addActionListener(this);
		
		mnuFondo.setText("Fondo");
		mnuMorado.setText("Morado");
		mnuRojo.setText("Rojo");
		mnuVerde.setText("Verde");
		mnuAmarillo.setText("Amarillo");
		mnuAzul.setText("Azul");
		mnuFondo.add(Morado);
		mnuFondo.add(Rojo);
		mnuFondo.add(Verde);
		mnuFondo.add(Amarillo);
		mnuFondo.add(Azul);
		
		mnuAyuda.setText("Ayuda");
			
		
		mnbrBarra.add(mnuArchivo);
		mnbrBarra.add(mnuFondo);
		mnbrBarra.add(Ayuda);
		
		this.setJMenuBar(mnbrBarra);
		
		txtProd.setBounds(50, 100, 200, 30);
		this.add.txtProd(txtProd);
		
		lstProd.setBounds(50, 200, 200, 30);
		this.add(lstProd);
		
		
		
	}

}
