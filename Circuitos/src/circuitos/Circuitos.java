

package circuitos;


import static circuitos.Ventana.jPanel2;
import java.awt.Image;
import javax.swing.*;


/**
 *
 * @author arman
 */
public class Circuitos {
    
    //Asignamos la variable que asignara la ventana
    static Ventana ventana1;
    static int Num_entradas;
    static int INT_1;
    static int INT_2;
    static int OUT;
    static Image IMAGEN;
    public static Lista_Compuertas lc;

    

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Creamos la instancia de la clase ventana
        //La hacemos visible
        //Le adignamos el metodo para cuando desiemos cerrar la ventana
        
        Ventana ventana1 = new Ventana();
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IMAGEN = new ImageIcon("And.png").getImage();
        lc = new Lista_Compuertas();
        
        
        
        
        
    }
     
}
