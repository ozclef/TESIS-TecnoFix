//package InterfazRM;

//public class InterfazR {

//}






package InterfazRM;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;



public class InterfazR extends JFrame implements ActionListener {
	
	
	
	public InterfazR() {
		
		
		
		
		componentes();
		
		
	}
	
	
	
	////////////////////////////////////////
	
	
	
	public void componentes() {
		
		
		
		this.setTitle("Electronica");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		
		
		mnuInicio.setText("Perfil");
		mnuRegistro.setText("Iniciar Sesion");
		mnuInicio.add(mnuRegistro);
		mnuColor.setText("Fondo");
		mnuColor.add(mnuC1);
		mnuColor.add(mnuC2);
		mnuColor.add(mnuC3);
		mnuColor.add(mnuC4);
		mnuColor.add(mnuC5);
		
		mnuC1.setText("Verde");
		mnuC2.setText("Azul");
		mnuC3.setText("Amarillo");
		mnuC4.setText("Rojo");
		mnuC5.setText("Morado");
		
		mnuC1.addActionListener(this);
		mnuC2.addActionListener(this);
		mnuC3.addActionListener(this);
		mnuC4.addActionListener(this);
		mnuC5.addActionListener(this);
		
		mnuAyuda.setText("Ayuda");
		mnuAyuda.add(mnuSolicitar);
		mnuSolicitar.setText("Acerca de:");
		mnuSolicitar.addActionListener(this);
		
		mnuInicio.addActionListener(this);
		
		mnuCategoria.setText("Categoria");
		mnuComponentes.setText("Cómponentes");
		mnuCategoria.add(mnuComponentes);
		mnuDD.setText("Discos Duros/ SSD / NAS");
		mnuCategoria.add(mnuDD);
		mnuMR.setText("Memorias RAM y Flash");
		mnuCategoria.add(mnuMR);
		mnuMonitor.setText("Monitores");
		mnuCategoria.add(mnuMonitor);
		mnuDE.setText("Dispositivos de Entrada");
		mnuCategoria.add(mnuDE);
		mnuRedes.setText("Redes");
		mnuCategoria.add(mnuRedes);
		mnuServidor.setText("Servidores");
		mnuCategoria.add(mnuServidor);
		mnuA.setText("Adaptadores");
		mnuCategoria.add(mnuA);
		mnuCable.setText("Cables");
		mnuCategoria.add(mnuCable);
		mnuCompu.setText("Computadoras");
		mnuCategoria.add(mnuCompu);
		
		// iNICIO DE LA CATEGORIA DE COMPONENTES
		mnuProcesadores.setText("Precesadores");
		mnuComponentes.add(mnuProcesadores);
		mnuProcesadoresS.setText("Procesadores para Servidores");
		mnuProcesadores.add(mnuProcesadoresS);
		mnuProcesadoresPC.setText("Procesadores para PC's");
		mnuProcesadores.add(mnuProcesadoresPC);
		
		mnuTarjetasM.setText("Tarjetas Madre");
		mnuComponentes.add(mnuTarjetasM);
		
		mnuTarjetasV.setText("Tarjetas de Video");
		mnuComponentes.add(mnuTarjetasV);
		
		mnuFuentes.setText("Fuentes de Poder para PC's");
		mnuComponentes.add(mnuFuentes);
		
		mnuVentilación.setText("Enfriamiento y Ventilación");
		mnuComponentes.add(mnuVentilación);
		mnuDisipador.setText("Disipadores para CPU");
		mnuVentilación.add(mnuDisipador);
		mnuEnfriamiento.setText("Enfiramiento Líquido");
		mnuVentilación.add(mnuEnfriamiento);
		mnuVentilador.setText("Ventiladores");
		mnuVentilación.add(mnuVentilador);
		mnuDisipadorVGA.setText("Disipadores VGA");
		mnuVentilación.add(mnuDisipadorVGA);
		mnuVentiladorRAM.setText("Ventiladores para RAM");
		mnuVentilación.add(mnuVentiladorRAM);
		mnuControlV.setText("Control de Ventiladores");
		mnuVentilación.add(mnuControlV);
		mnuPasta.setText("Pasta Termica");
		mnuVentilación.add(mnuPasta);
		mnuAccesoriosEL.setText("Accesorios para Enfriarmiento Líquido");
		mnuVentilación.add(mnuAccesoriosEL);
		
		mnuTarjetasE.setText("Tarjetas de Expansión");
		mnuComponentes.add(mnuTarjetasE);
		mnuTPCIE.setText("Tarjetas PCI Express");
		mnuTarjetasE.add(mnuTPCIE);
		mnuTPCI.setText("Tarjetas PCI");
		mnuTarjetasE.add(mnuTPCI);
		mnuExpress.setText("ExpressCard");
		mnuTarjetasE.add(mnuExpress);
		mnuTS.setText("Tarjetas de Sonido");
		mnuTarjetasE.add(mnuTS);
		mnuTarjetaI.setText("Tarjetas dde Interfaz");
		mnuTarjetasE.add(mnuTarjetaI);
		mnuRAID.setText("Tarjetas RAID");
		mnuTarjetasE.add(mnuRAID);
		mnuCE.setText("Cajas de Expasión");
		mnuTarjetasE.add(mnuCE);
		mnuTarjetaT.setText("Tarjeta de Televisión");
		mnuTarjetasE.add(mnuTarjetaT);
		
		mnuComponentes.add(mnuTarjetasE);
		
		mnuAccesorios.setText("Accesorios para Gabinetes");
		mnuComponentes.add(mnuAccesorios);		
		// TERMINO DE LA CATEGORIA DE COMPONENTES
		
		mnuSSD.setText("SSD");
		mnuDD.add(mnuSSD);
		mnuDDPC.setText("Discos Duros Internos para PC");
		mnuDD.add(mnuDDPC);
		mnuDDL.setText("Discos Duros Internos para Laptop");
		mnuDD.add(mnuDDL);
		mnuDDV.setText("Discos Duros para Servidores");
		mnuDD.add(mnuDDV);
		mnuDDV.setText("Discos Duros para Vigilancia");
		mnuDD.add(mnuDDV);
		mnuDDN.setText("Discos Duros para NAS");
		mnuDD.add(mnuDDN);
		mnuDDE.setText("Discos DUROS Externos");
		mnuDD.add(mnuDDE);
		mnuAN.setText("Almacenamiento NAS");
		mnuDD.add(mnuAN);
		mnuAMSA.setText("Almacenamiento MSA");
		mnuDD.add(mnuAMSA);
		mnuAPN.setText("Almacenamiento Personal en la Nube");
		mnuDD.add(mnuAPN);
		mnuADD.setText("Accesorios para Discos Duros");
		mnuDD.add(mnuADD);
		mnuGDD.setText("Gabinetes para Discos Duros");
		mnuADD.add(mnuGDD);
		mnuAdaptadores.setText("Adaptadores para Discos Duros");
		mnuADD.add(mnuAdaptadores);
		mnuREB.setText("Rack Extraíbles y Backplanes");
		mnuADD.add(mnuREB);
		mnuSAM.setText("Soportes y Accesorios para Montaje");
		mnuADD.add(mnuSAM);
		// TERMINO DE LA CATEGORIA DE DISCOS DUROS
		
		mnuMRPC.setText("Memoria RAM para PC");
		mnuMR.add(mnuMRPC);
		mnuMRL.setText("Memoria RAM para Laptop");
		mnuMR.add(mnuMRL);
		mnuMRM.setText("Memoria RAM para Mac");
		mnuMR.add(mnuMRM);
		mnuMRS.setText("Memoria RAM para Servidores");
		mnuMR.add(mnuMRS);
		mnuMF.setText("Memorias Falsh");
		mnuMR.add(mnuMF);
		mnuUSB.setText("Memorias USB");
		mnuMR.add(mnuUSB);
		mnuLM.setText("Lectores de Memoria");
		mnuMR.add(mnuLM);
		// TERMINO DE LA CATEGORIA DE MEMORIAS RAM
		
		mnuM.setText("Monitores");
		mnuMonitor.add(mnuM);
		mnuSM.setText("Soportes para Monitores");
		mnuMonitor.add(mnuSM);
		// TERMINO DE LA CATEGORIA DE MONITORES
		
		mnuKTM.setText("Kids de Teclado y Mouse");
		mnuDE.add(mnuKTM);
		mnuMouse.setText("Mouse");
		mnuDE.add(mnuMouse);
		mnuMousepads.setText("Mousepads");
		mnuDE.add(mnuMousepads);
		mnuTeclado.setText("Teclados");
		mnuDE.add(mnuTeclado);
		mnuTN.setText("Teclados Numéricos");
		mnuDE.add(mnuTN);
		mnuTG.setText("Tabletas Gráficas");
		mnuDE.add(mnuTG);
		// TERMINO DE LA CATEGORIA DE DISPOSITIVOS DE ENTRADA
		
		mnuS.setText("Switches");
		mnuRedes.add(mnuS);
		mnuR.setText("Router");
		mnuRedes.add(mnuR);
		mnuAP.setText("Access Point");
		mnuRedes.add(mnuAP);
		mnuWFM.setText("Wi-Fi en Malla");
		mnuRedes.add(mnuWFM);
		mnuER.setText("Extensores de Rango");
		mnuRedes.add(mnuER);
		mnuModem.setText("Modems");
		mnuRedes.add(mnuModem);
		mnuARUSB.setText("Adaptadores de Red USB");
		mnuRedes.add(mnuARUSB);
		mnuPower.setText("Powerline");
		mnuRedes.add(mnuPower);
		mnuAntenas.setText("Antenas");
		mnuRedes.add(mnuAntenas);
		mnuURO.setText("Unidades de Red Óptica");
		mnuRedes.add(mnuURO);
		// TERMINO DE LA CATEGORIA DE REDES
		
		mnuServidores.setText("Servidores");
		mnuServidor.add(mnuServidores);
		mnuSI.setText("Servidores de Impresión");
		mnuServidor.add(mnuSI);
		mnuUC.setText("Unidades de Cinta");
		mnuServidor.add(mnuUC);
		mnuDiscoDuroServidor.setText("Discos Duros para Servidores");
		mnuServidor.add(mnuDiscoDuroServidor);
		mnuAS.setText("Accesorios para Servidores");
		mnuServidor.add(mnuAS);
		mnuFP.setText("Fuentes de Poder");
		mnuAS.add(mnuFP);
		mnuCES.setText("Cableado Estructurado para Servidores");
		mnuAS.add(mnuCES);
		mnuKM.setText("Kits de Montaje");
		mnuAS.add(mnuKM);
		mnuSKVM.setText("Servidores KVM");
		mnuAS.add(mnuSKVM);
		mnuCKVM.setText("Cables KVM");
		mnuAS.add(mnuCKVM);
		mnuC.setText("Controladoras");
		mnuAS.add(mnuC);
		mnuES.setText("Enfriamiento para Servidores");
		mnuAS.add(mnuES);
		mnuSOS.setText("Sistemas Operativos para Servidores");
		mnuServidor.add(mnuSOS);
		mnuSD.setText("Soportes de Datos");
		mnuServidor.add(mnuSD);
		mnuDLT.setText("DTL");
		mnuSD.add(mnuSD);
		mnuU.setText("Ultium");
		mnuSD.add(mnuU);
		mnuE.setText("Enterprise");
		mnuSD.add(mnuE);
		mnuRDX.setText("RDX");
		mnuSD.add(mnuRDX);
		mnuCL.setText("Cartuchos de Limpieza");
		mnuServidor.add(mnuCL);
		mnuUltrium.setText("Utrium");
		mnuCL.add(mnuUltrium);
		mnuDDS2.setText("DDS");
		mnuCL.add(mnuDDS2);
		// TERMINO DE LA CATEGORIA DE SERVIDORES
		
		mnuAA.setText("Adaptadores Audio");
		mnuA.add(mnuAA);
		mnuAAUSB.setText("Adaptadores Audio USB");
		mnuAA.add(mnuAAUSB);
		mnuAAAUX.setText("Adaptadores Audio AUX");
		mnuAA.add(mnuAAAUX);
		mnuT.setText("Toslink");
		mnuAA.add(mnuT);
		mnuAV.setText("Adaptadores Video");
		mnuA.add(mnuAV);
		mnuAVDVI.setText("Adaptadores Video DVI");
		mnuAV.add(mnuAVDVI);
		mnuAVHDMI.setText("Adaptadores Video HDMI");
		mnuAV.add(mnuAVHDMI);
		mnuAVVGA.setText("Adaptadores Video VGA/HD15");
		mnuAV.add(mnuAVVGA);
		mnuAVD.setText("Adaptadores Video DisplayPort");
		mnuAV.add(mnuAVD);
		mnuAVS.setText("Adaptadores Video S-Video");
		mnuAV.add(mnuAVS);
		mnuDV.setText("Divisores de Video");
		mnuAV.add(mnuDV);
		mnuERV.setText("Extensores y Receptores de Video");
		mnuAV.add(mnuERV);
		mnuPSLI.setText("Puentes SLI");
		mnuAV.add(mnuPSLI);
		mnuCV.setText("Capturadoras de Video");
		mnuAV.add(mnuCV);
		mnuAPC.setText("Adaptadores PC");
		mnuA.add(mnuAPC);
		mnuSwitchesKVM.setText("Swhitches KVM");
		mnuAPC.add(mnuSwitchesKVM);
		mnuAPCUSB.setText("Adaptadores PC USB");
		mnuAPC.add(mnuAPCUSB);
		mnuSATA.setText("eSATA");
		mnuAPC.add(mnuSATA);
		mnuAPCS.setText("Adaptadores PC Serial");
		mnuAPC.add(mnuAPCS);
		mnuAPCSATA.setText("Adaptadores PC SATA");
		mnuAPC.add(mnuAPCSATA);
		mnuAPCT.setText("Adaptadores PC Teclado");
		mnuAPC.add(mnuAPCT);
		mnuAPCPS.setText("Adaptadores PC PS/2");
		mnuAPC.add(mnuAPCPS);
		mnuAPCIDE.setText("Adaptadores PC IDE");
		mnuAPC.add(mnuAPCIDE);
		mnuRJ.setText("RJ-45");
		mnuAPC.add(mnuRJ);
		mnuRUSB.setText("Repetidores USB");
		mnuA.add(mnuRUSB);
		// TERMINO DE LA CATEGORIA DE ADAPTADORES
		
		mnuBobina.setText("Bobinas");
		mnuCable.add(mnuBobina);
		mnuCablePC.setText("Cables PC");
		mnuCable.add(mnuCablePC);
		mnuCPC.setText("Cables PC KVM");
		mnuCablePC.add(mnuCPC);
		mnuCPCUSB.setText("Cables PC USB");
		mnuCablePC.add(mnuCPCUSB);
		mnuCPCVGA.setText("Cables PC VGA/HD15");
		mnuCablePC.add(mnuCPCVGA);
		mnuCPCT.setText("Cables PC Teclado");
		mnuCablePC.add(mnuCPCT);
		mnuCPCS.setText("Cables PC Serial");
		mnuCablePC.add(mnuCPCS);
		mnuCPCSATA.setText("Cables PC SATA/eSATA");
		mnuCablePC.add(mnuCPCSATA);
		mnuCPCSAS.setText("Cables PC SAS");
		mnuCablePC.add(mnuCPCSAS);
		mnuCPCFW.setText("Cables PC FireWire");
		mnuCablePC.add(mnuCPCFW);
		mnuSCSI.setText("SCSI");
		mnuCablePC.add(mnuSCSI);
		mnuCAV.setText("Cables de Audio/Video");
		mnuCable.add(mnuCAV);
		mnuCAVDVI.setText("Cables de Audio/Video DVI");
		mnuCAV.add(mnuCAVDVI);
		mnuCAVHDMI.setText("Cables de Audio/Video HDMI");
		mnuCAV.add(mnuCAVHDMI);
		mnuCAVVGA.setText("Cables de Audio/Video VGA");
		mnuCAV.add(mnuCAVVGA);
		mnuCAVDP.setText("Cables de Audio/Video DisplayPort");
		mnuCAV.add(mnuCAVDP);
		mnuCAVAUX.setText("Cables de Audio/Video AUX");
		mnuCAV.add(mnuCAVAUX);
		mnuCAVBNC.setText("Cables de Audio/Video BNC");
		mnuCAV.add(mnuCAVBNC);
		mnuCAVT.setText("Cables de Audio/Video Toslink");
		mnuCAV.add(mnuCAVT);
		mnuCAVRCA.setText("Cables de Audio/Video RCA");
		mnuCAV.add(mnuCAVRCA);
		mnuCAVSV.setText("Cables de Audio/Video S-Video");
		mnuCAV.add(mnuCAVSV);
		mnuCR.setText("Cables de Red");
		mnuCable.add(mnuCR);
		mnuCP.setText("Cables Patch");
		mnuCR.add(mnuCP);
		mnuCFO.setText("Cables Fibra Óptica");
		mnuCR.add(mnuCFO);
		mnuCA.setText("Cables de Antena");
		mnuCR.add(mnuCA);
		mnuCSFP.setText("Cables SFP+");
		mnuCR.add(mnuCSFP);
		mnuCS.setText("Cables Stack");
		mnuCR.add(mnuCS);
		mnuCC.setText("Cables Coaxiales");
		mnuCR.add(mnuCC);
		mnuCEnergia.setText("Cables de Poder");
		mnuCable.add(mnuCEnergia);
		mnuCPE.setText("Cables de Poder (Externo)");
		mnuCEnergia.add(mnuCPE);
		mnuCPI.setText("Cables de Poder (Interno)");
		mnuCEnergia.add(mnuCPI);
		mnuCI.setText("Cables de Impresora");
		mnuCable.add(mnuCI);
		// TERMINO DE LA CATEGORIA DE CABLES
		
		mnuPCE.setText("PC's Escritorio");
		mnuCompu.add(mnuPCE);
		mnuPCCPUI.setText("PC's con CPU Intel");
		mnuPCE.add(mnuPCCPUI);
		mnuPCCPUAMD.setText("PC's con CPU AMD");
		mnuPCE.add(mnuPCCPUI);
		mnuPCG.setText("PC's Gamer");
		mnuPCE.add(mnuPCCPUI);
		mnuLab.setText("Laptops");
		mnuCompu.add(mnuLab);
		mnuLabE.setText("Laptops Economicas");
		mnuLab.add(mnuLabE);
		mnuLabT.setText("Laptops para Trabajo");
		mnuLab.add(mnuLabT);
		mnu2en1.setText("2 en 1");
		mnuLab.add(mnu2en1);
		mnuLabG.setText("Laptop Gamer");
		mnuLab.add(mnuLabG);
		mnuLab4K.setText("Laptos 4K");
		mnuLab.add(mnuLab4K);
		mnuLabI.setText("Laptops Intel");
		mnuLab.add(mnuLabI);
		mnuLabAMD.setText("Laptops AMD");
		mnuLab.add(mnuLabAMD);
		mnuTab.setText("Tablets");
		mnuCompu.add(mnuTab);
		mnuTableta.setText("Tabletas");
		mnuTab.add(mnuTableta);
		mnuTabletaG.setText("Tabletas Graficas");
		mnuTab.add(mnuTabletaG);
		mnuAO.setText("All One");
		mnuCompu.add(mnuAO);
		mnuLenovo.setText("Lenovo");
		mnuAO.add(mnuLenovo);
		mnuHP.setText("HP");
		mnuAO.add(mnuHP);
		mnuDell.setText("Dell");
		mnuAO.add(mnuDell);
		mnuAcer.setText("Acer");
		mnuAO.add(mnuAcer);
		mnuW.setText("Workstation");
		mnuCompu.add(mnuW);
		mnuWP.setText("Workstation Portatiles");
		mnuW.add(mnuWP);
		mnuAccesoriosPC.setText("Accesorios para PC's");
		mnuCompu.add(mnuAccesoriosPC);
		mnuBPC.setText("Bases para PC's");
		mnuAccesoriosPC.add(mnuBPC);
		mnuPPC.setText("Protectores para PC's");
		mnuAccesoriosPC.add(mnuPPC);
		mnuKH.setText("Kit de Herramientas");
		mnuAccesoriosPC.add(mnuKH);
		mnuLE.setText("Limpiadores para Electronnicos");
		mnuAccesoriosPC.add(mnuLE);
		mnuIPC.setText("Iluminación para PC");
		mnuAccesoriosPC.add(mnuIPC);
		mnuCandadoPC.setText("Candados para PC");
		mnuAccesoriosPC.add(mnuCandadoPC);
		mnuAccesoriosP.setText("Accesorios Portatiles");
		mnuCompu.add(mnuAccesoriosP);
		mnuBP.setText("Bases para Portátiles");
		mnuAccesoriosP.add(mnuBP);
		mnuCargador.setText("Cargadores");
		mnuAccesoriosP.add(mnuCargador);
		mnuB.setText("Baterias");
		mnuAccesoriosP.add(mnuB);
		mnuMaletin.setText("Malites");
		mnuAccesoriosP.add(mnuMaletin);
		mnuFS.setText("Maletines");
		mnuAccesoriosP.add(mnuFS);
		mnuCandadoL.setText("Fundas y Skin");
		mnuAccesoriosP.add(mnuCandadoL);
		mnuLL.setText("Lamparas para Laptop");
		mnuAccesoriosP.add(mnuLL);
		
		mnuCategoria.addActionListener(this);
		
		mnuBarra.add(mnuInicio);
		mnuBarra.add(mnuCategoria);
		mnuBarra.add(mnuColor);
		mnuBarra.add(mnuAyuda);
		this.setJMenuBar(mnuBarra);
		
		this.show();
	}
	@Override
	public void actionPerformed(ActionEvent i) {
		Object s = new Object();
		s=i.getSource();
		if(s==mnuC1) {
			this.getContentPane().setBackground(new Color(0,255,127));
		}
		else if(s==mnuC2) {
			this.getContentPane().setBackground(new Color(64,224,208));
		}
		else if(s==mnuC3) {
			this.getContentPane().setBackground(new Color(239,184,16));
		}
		else if(s==mnuC4) {
			this.getContentPane().setBackground(new Color(255,0,0));
		}
		else if(s==mnuC5) {
			this.getContentPane().setBackground(new Color(148,0,211));
		}
		else if(s==mnuSolicitar) {
			JOptionPane.showMessageDialog(null,"Sitema de venta\n"+
					"Autor: Ricardo R.L.\n"
					+ "Version 1.0.0\n"
					+ "Moon Light Sotfware");
		}
	}
	JMenu mnuInicio= new JMenu();
	JMenuItem mnuRegistro= new JMenuItem();
	JMenu mnuCategoria= new JMenu();
	JMenu mnuColor=new JMenu();
	JMenuItem mnuC1=new JMenuItem();
	JMenuItem mnuC2=new JMenuItem();
	JMenuItem mnuC3=new JMenuItem();
	JMenuItem mnuC4=new JMenuItem();
	JMenuItem mnuC5=new JMenuItem();
	JMenu mnuAyuda=new JMenu();
	JMenuItem mnuSolicitar=new JMenuItem();
	JMenu mnuComponentes= new JMenu();
	JMenu mnuProcesadores= new JMenu();
	JMenuItem mnuProcesadoresPC= new JMenuItem();
	JMenuItem mnuProcesadoresS= new JMenuItem();
	JMenuItem mnuTarjetasM= new JMenuItem();
	JMenuItem mnuTarjetasV= new JMenuItem();
	JMenuItem mnuFuentes= new JMenuItem();
	
