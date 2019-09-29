
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
 * @author arman
 */
public class Not extends JLabel implements OpNot{
    
    int salida_Not;
    
    static int cont_Not;
    static String Not; 
    static Graphics string;
    
    public Not (){
        
        this.setBounds(-7, 230, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Not.png"));
        
    }
    
    @Override
    public int operacion(int entrada){
        if(entrada == 0){
            salida_Not = 1;
            return salida_Not;
        }else{
            salida_Not = 0;
            return salida_Not;
        
        }  
    }
    
     
     
     public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
         
        Nodo NodoAs = Nodoas;
        cont_Not = 0;
        Not = "Entrada0" + Integer.toString(cont_Not);
        Not Not = new Not();
        Not.setBounds(x, y, 150, 100);
        Not.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Not.png"));
        panel.add(Not);
        Not.setName("Entrada0" + cont_Not);
        System.out.println(Not.getName());
        string = Not.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Not, NodoAs, Nombre, cont_i1, cont_i2, cont_out));
        cont_Not += 1;
        cont_i1 += 1;
        cont_i2 += 1;
        cont_out++;
    
}
    
    
    
}
