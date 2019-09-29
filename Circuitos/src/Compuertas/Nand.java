
package Compuertas;

import static circuitos.Circuitos.lc;
import circuitos.Nodo;
import circuitos.Nodo_draw;
import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Nodo_draw.cont_i2;
import static circuitos.Nodo_draw.cont_out;
import static circuitos.Panel1.vectorNodos;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Armando Fallas
 */
public class Nand extends JLabel implements OpNand{
    
    //Variables a usar por la compuerta
    
    int salida_Nand;
    
    static int cont_Nand;
    static String Nand; 
    static Graphics string;
    
    //Consturctor
    public Nand(){
        
        this.setBounds(100, 30, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        
        
    }
    
    @Override
    public int operacion(int entrada1, int entrada2){
        
        salida_Nand = entrada1 * entrada2;
        
        if(entrada1 == 0){
            return 1;
        }else{
            return 0;
        }
        
        
          
    }
    
    
     public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
         
        Nodo NodoAs = Nodoas;
        cont_Nand = 0;
        Nand = "Entrada0" + Integer.toString(cont_Nand);
        Nand Nand = new Nand();
        Nand.setBounds(x, y, 150, 100);
        Nand.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        panel.add(Nand);
        Nand.setName("Entrada0" + cont_Nand);
        System.out.println(Nand.getName());
        string = Nand.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Nand, NodoAs, Nombre, cont_i1, cont_i2, cont_out));
        cont_Nand += 1;
        cont_i1 += 2;
        cont_i2 += 2;
        cont_out++;
}
}