	JMenu mnuVentilación= new JMenu();
	JMenuItem mnuDisipador= new JMenuItem();
	JMenuItem mnuEnfriamiento= new JMenuItem();
	JMenuItem mnuVentilador= new JMenuItem();
	JMenuItem mnuDisipadorVGA= new JMenuItem();
	JMenuItem mnuVentiladorRAM= new JMenuItem();
	JMenuItem mnuControlV= new JMenuItem();
	JMenuItem mnuPasta= new JMenuItem();
	JMenuItem mnuAccesoriosEL= new JMenuItem();
	
	JMenu mnuTarjetasE= new JMenu();
	JMenuItem mnuTPCIE= new JMenuItem();
	JMenuItem mnuTPCI= new JMenuItem();
	JMenuItem mnuExpress= new JMenuItem();
	JMenuItem mnuTS= new JMenuItem();
	JMenuItem mnuTarjetaI= new JMenuItem();
	JMenuItem mnuRAID= new JMenuItem();
	JMenuItem mnuCE= new JMenuItem();
	JMenuItem mnuTarjetaT= new JMenuItem();
	
	JMenuItem mnuAccesorios= new JMenuItem();
	
	JMenu mnuDD= new JMenu();
	JMenuItem mnuSSD= new JMenuItem();
	JMenuItem mnuDDPC= new JMenuItem();
	JMenuItem mnuDDL= new JMenuItem();
	JMenuItem mnuDDS= new JMenuItem();
	JMenuItem mnuDDV= new JMenuItem();
	JMenuItem mnuDDN= new JMenuItem();
	JMenuItem mnuDDE= new JMenuItem();
	JMenuItem mnuAN= new JMenuItem();
	JMenuItem mnuAMSA= new JMenuItem();
	JMenuItem mnuAPN= new JMenuItem();
	JMenu mnuADD= new JMenu();
	JMenuItem mnuGDD= new JMenuItem();
	JMenuItem mnuAdaptadores= new JMenuItem();
	JMenuItem mnuREB= new JMenuItem();
	JMenuItem mnuSAM= new JMenuItem();
	
