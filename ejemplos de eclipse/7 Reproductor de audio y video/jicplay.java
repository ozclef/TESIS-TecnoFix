import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.media.*;//API de JAVA para multimedia JMF(JAVA MEDIA FRAMEWORK)

public class jicplay extends Thread {
//Se definen las variables y objetos
static JFileChooser filechoser; //Objeto para seleccionar el archivo
static int resul,con; 
static URL mediaURL;//Permie guardar la ubicacion de un archivo
static JFrame mediaTest,frec;
static JMenu menu,mresol;
static JMenuItem menuo,menuc,mres600,mres800,mres1000,menur;
static JMenuBar menub;
static ImageIcon fondo,imp3;//Objeto que carga imagenes
static JLabel lfondo,lmp3;
static String surl;
static Component controls;//Obejo controlador de reproduccion 
static Component video;//Obejo contenedor de video 
static Player mediaPlayer;//Objeto reproductor
static JPanel panvideo;
static JButton bplay,brep;
static Choice chrec;
static Boolean ban=true;
//static KeyEvent evento; 

public void play()//Metodo contiene toda la visualización del reproductor
{
mediaTest=new JFrame("JIC&PLAY"); //Objeto contenedor de todos loc omponentes
mediaTest.setContentPane(new Contenedor()); // Hereda el fondo del frame de la clase contenedor
mediaTest.setLayout(new BorderLayout()); 
fondo = new ImageIcon("ProjectJIC.PNG"); //Objeto que contiene una imagen
lfondo = new JLabel(fondo);//Objeto que contiene el objeto Imagen Icon
imp3 = new ImageIcon("skin.gif"); //Objeto que contiene una imagen
lmp3 = new JLabel(imp3);//Objeto que contiene el objeto Imagen Icon
lmp3.setVisible(false);
menub= new JMenuBar();//Construtor de la barra de menus
menub.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
menu = new JMenu("Archivo");//Construtor de un menu
menu.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
menuo = new JMenuItem("Abrir");//Construtor de un item en un menu
menuo.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
menuo.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){abrir();}});//Evento que permite a un objeto ejecutar un metodo
menur = new JMenuItem("Recientes");//Construtor de un item en un menu
menur.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
menur.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){reproducciones();}});
menuc = new JMenuItem("Cerrar");//Construtor de un item en un menu
menuc.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
menuc.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){System.exit(0);}});//Evento que permite a un objeto ejecutar un metodo
mresol = new JMenu("Resolución");//Construtor de un menu
mresol.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
mresol.setEnabled(false);
mres600 = new JMenuItem("600 x 500");//Construtor de un item en un menu
mres600.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
mres600.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){resolucioseis();}});//Evento que permite a un objeto ejecutar un metodo
mres800 = new JMenuItem("800 x 600");//Construtor de un item en un menu
mres800.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
mres800.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){resolucionocho();}});//Evento que permite a un objeto ejecutar un metodo
mres1000 = new JMenuItem("1000 x 800");//Construtor de un item en un menu
mres1000.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
mres1000.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){resoluciomil();}});//Evento que permite a un objeto ejecutar un metodo
mresol.add(mres600);// Agrega un obejeto a otro objeto
mresol.add(mres800);// Agrega un obejeto a otro objeto
mresol.add(mres1000);// Agrega un obejeto a otro objeto
menub.add(menu);// Agrega un obejeto a otro objeto
menub.add(mresol);// Agrega un obejeto a otro objeto
menu.add(menuo);// Agrega un obejeto a otro objeto
menu.add(menur);// Agrega un obejeto a otro objeto
menu.add(menuc);// Agrega un obejeto a otro objeto
//Insets posicion =mediaTest.getInsets();
bplay= new JButton(fondo);//Constructor de un boton
bplay.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
bplay.addActionListener(new ActionListener (){public void actionPerformed (ActionEvent e){abrir();}});//Evento que permite a un objeto ejecutar un metodo
mediaTest.setJMenuBar(menub);//Agrega el menu a un Frame
mediaTest.add(bplay,BorderLayout.CENTER);//Ubica un el boton en el centro del frame
mediaTest.add(lmp3,BorderLayout.NORTH);//Ubica un el label la parte superior del frame
mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Permite salir de la aplicacion con la x del frame
mediaTest.setSize(600,500);//Dimensiona la ventana del frame
mediaTest.setVisible(true); //Permite visualizar el frame
mediaTest.setResizable(false);//No permite modificar el tamaño de la ventana del frame
}

