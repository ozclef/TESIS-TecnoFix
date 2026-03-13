package webpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Page extends JFrame implements ActionListener
{
	DefaultListModel modelo=new DefaultListModel();
	public Page() {
		componentes();
	}

	public void componentes() {
	
	this.setTitle("Mi primer ventana en Java");
	this.setSize(600, 600);
	this.set.Layout(null);
	this.getContentPane().setBackground(new Color (255,228,225));
	this.setsetLocationRelativeTo(null);
	this.setResizable(false);
	this.setDeafultCloseOperation(EXIT_ON_CLOSE);
	
	mnuArchivo.setText("Archivo");
	mnuAbrir.setText("Abrir");
	mnuNuevo.setText("Nuevo");
	mnuArchivo.add("MnuAbrir");
	mnuArchivo.add("MnuNuevo");
	
	mnuAbrir.addActionListener(this);
	mnuNuevo.addActionListener(this);
	
	mnuEditar.setText("Editar");
	mnuRecurso.setText("Recurso");
	mnuNavegar.setText("Navegar");
	mnuBusqueda.Busquedas.setText("Busqueda");
	
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
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		Object escuchador=new Object();
		escuchador=e.getSource();
		
		if(escuchador==mnuAbrir){
			JOptionPane.showMessageDialog(null, "Aqui se escribe el codigo del sub menú abrir");
		}
		else if(escuchador==mnuNuevo) {
			JOptionPane.showConfirmDialog(null, "Aqui se escribe el codigo del sub menú nuevo")
		}
		else if(escuchador==btnAceptar) {
			modelo.addElement(txtProd.getText());
			lst.setModel(modelo);
		}
			
	}
	
	JMenuBar mnbrBarra=new JMenuBar();
	
	JMenu mnuArchivo=new JMenu();
	JMenuItem mnuNuevo=new JMenuItem();
	JMenuItem mnuAbrir=new JMenuItem();
	
	JMenu mnuEditar=new JMenu();
	JMenuItem mnuFormato = new JMenuItem();
	JMenuItem menuCopiar = new JMenuItem();
	
	JMenu mnuRecurso = new JMenu();
	JMenu mnuNavegar = new JMenu();
	JMenu mnuBusqueda= new JMenu();
	
	JButton btnAceptar=new JButton();
	JTextField txtProd=new JTextField();
	JList lstProd=new JList();
	
	
}