	JMenu mnuMR= new JMenu();
	JMenuItem mnuMRPC= new JMenuItem();
	JMenuItem mnuMRL= new JMenuItem();
	JMenuItem mnuMRM= new JMenuItem();
	JMenuItem mnuMRS= new JMenuItem();
	JMenuItem mnuMF= new JMenuItem();
	JMenuItem mnuUSB= new JMenuItem();
	JMenuItem mnuLM= new JMenuItem();
	
	JMenu mnuMonitor= new JMenu();
	JMenuItem mnuKTM= new JMenuItem();
	JMenuItem mnuMouse=new JMenuItem();
	JMenuItem mnuMousepads=new JMenuItem();
	JMenuItem mnuTeclado=new JMenuItem();
	JMenuItem mnuTN=new JMenuItem();
	JMenuItem mnuTG=new JMenuItem();
	
	JMenu mnuDE= new JMenu();
	JMenuItem mnuM= new JMenuItem();
	JMenuItem mnuSM=new JMenuItem();
	
	JMenu mnuRedes= new JMenu();
	JMenuItem mnuS= new JMenuItem();
	JMenuItem mnuR=new JMenuItem();
	JMenuItem mnuAP=new JMenuItem();
	JMenuItem mnuWFM=new JMenuItem();
	JMenuItem mnuER=new JMenuItem();
	JMenuItem mnuModem=new JMenuItem();
	JMenuItem mnuARUSB=new JMenuItem();
	JMenuItem mnuPower=new JMenuItem();
	JMenuItem mnuAntenas=new JMenuItem();
	JMenuItem mnuURO=new JMenuItem();
	
