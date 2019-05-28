
package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelHora extends JPanel{
    JTextField horas,minutos,segundos;
    JLabel horas1,minutos1,segundos1,periodo;
    
    
    PanelHora(){
        
        horas = new JTextField("Hora");
        minutos = new JTextField("Minutos");
        segundos = new JTextField("Segundos");
        
        horas1 = new JLabel();
        minutos1 = new JLabel();
        segundos1 = new JLabel();
        periodo = new JLabel();
        
        horas.setEditable(false);
        horas.setBounds(10, 20, 32, 30);
        
        minutos.setEditable(false);
        minutos.setBounds(50, 20, 50, 30);
        
        segundos.setEditable(false);
        segundos.setBounds(110, 20, 60, 30);
        
        setSize(300,150);
	setLayout(null);
	setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Hora")));
        
        
        
        add(horas);
        add(minutos);
        add(segundos);
        
    }
    
    
}
