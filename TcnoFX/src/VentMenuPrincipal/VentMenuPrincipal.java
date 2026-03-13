package VentMenuPrincipal;







//TECNO FIX CODE 


//package appproyect;

//package Abrir;



import java.awt.*;

//import imagenes
//import com.sun.java.swing.event.*;
//import com.sun.java.swing.*;
import javax.swing.*;

import LoginWindw.LoginW;
import PackFix.FixClass;
import RegistrarSesion.RegistrarW;
//import VistaPreviaProd.VistPrevProd;

import java.awt.event.*;
import java.net.URL;
import java.util.Scanner.*;
import java.sql.Connection;
import java.sql.*;

import InterfazRM.InterfazR;


//public class VentanaMenuPrincipal extends JFrame implements ActionListener  {

//public class menupric {
	
	
	//private static final String CONTROLADOR 
	












public class VentMenuPrincipal extends JFrame implements ActionListener  { 
	


	
	
	//private static final long serialversionULD = JL
	
	//public Fondo (String nombre) {
		
		
		
//	}

//	private static final String SCALE_DEFAULT = null;
//	private static final Window RegistrarWin = null;
	//private Object data;
	//private Object columnas;
	DefaultListModel modeloTabla=new DefaultListModel();
	DefaultListModel modelo=new DefaultListModel();
	
	
	DefaultListModel modeloBuscar=new DefaultListModel();

	
	//ImageIcon Imagen1;
	
	
	private Container contentPane;
	//private final JTable table;
	
	
	
	private static Connection con;
	//private static DataConnection INSTANCE = null;
	
	//private DataConnection();
	
	
	
			public VentMenuPrincipal() {
				//this.table = new JTable();
				
				
				componentes();
			
		
				}
		
	
	
	JTable ProductosMenu = new JTable();
	
	public void componentes() {
		
		this.setTitle("Tenologic Fix Shop - V.  0.520  ");
		this.setSize(1280,720);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(230,230,250));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		// this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
		
		
			
		
	
		//SubMenus de la Barra
		
		
		mnuPagPrinc.setText("Pagina Principal");
		
		mnuShop.setText("Tienda");
		mnuCateLap.setText("Laptops");
		mnuCatePC.setText("PC's");
		mnuCateTablet.setText("Tablets");
		mnuCateCel.setText("Celulares Smart");
		mnuShop.add(mnuCateLap);
		mnuShop.add(mnuCatePC);
		mnuShop.add(mnuCateTablet);
		mnuShop.add(mnuCateCel);
		mnuCateShop.setText("Todas Las ventas");
		
		//Sub menu Usuario
		mnuUsuario.setText("Mi cuenta");
		mnuRegistrar.setText("Registrarse");
		mnuIniSesion.setText("Inicar Sesiòn");
		mnuCerrarSes.setText("Cerrar Sesiòn");
		mnuCerrarSes.setEnabled(false);
		
		
		//SubMenu Fix
		mnuFix.setText("Fix");
		mnuSolicFix.setText("Solicitud de Arreglo");
		mnuConfig.setText("Configuraciòn");
		
		
		//Submenu configuracion de color de fondo
		colorRojo.setText("Rojo");
		colorAma.setText("Amarillo");
		colorNegro.setText("Oscuro");
		colorAzul.setText("Azul");
		colorVerde.setText("Verde");
		colorBlanco.setText("Blanco");
		confColor.add(colorBlanco);
		confColor.add(colorAma);
		confColor.add(colorRojo);
		confColor.add(colorNegro);
		confColor.add(colorAzul);
		confColor.add(colorVerde);
		colorMorado.setText("Morado");
		confColor.add(colorMorado);
		confColor.setText("Color de fondo ");
		mnuConfig.add(confColor);
		
		
		
		
		
		mnuNovedades.setText("Novedades");
		
		
		
		
		
		//Codigos para acciones
		mnuPagPrinc.addActionListener(this);
		mnuShop.addActionListener(this);
		mnuUsuario.addActionListener(this);
		mnuFix.addActionListener(this);
		mnuConfig.addActionListener(this);
		