	JMenu mnuServidor= new JMenu();
	JMenuItem mnuServidores= new JMenuItem();
	JMenuItem mnuSI=new JMenuItem();
	JMenuItem mnuUC=new JMenuItem();
	JMenuItem mnuDiscoDuroServidor=new JMenuItem();
	JMenu mnuAS=new JMenu();
	JMenuItem mnuFP=new JMenuItem();
	JMenuItem mnuCES=new JMenuItem();
	JMenuItem mnuKM=new JMenuItem();
	JMenuItem mnuSKVM=new JMenuItem();
	JMenuItem mnuCKVM=new JMenuItem();
	JMenuItem mnuC=new JMenuItem();
	JMenuItem mnuES=new JMenuItem();
	JMenuItem mnuSOS=new JMenuItem();
	JMenu mnuSD=new JMenu();
	JMenuItem mnuDLT=new JMenuItem();
	JMenuItem mnuU=new JMenuItem();
	JMenuItem mnuE=new JMenuItem();
	JMenuItem mnuRDX=new JMenuItem();
	JMenu mnuCL=new JMenu();
	JMenuItem mnuUltrium=new JMenuItem();
	JMenuItem mnuDDS2=new JMenuItem();
	
	JMenu mnuA=new JMenu();
	JMenu mnuAA=new JMenu();
	JMenuItem mnuAAUSB=new JMenuItem();
	JMenuItem mnuAAAUX=new JMenuItem();
	JMenuItem mnuT=new JMenuItem();
	JMenu mnuAV=new JMenu();
	JMenuItem mnuAVDVI=new JMenuItem();
	JMenuItem mnuAVHDMI=new JMenuItem();
	JMenuItem mnuAVVGA=new JMenuItem();
	JMenuItem mnuAVD=new JMenuItem();
	JMenuItem mnuAVS=new JMenuItem();
	JMenuItem mnuDV=new JMenuItem();
	JMenuItem mnuERV=new JMenuItem();
	JMenuItem mnuPSLI=new JMenuItem();
	JMenuItem mnuCV=new JMenuItem();
	JMenu mnuAPC=new JMenu();
	JMenuItem mnuSwitchesKVM=new JMenuItem();
	JMenuItem mnuAPCUSB=new JMenuItem();
	JMenuItem mnuSATA=new JMenuItem();
	JMenuItem mnuAPCS=new JMenuItem();
	JMenuItem mnuAPCSATA=new JMenuItem();
	JMenuItem mnuAPCT=new JMenuItem();
	JMenuItem mnuAPCPS=new JMenuItem();
	JMenuItem mnuAPCIDE=new JMenuItem();
	JMenuItem mnuRJ=new JMenuItem();
	JMenuItem mnuRUSB=new JMenuItem();
	
