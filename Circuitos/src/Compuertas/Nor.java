
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
public class Nor extends JLabel implements OpNor{
    
    int salida_Nor;
    
    static int cont_Nor;
    static String Nor; 
    static Graphics string;
    
    public Nor(){
        
     //Posicion e imagen donde estara la compuerta

        
        this.setBounds(100, 127, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nor.png"));
    }
     /**
     * 
     * @param entrada1  De tipo int almacena un 1 o 0
     * @param entrada2  De tipo int almacena un 1 o 0
     * @return De tipo int retorna resultado
     */
    @Override
    public int operacion(int entrada1, int entrada2){
        
       
        salida_Nor = entrada1 + entrada2;
        if (salida_Nor == 0){
            return 1;
            
        }else{
            return 0;
            
        }
       
    }
    
    /**
     * 
     * @param x  Posicion x del jlabel de la compuerta tipo int
     * @param y  Posicion y del jlabel de la compuerta tipo int
     * @param panel Donde se mostrara la compuerto tipo JPanel
     * @param Nodoas Nodo asociado de la lista enlazada de tipo Nodo
     * @param Nombre Nombre del nodo de tipo String
     */
     
     public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
         
        Nodo NodoAs = Nodoas;
        cont_Nor = 0;
        Nor = "Entrada0" + Integer.toString(cont_Nor);
        Nor Nor = new Nor();
        Nor.setBounds(x, y, 150, 100);
        Nor.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nor.png"));
        panel.add(Nor);
        Nor.setName("Entrada0" + cont_Nor);
        System.out.println(Nor.getName());
        string = Nor.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Nor, NodoAs, Nombre, cont_i1, cont_i2, cont_out));
        cont_Nor += 1;
        cont_i1 += 2;
        cont_i2 += 2;
        cont_out++;
    
}
    
    
}