		mnuRegistrar.addActionListener(this);
		mnuIniSesion.addActionListener(this);
		mnuCerrarSes.addActionListener(this);
		
		
		confColor.addActionListener(this);
		colorRojo.addActionListener(this);
		colorAma.addActionListener(this);
		colorNegro.addActionListener(this);
		colorAzul.addActionListener(this);
		colorVerde.addActionListener(this);
		colorBlanco.addActionListener(this);
		colorMorado.addActionListener(this);
		//btnCmprar.addAction
		
		
		
		
		mnuUsuario.add(mnuIniSesion);
		mnuUsuario.add(mnuRegistrar);
		mnuUsuario.add(mnuCerrarSes);
		
		mnuBarra.add(mnuPagPrinc);
		mnuBarra.add(mnuShop);
		mnuBarra.add(mnuUsuario);
		mnuBarra.add(mnuFix);
		mnuBarra.add(mnuConfig);
		
		
		
		
		this.setJMenuBar(mnuBarra);
		
			
		
		//termina menu Barra..
		
		
		
		
		
		 
		// Empieza diseño de la pagina
		
		//Barra  BUscar
		BusqText.setText("Busqueda:");
		BusqText.setBounds(100,10,100,20);
		this.add(BusqText);
		Busqbar.setBounds(165,10,300,22);
		this.add(Busqbar);
		btnBuscar.setText("Buscar");
		btnBuscar.setBounds(500,10,80,22);
		this.add(btnBuscar);
		
		
		
		//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
		
		
		
		//IMAGEN
		//Imagenes pagina principal
		
		
		
		
		
		
		//Texto e ikmagen del anuncio de compras de la pagina inicial
		
		
		
		//TEXTO
		//txtTienda.setText("¡Ofertas especiales en todo lo que buscas y mucho màs!");
		//txtTienda.setBounds(30, 210, 300, 40);
		//this.add(txtTienda);
		
		//IMAGEN
		
		//TiendaImg.setBounds(20, 35, 300, 200);
		//TiendaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GamingRoom.jpg/" )     )      );
//		this.add(TiendaImg);
		
		//btnShop.setText("IR A VER PRODUCTOS");
		//btnShop.setSize(14, 8);
		//btnShop.setBounds(200, 260, 100, 50);
		//this.add(btnShop);
		
		
		
		
		
		//2do metodo de botun con imagen pero incompleto
		//botonImagen1 = new JButton(new ImagenIcon("2.png"));
		
		
		
		
		
		//  ImgGamgRoom1.setText("Ir a ver ");
		//ImgGamgRoom1.setIcon(new Icon());		
		//  ImgGamgRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GamingRoom.jpg"    )));
		//  ImgGamgRoom1.setBounds(20,50,250,200);
		//  this.add		(ImgGamgRoom1);
		
		
		//txtCmprGamingRoom1.setText("Todo tu cuarto decorado ");
		//txtCmprGamingRoom1.setBounds(20, 240, 240, 50);
		//this.add(txtCmprGamingRoom1);
		txt2CmprGamingRoom1.setText("y Completo  a solo $250,000.00  ");
		txt2CmprGamingRoom1.setBounds(30, 270, 240, 50);
		this.add(txt2CmprGamingRoom1);
		
		
		
		BtnGamgRoom1.setText("Comprar Producto ");
		BtnGamgRoom1.setBounds(30, 320, 150, 30);
		this.add(BtnGamgRoom1);
		
		
		
		
		
		
		
		
		
		
		//ImgGamgRoom1
		//ImgGamgRoom1
		
		//Texto e imagen del anuncio de verder tu dispositivo en la paginainicial
		
//			Vendedorimagen.setBounds(300,50, 250, 250);
//		 	Vendedorimagen.setIcon( new javax.swing.ImageIcon(getClass().getResource("/imagen/iphone2020.jpg")));
		
//			Vendedorimagen.getHeight();
//		  	Vendedorimagen.getWidth();
		
		
		
		
//		/Vendedorimagen.setSize(20);
		this.add(Vendedorimagen);
		