	JMenu mnuCable=new JMenu();
	JMenuItem mnuBobina=new JMenuItem();
	JMenu mnuCablePC=new JMenu();
	JMenuItem mnuCPC=new JMenuItem();
	JMenuItem mnuCPCUSB=new JMenuItem();
	JMenuItem mnuCPCVGA=new JMenuItem();
	JMenuItem mnuCPCT=new JMenuItem();
	JMenuItem mnuCPCS=new JMenuItem();
	JMenuItem mnuCPCSATA=new JMenuItem();
	JMenuItem mnuCPCSAS=new JMenuItem();
	JMenuItem mnuCPCFW=new JMenuItem();
	JMenuItem mnuSCSI=new JMenuItem();
	JMenu mnuCAV=new JMenu();
	JMenuItem mnuCAVDVI=new JMenuItem();
	JMenuItem mnuCAVHDMI=new JMenuItem();
	JMenuItem mnuCAVVGA=new JMenuItem();
	JMenuItem mnuCAVDP=new JMenuItem();
	JMenuItem mnuCAVAUX=new JMenuItem();
	JMenuItem mnuCAVBNC=new JMenuItem();
	JMenuItem mnuCAVT=new JMenuItem();
	JMenuItem mnuCAVRCA=new JMenuItem();
	JMenuItem mnuCAVSV=new JMenuItem();
	JMenu mnuCR=new JMenu();
	JMenuItem mnuCP=new JMenuItem();
	JMenuItem mnuCFO=new JMenuItem();
	JMenuItem mnuCA=new JMenuItem();
	JMenuItem mnuCSFP=new JMenuItem();
	JMenuItem mnuCS=new JMenuItem();
	JMenuItem mnuCC=new JMenuItem();
	JMenu mnuCEnergia=new JMenu();
	JMenuItem mnuCPE=new JMenuItem();
	JMenuItem mnuCPI=new JMenuItem();
	JMenuItem mnuCI=new JMenuItem();
	
