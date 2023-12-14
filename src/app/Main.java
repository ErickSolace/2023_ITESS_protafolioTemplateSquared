/*
*ERICK FLORES TAPIA ITESS 2023
*MATEMATICAS PARA LA TOMA DE DECISIONES
*PORTAFOLIO DIGITAL
*/

package app;

import gui.MainASYS;
import gui.ProgramacionLineal;
import gui.MetodoTransporte;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainASYS;
    public JFrame programacionLineal;
    public JFrame metodoTransporte;
    public JFrame teoriaInventarios;
    public JFrame discreteSystem;
    
    public Main() {
        mainASYS = new MainASYS(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