		VendedorTxt.setText("¿vender tu dispotivo ");
		VendedorTxt.setBounds(300, 300, 250, 50);
		this.add(VendedorTxt);
		VendedorTxt2.setText(" para comprar uno nuevo?");
		VendedorTxt2.setBounds(300, 320, 250, 50);
		this.add(VendedorTxt2);
		
		
		
		//3er metodo
		
		//JLabel ImagenLedSetup=new JLabel();
		//ImagenLedSetup.setIcon(new ImagenIcon("/imagenes/Ledsetup.jpg"));
		//ImagenLedSetup.setBounds(800, 50, 250, 205);
		
		//ImageIco iconoimagen =new  ImageIco(getClass())  ();
		
		
		
		
		
		
		
		//ImgGamgRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GamingRoom.jpg")));

		
		
		
		
		
		
		
		
		//Carrito en el menu principal LISTA
		
		//LISTA CARRITO en MENU PRINCIPAL
		
		//posicion 
		CarritoC.setBounds(30, 386, 200, 220);
		this.add(CarritoC);
		
		CarritoCtxt.setText("Carrito de compras");
		CarritoCtxt.setBounds(30, 600, 150, 30);
		this.add(CarritoCtxt);
		
		CarritoPrecioList.setBounds(240,386,200,220);
		this.add(CarritoPrecioList);
		
		CarritoPrecioMenu.setText("Precio de Producto");
		CarritoPrecioMenu.setBounds(250,600, 150,30 );
		this.add(CarritoPrecioMenu);
		
		
		
		
	//	ImagRoomMenu1.setBounds(15, 90, 200, 100);
		
		LabelRoomMenu1.setBounds(15, 50, 200, 100);
		this.add(LabelRoomMenu1);
		
	//	this.add(ImagRoomMenu1);
		
		this.setVisible(true);
		
		  
		
		//JTextField CarritoCtxt=new JTextField();
		
		//Cambiar a buscar		System.out.print("Laconstraseña generada es fuerte");

		
		
		
		//Cambiar lista a buscar 
		//JList CarritoC=new JList();
		
		
		
		
		
		
		////////////
		
		
		///Tabla de Mysql
		
		
			
		/////////////
		
		
		
		
		
		
		//  ººfin Public Void
		
		
		
	}
	
	
	
	JLabel CarritoPrecioMenu = new JLabel();
	
	
	
// imagen 1 Cuarto con led de muestra
	String ImagenRoomMenu1 = "imagenes//GamingRoom.jpg";
	ImageIcon ImagRoomMenu1  =new  ImageIcon(ImagenRoomMenu1);
	JLabel  LabelRoomMenu1 = new  JLabel(ImagRoomMenu1);
	
	//  ||||||||||||||||||||||||||||||||||||||||||||||||||ESCUCHADORES Y |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	
	
	
	//Barra
	JMenuBar mnuBarra=new JMenuBar();
	
	
	
	//MenuPrincipal 
	JMenu mnuPagPrinc=new JMenu();
	JMenuItem mnuNovedades=new JMenuItem();

	JTextField txtFix=new JTextField();
	JTextField txtVender=new JTextField();
	JTextField txtPagPrin=new JTextField();

	
	
