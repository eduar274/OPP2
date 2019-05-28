
package vista;

import javax.swing.JFrame;
import controlador.Controlador;


public class InterfazApp extends JFrame{
    PanelAjustes pnlAju;
    PanelFormato pnlFor;
    PanelHora pnlHor;
    Controlador ctrl;
    
    InterfazApp(Controlador ctrl){
        this.ctrl = new Controlador();
        
        pnlHor = new PanelHora();
        pnlAju = new PanelAjustes();
        pnlFor= new PanelFormato();
        
        setSize(630,280);
        setTitle("Reloj");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
		
	setResizable(false);
	setLocationRelativeTo(null);
        
        add(pnlHor);
        
        setVisible(true);
        
        
    }
    
    public static void main(String[] arg){
        InterfazApp frmMain = new InterfazApp(new Controlador());
		frmMain.setVisible(true);
        
    }
    
    
}
