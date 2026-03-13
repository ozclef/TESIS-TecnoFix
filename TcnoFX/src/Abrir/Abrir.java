//TECNOFIX ABRIR

package Abrir;

//import NewProyectTecnoFX.VentaMenuPrincipal;
import javax.swing.*;

//import VentMenuPrincipal.VentMenuPrincipal;
import VentMenuPrincipal.VentMenuPrincipal;

import java.awt.*;






public class Abrir  {
	
	
	
	ImageIcon ImagIntro  = new ImageIcon("Imagenes//OndasColoresFondo.gif");
	static JLabel LabelIntro = new JLabel();
	static JWindow WinIntro = new JWindow();
	
	public static void main(String[]args) {
		new VentMenuPrincipal();
		
		
		
		WinIntro.add(LabelIntro);
		WinIntro.setSize(300,150);
		WinIntro.setLayout(new FlowLayout());
		WinIntro.setLocationRelativeTo(null);
		WinIntro.show();
		try
		{
		Thread.sleep(9000);
		}catch (Exception e){}

		WinIntro.setVisible(false);
		
		// MenuPrincipal j =new MenuPrincipal();
		// j.MenuTCNX();	
		
		
		
		
		//new InterfazMP();
		
	}

}