//	JVentana Objeto =new JVentana();
	
	
/////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	////////    VENTANAS //////////
	
	
	//     LoginW Loguear=new LoginW();
	
	     // RegistrarW Registrarwin =new RegistrarW();
	 
	 // InterfazR InterfazRichMP =new InterfazR();

	  
	  
	     //InterfazR InterfazRicha =new InterfazR();
	
	   // VistPrevProd  VentVisProd =new VistPrevProd();
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	//Variables para la contraseña
	
	JList RegistroUsuario=new JList();
	
	
	
	
	JButton CarritoCtxt=new JButton();
	
		
	
	JList CarritoC  =  new JList();
	JList  CarritoPrecioList = new  JList();
	//
	
	//IMAGENES y texto de la pagina de inicio
	
	
	///////
	JLabel ImgGamgRoom1=new JLabel();
	JButton BtnGamgRoom1 =new JButton() ;
	JLabel txtCmprGamingRoom1 =new JLabel();
	JLabel txt2CmprGamingRoom1 =new JLabel();
	//////////2///////////////
	
	
	
	
	//////////////////////
	JLabel TiendaImg=new JLabel();
	JButton btnShop=new JButton();
	JLabel txtTienda=new JLabel();
	JTextField TiendaTitulo=new JTextField();
	/////////////////////
	
	
	
	
	
	
	
		
	JLabel Vendedorimagen=new JLabel();
	JLabel VendedorTxt=new JLabel();
	JButton BtnVendedor=new JButton();
	JTextField Vendedor=new JTextField();
	JLabel VendedorTxt2=new JLabel();
	
	
	
	
	//IMAGEN DE MENU PRINICPAL 1
		
	JButton imagenTecno1 =new JButton();
	
	
	
	
	
	//Tabla Productos menu principal
	//JTable tablaMPrin = new JTable();
	
	
	//Tienda + categorias
	JMenu mnuShop=new JMenu();
	JMenuItem mnuCateLap=new JMenuItem();
	JMenuItem mnuCatePC=new JMenuItem();
	JMenuItem mnuCateTablet=new JMenuItem();
	JMenuItem mnuCateCel=new JMenuItem();
	JMenuItem mnuCateShop=new JMenuItem();
	
	
	//Menu Configurtacion
	JMenu mnuConfig=new JMenu();
	
	
	
	//Submenus Configuracion Colores Temas
	JMenu confColor=new JMenu();
	JMenuItem colorAma=new JMenuItem();
	JMenuItem colorRojo=new JMenuItem();
	JMenuItem colorAzul=new JMenuItem();
	JMenuItem colorVerde=new JMenuItem();
	JMenuItem colorNegro=new JMenuItem();
	JMenuItem colorBlanco=new JMenuItem();
	JMenuItem colorMorado=new JMenuItem();
	
	
	
	
	
	
	//Agregar Usuarios
	//Listas
	
	JList RegNuevoUsu=new JList();
	JList CarritoCom = new JList();
	JList datosNombre  =new JList();
	
	//Redistro Usuarios
	//Listas
	JList NombreDat =new JList();
	
	
	
	
	
	
	//Inicar sesion
			//MENUS DE LA BARRA
	JMenu mnuUsuario=new JMenu();
	JMenuItem mnuRegistrar=new JMenuItem();
	JMenuItem mnuIniSesion=new JMenuItem();
	JMenuItem mnuCerrarSes=new JMenuItem();
	
	//Insertar listas
	JList UsuarioDatos=new JList();
	
	
	
	//menus Solicitud de envios Arreglos FIX
	//MENUS 
	JMenu mnuFix=new JMenu();
	JMenuItem mnuSolicFix=new JMenuItem();	
	JMenuItem mnuMisolicitu=new JMenuItem();
	
	
	//Buscar Barra BUSCADOR
	JButton btnBuscar=new JButton();
	JTextField Busqbar=new JTextField();
	JLabel BusqText=new JLabel();
	
	
	
	
	JList ListProd=new JList();
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Object escuchador=new Object();
		escuchador=e.getSource();
		
		
		
		Object GamingRoom1=new Object();
		GamingRoom1=e.getSource();
		
		//GamingRoom1.SetText("GamingRoom1");
		//GamingRoom1.Nombre("GamingRoom1");
		
		
			
		
		
		//PRIMER IF     INICIAR SESION
	//	if (escuchador == mnuIniSesion) {
			
			//this.add(Loguear);
			//setVisible(true);
			
			
			
	//	}
		
		
		
		
			
		//	 Cambiar COLORES 
		
				if 		(escuchador == mnuPagPrinc) {
				//activar de nuevo el programa de pagina principal
				}
		
		
		
				if 		(escuchador == colorVerde) {
				//Cambiar el color de fondo a verde
				this.getContentPane().setBackground(new Color(0,255,0));
				}
			
		
		
				if 	(escuchador == colorNegro) {
				//Cambiar el color de fondo a negro
					this.getContentPane().setBackground(new Color(0,0,0));						
				}
		
		
		
				if 	(escuchador == colorAma) {
				//Cambiar el color de fondo a Amarillo
				this.getContentPane().setBackground(new Color(255,255,0));						
				}
		
		
		
				if 	(escuchador == colorRojo) {
				//Cambiar el color de fondo a Rojo
				this.getContentPane().setBackground(new Color(255,0,0));						
				}
		
		
		
				if 	(escuchador == colorAzul) {
					//Cambiar el color de fondo a Azul
				this.getContentPane().setBackground(new Color(0,200,255));						
				}
		
		
		
		
				if (escuchador == colorBlanco) {
				//Cambiar el color de fondo a Blanco
				this.getContentPane().setBackground(new Color(200,200,200));						
				}
		
				
				
				if (escuchador == colorMorado) {
					//Cambiar el color de fondo a Blanco
					this.getContentPane().setBackground(new Color(125,60,153));						
					}
			
		
		
				
				
			
			
		
		
				if (escuchador == mnuPagPrinc) {
					LoginW Loguear=new LoginW();
			Loguear.setVisible(false);
			
					
					
					RegistrarW Registrarwin =new RegistrarW();
					Registrarwin.setVisible(false);
					
					
					FixClass  fixWindow = new   FixClass();
					fixWindow.setVisible(false);
					
					VentMenuPrincipal  MenuPrincipal = new VentMenuPrincipal();
					MenuPrincipal.setVisible(true);
					
					
				}
		
		
		
		
				if (escuchador == mnuShop) {
			
				}
		
				
				if ( escuchador == mnuFix)  {
					
					FixClass  fixWindow = new   FixClass();
					fixWindow.setVisible(true);
					
					
				}
				
				
		
		
				//if ( Sesion no esta iniciada  ) {
			
		
				if (escuchador == btnBuscar ) {
				
				//NECESITO LEER 
				this.getContainerListeners();



				modeloBuscar.addElement(Busqbar.getText());
				
				// var 
				CarritoC.setModel(modeloBuscar);
				
				
				//  Leer escrito en la barra de busqueda y buscar 
				//	Un producto 
				//   SELECT* FROM WHERE  
				
				}
		
				
				
				if (escuchador == mnuIniSesion) {  
					
					LoginW Loguear=new LoginW();
					Loguear.setVisible(true);
					
					
				}
				
				
				
			//	if (escuchador == btnCancelar) {  
					
			//		LoginW Loguear=new LoginW();
			//		Loguear.setVisible(false);
					
					
			//	}
				
				
				
				// 
				if (escuchador==mnuRegistrar ) {
					
					RegistrarW Registrarwin =new RegistrarW();
					Registrarwin.setVisible(true);
				//	mnuRegistrar.setVisible(true);
					
					
				}
			
				
				
//				if (escuchador == CarritoCtxt) {
					
					
					//LoginW Loguear=new LoginW();
					//Loguear.setVisible(true);
					
					
					
//				}
				
				
				
				//if (esuchcador == )
				//LoginW Loguear=new LoginW();
				//Loguear.setVisible(true);
				
				
				
				
				

		//if (Sesion == null) {
			
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
			//    MENSAJE DE ADVERTENCIA 	
				
	//	   JOptionPane.showMessageDialog(null, "Tienes que iniciar sesion primero ");
		
		  ////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
		   
		// //////  FALTA BUSCAR ABRIR VENTANA PARA INCIAR SESION
				//	if () {
			
			
			
			
			
			//   		}
		
			
			
			
		
		
			
			
			
			
			}
		
		
		
		
		
		
		
		
			
//	}
		
		
		
	//}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////// CO DIGO DE RICHARD /////////////////////////
	
	
	
	

	
	
	
	
	
	
	
	
	
}
