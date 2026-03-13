package Vista;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Vinterfaz extends JFrame implements ActionListener
{
	
	DefaultListModel modelo=new DefaultListModel();
	
	public Vinterfaz() {
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
		mnuArchivo.add(mnuAbrir);
		mnuArchivo.add(mnuNuevo);
		
		mnuAbrir.addActionListener(this);
		mnuNuevo.addActionListener(this);
		
		mnuEditar.setText("Editar");
		mnuRecurso.setText("Recurso");
		mnuNavegar.setText("Navegar");
		mnuBusqueda.setText("Búsqueda");
		
		mnbrBarra.add(mnuArchivo);
		mnbrBarra.add(mnuEditar);
		mnbrBarra.add(mnuRecurso);
		mnbrBarra.add(mnuNavegar);
		mnbrBarra.add(mnuBusqueda);
		
		this.setJMenuBar(mnbrBarra);
		
		txtProd.setBounds(100, 50, 300, 22);
		this.add(txtProd);
		
		btnAceptar.setText("Agregar a lista");
		btnAceptar.setBounds(120, 85, 200, 25);
		btnAceptar.addActionListener(this);
		this.add(btnAceptar);
		
		lstProd.setBounds(100, 125, 180, 140);
		this.add(lstProd);
		
		this.show(true);		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object escuchador=new Object();
		escuchador=e.getSource();
		
		if (escuchador==mnuAbrir) {
			JOptionPane.showMessageDialog(null, "Escribir el codigo del sub menu abrir");
		}
		else if (escuchador==mnuNuevo) {
			JOptionPane.showMessageDialog(null, "Escribir el codigo del sub menu Nuevo");
		}
		else if(escuchador==btnAceptar) {
			modelo.addElement(txtProd.getText());
			lstProd.setModel(modelo);
			
		}
		
	}
	
	JMenuBar mnbrBarra=new JMenuBar();
	
	JMenu mnuArchivo=new JMenu();
	JMenuItem mnuNuevo=new JMenuItem();
	JMenuItem mnuAbrir=new JMenuItem();
	
	JMenu mnuEditar=new JMenu();
	JMenuItem mnuFormato=new JMenuItem();
	JMenuItem mnuCopiar=new JMenuItem();
	
	JMenu mnuRecurso=new JMenu();
	JMenu mnuNavegar=new JMenu();
	JMenu mnuBusqueda=new JMenu();
	
	JButton btnAceptar=new JButton();
	JTextField txtProd=new JTextField();
	JList lstProd=new JList();
	
}