public void abrir()//Metodo que permite abrir los archivos con extension MP3 y MPG
{
filechoser=new JFileChooser();//Constructor de un objeto que permite seleccionar un archivo y cargarlo en el reproductor

//if(resul == JFileChooser.APPROVE_OPTION){//Condicion que verifica que el archivo halla sido cargado correctamente
	try{
	if(ban==true)
	{
		mediaURL=null;
		resul=filechoser.showOpenDialog(null);//Variable entera que valida el archivo seleccionado
		surl=filechoser.getSelectedFile().toString();//Guarda en un String la direccion del directorio del archivo que se cargo
		try
	    {
			BufferedReader in = new BufferedReader (new FileReader("reproducciones.in"));  //se prepara para leer el archivo reproducciones.in
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter ("reproducciones.out"))); //se prepara para escribir en el archivo reproducciones.out
			String linea ="";
			while((linea=in.readLine())!=null){//se verifica que exista algo en el archivo in
				  StringTokenizer st = new StringTokenizer(linea); // se crea el toke 
				  String sin = st.nextToken(",");	//carga en la variable sin lo contenido en el archivo in
				  out.println(sin);//se escribe lo contenido en sin en el archivo out
				  }
		     out.println(surl);//se escribe la url del ultimo archivo cargado en el archivo out
			 out.flush();  // se cierra el archivo out
		Process cambiarnombre= Runtime.getRuntime().exec("cmd.exe /K start convert.cmd");//se ejecuta un un .cmd que intercambia de nombre al .out y al .in
	
		}catch (Exception e){}
	
		mediaURL=filechoser.getSelectedFile().toURL();//Carga el archivo seleccionao

	}
		
	jicplay r=new jicplay();//Constructor de la clase jicplay
	if(surl.endsWith(".mp3")||surl.endsWith(".MP3") )//Condicion verifica la extensión del archivo cargado sea igual a mp3
		{
		if(con>0)//Bandera que solo se ejecuta cuando se carga despues de la primera vez un archivo 
			{
			mediaPlayer.close();//Cierra el objeto reproductor que se estaba ejecutando
			panvideo.setVisible(false);	//Oculta el Panel que contiene al reproductor
			}
		 mresol.setEnabled(false);//Deshabilita la opcion de elegir la resolucion
		 mediaTest.setSize(590,475);// dimensiona la ventana a 600 ancho x 500 de alto
		 mediaTest.setResizable(false);//No permite modificar el tamaño de la ventana del frame
		 bplay.setVisible(false);//Oculta el boton 
		 lmp3.setVisible(true);//Muestra el label
		 r.start();//Incia el hilo que permite visualizar el video o escuchar una cancion y cargar otro archivo a la vez
		 }
		else
		if(surl.endsWith(".mpg")||surl.endsWith(".MPG") )//Condicion verifica la extensión del archivo cargado sea igual a mpg
		{
			if(con>0)//Bandera que solo se ejecuta cuando se carga despues de la primera vez un archivo
			{
			mediaPlayer.close();//Cierra el objeto reproductor que se estaba ejecutando
			panvideo.setVisible(false);	//Oculta el Panel que contiene al reproductor
			}
		mediaTest.setResizable(true);//Permite modificar el tamaño de la ventana del frame
		lmp3.setVisible(false);//Oculta el label
	    bplay.setVisible(false);//Oculta el boton
	    mresol.setEnabled(true);//Habilita la opcion de elegir la resolucion
		r.start();//Incia el hilo que permite visualizar el video o escuchar una cancion y cargar otro archivo a la vez
	
		}
		else //Condicion que valida que el archivo cargado se diferente a mp3 y mpg
		{
		JOptionPane.showMessageDialog(null,"FORMATO DESCONOCID0");	//Muestra un mensaje si la condicion anterio se cumple
		}
	con=1;//Variable que controla la bandera que controla el numero de veces que se ha cargado un arhivo en el reproductor
	ban=true;
	} catch(MalformedURLException malforme){JOptionPane.showMessageDialog(null,"Error no hay url");	}//Valida que el objeto url halla sido cargada
	