	JMenu mnuCompu=new JMenu();
	JMenu mnuPCE=new JMenu();
	JMenuItem mnuPCCPUI=new JMenuItem();
	JMenuItem mnuPCCPUAMD=new JMenuItem();
	JMenuItem mnuPCG=new JMenuItem();
	JMenu mnuLab=new JMenu();
	JMenuItem mnuLabE=new JMenuItem();
	JMenuItem mnuLabT=new JMenuItem();
	JMenuItem mnu2en1=new JMenuItem();
	JMenuItem mnuLabG=new JMenuItem();
	JMenuItem mnuLab4K=new JMenuItem();
	JMenuItem mnuLabI=new JMenuItem();
	JMenuItem mnuLabAMD=new JMenuItem();
	JMenu mnuTab=new JMenu();
	JMenuItem mnuTableta=new JMenuItem();
	JMenuItem mnuTabletaG=new JMenuItem();
	JMenu mnuAO=new JMenu();
	JMenuItem mnuLenovo=new JMenuItem();
	JMenuItem mnuHP=new JMenuItem();
	JMenuItem mnuDell=new JMenuItem();
	JMenuItem mnuAcer=new JMenuItem();
	JMenu mnuW=new JMenu();
	JMenuItem mnuWP=new JMenuItem();
	JMenu mnuAccesoriosPC=new JMenu();
	JMenuItem mnuBPC=new JMenuItem();
	JMenuItem mnuPPC=new JMenuItem();
	JMenuItem mnuKH=new JMenuItem();
	JMenuItem mnuLE=new JMenuItem();
	JMenuItem mnuIPC=new JMenuItem();
	JMenuItem mnuCandadoPC=new JMenuItem();
	JMenu mnuAccesoriosP=new JMenu();
	JMenuItem mnuBP=new JMenuItem();
	JMenuItem mnuCargador=new JMenuItem();
	JMenuItem mnuB=new JMenuItem();
	JMenuItem mnuMaletin=new JMenuItem();
	JMenuItem mnuFS=new JMenuItem();
	JMenuItem mnuCandadoL=new JMenuItem();
	JMenuItem mnuLL=new JMenuItem();
	
	JMenuBar mnuBarra=new JMenuBar();
}