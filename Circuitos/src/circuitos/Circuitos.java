

package circuitos;


import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Nodo_draw.cont_i2;
import static circuitos.Nodo_draw.cont_out;
import static circuitos.Ventana.jPanel2;
import java.awt.Image;
import javax.swing.*;


/**
 *
 * @author Armando Fallas
 * @version 1.2
 */
public class Circuitos {
    
    //Asignamos la variable que asignara la ventana
    static Ventana ventana1;
    static int Num_entradas;
    static Image IMAGEN;
    
    //Lista enlazada del circuito
    
    public static Lista_Compuertas lc;

    

    /**
     * @param args  Metodo main
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
        cont_i1 = 1;
        cont_i2 = 2;
        cont_out = 1;
        
        
        
        
    }
     
}