//}

}
public void run() //Metodo que inicia el hilo e inicia la reproduccion del archivo cargado en el reproductor
{
	
	panvideo= new JPanel();//Constructor del panel que contiene el video y los controles multimedia
	panvideo.setLayout(new BorderLayout());//Segmenta la ventana
	Manager.setHint(Manager.LIGHTWEIGHT_RENDERER,true);
	try{
	    mediaPlayer=Manager.createRealizedPlayer(jicplay.mediaURL);// crea un reproductor especificando la direccion del archivo
		video= mediaPlayer.getVisualComponent(); //Constructor del objeto video
	    controls=mediaPlayer.getControlPanelComponent(); //Constructor del objeto controlador del video
	    controls.setCursor(new Cursor(Cursor.HAND_CURSOR));//Cambia el cursor por una mano cuando se pasa por encima del objeto
		if(video!= null)//Condicion que verfica que exista el objeto video
		{
			 panvideo.add(video,BorderLayout.CENTER); //Agrega el video en la parte superior del panel
		}
		
		if(controls!=null)//Condicion que verfica que exista el objeto controls
		{
		   	 panvideo.add(controls,BorderLayout.SOUTH); //Agrega los controles en la parte inferior del panel
		}
		mediaPlayer.start();//Inicia la reproduccion del video
		mediaTest.add(panvideo,BorderLayout.CENTER);//Agrega el panel al objeto reproductor
		mediaTest.show();//Permite visualizar el objeto reproductor
		}
		
	catch(NoPlayerException noplayerexception)//excepción de algun error en el reproductor
	{
	        JOptionPane.showMessageDialog(null,"NO EXISTE LA RUTA");//muestra un mensaje de error de la excepción  
			JOptionPane.showMessageDialog(null,"EL PROGRAMA DEBE CERRARSE");//muestra un mensaje  de advertencia
			System.exit(0);
	}
	
	catch(CannotRealizeException noreleace)//excepción de algun error en el archivo a reproducir
	{
			JOptionPane.showMessageDialog(null,"ARCHIVO DESCONOCIDO");//muestra un mensaje de error de la excepción  
	}
	
	catch(IOException es)//excepción de algun error al leer la fuente
	{
			JOptionPane.showMessageDialog(null,"ERROR AL LEER FUENTE");//muestra un mensaje de error de la excepción  
	}
}

public void resolucionocho()//metodo para redimensionar la ventana a 800 ancho x 600 alto
{
	mediaTest.setSize(800,600);//redimensiona la ventana a 800 ancho x 600 alto
	mediaTest.show();//Permite actualizar la nueva configuracion del objeto frame
}

public void resolucioseis()//metodo para redimensionar la ventana a 600 ancho x 500 alto
{
	mediaTest.setSize(600,500);//redimensiona la ventana a 600 ancho x 500 alto
	mediaTest.show();//Permite actualizar la nueva configuracion del objeto frame
}

public void resoluciomil()//metodo para redimensionar la ventana a 1000 ancho x 800 alto
{
	mediaTest.setSize(1000,800);//redimensiona la ventana a 600 ancho x 500 alto
	mediaTest.show();//Permite actualizar la nueva configuracion del objeto frame
}

 public void reproducciones()
{
  try
    {
    	frec= new JFrame("Ultimas Reproducciones");//Crea un ventana
    	brep= new JButton("Reproducir");//Crea el boton reproducir
    	brep.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){replast();}});//Llama al metodo replast
    	chrec= new Choice ();//Crea un objeto de lista
		BufferedReader in = new BufferedReader (new FileReader("reproducciones.in"));  //se prepara para leer el archivo reproducciones.in
		String linea ="";
		while((linea=in.readLine())!=null){//se verifica que exista algo en el archivo in
			  StringTokenizer st = new StringTokenizer(linea); // se crea el toke 
			  String sin = st.nextToken(",");	//carga en la variable sin lo contenido en el archivo in
			  chrec.addItem(sin);//Agrega las ultimas url leidas a una lista
			  }
	    frec.setLayout(new FlowLayout());//Organiza los odbejos en la ventana
	    frec.add(chrec); //Agrga la lista a la ventana
		frec.add(brep);	 //Agrega el boton reproducir a la ventana
		frec.reshape(100,100,500,100);	//Le da el tamaño a la ventana
	    frec.show();//Muestra la venatana
	}catch (Exception e){}  
}

public void replast()
{
try{
	surl=chrec.getSelectedItem();//Guarda en un String la ocpcion seleccionada de la lista
	File archivo = new File(surl);//Crea una variable File
	mediaURL=archivo.toURI().toURL();//Convierte de String a URL
	ban=false;//Variable boolean que se utiliza como bandera
	abrir();//Llama al metodo abrir
	frec.setVisible(false);//Oculta la ventana
} catch(MalformedURLException malforme){JOptionPane.showMessageDialog(null,"Error no hay url");	}
}
public static void main (String[] args) {//Metodo principal construye la clase

jicplay x= new jicplay();//Construye la clase
x.play(); //Abre la venta del reproductor


}
}
