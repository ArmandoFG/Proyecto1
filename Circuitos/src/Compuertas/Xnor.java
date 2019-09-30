
package Compuertas;

import static circuitos.Circuitos.lc;
import circuitos.Nodo;
import circuitos.Nodo_draw;
import static circuitos.Nodo_draw.cont_1;
import static circuitos.Nodo_draw.cont_2;
import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Nodo_draw.cont_i2;
import static circuitos.Nodo_draw.cont_out;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Panel3.MiTabla;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Armando Fallas 
 * @version 1.2
 */
public class Xnor extends JLabel implements OpXnor{
    
    int salida_Xnor;
    
    static int cont_Xnor;
    static String Xnor; 
    static Graphics string;
    
    public Xnor(){
             //Posicion e imagen donde estara la compuerta

        this.setBounds(1, 320, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xnor.png"));
        
        
    }
    /**
     * 
     * @param entrada1  De tipo int almacena un 1 o 0
     * @param entrada2  De tipo int almacena un 1 o 0
     * @return De tipo int retorna resultado
     */
    
    @Override
    public int operacion(int entrada1, int entrada2){
        
        salida_Xnor = entrada1 + entrada2;
        if (salida_Xnor == 0){
            return 1;
            
        }else if (salida_Xnor == 1){
            return 0;
            
        }else {
            return 1;
        }
        
    }
    
    /**
     * 
     * @param x  Posicion x del jlabel de la compuerta tipo int
     * @param y  Posicion y del jlabel de la compuerta tipo int
     * @param panel Donde se mostrara la compuerto tipo JPanel
     * @param Nodoas Nodo asociado de la lista enlazada de tipo Nodo
     * @param Nombre Nombre del nodo de tipo String
     * 
     * Crea el JLabel donde carga la imagen de la compuerta
     */
    
    public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
        Nodo NodoAs = Nodoas;
        cont_Xnor = 0;
        Xnor = "Entrada0" + Integer.toString(cont_Xnor);
        Xnor Xnor = new Xnor();
        Xnor.setBounds(x, y, 150, 100);
        Xnor.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xnor.png"));
        panel.add(Xnor);
        Xnor.setName("Entrada0" + cont_Xnor);
        System.out.println(Xnor.getName());
        string = Xnor.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Xnor, NodoAs, Nombre, cont_i1, cont_i2, cont_out));   // Agrega la imagen de la compuerta, el nodo asociado en la lista enlazada y los contadores de las compuertas
        cont_Xnor += 1;
        cont_i1 += 2;   // Contador de entradas global
        cont_i2 += 2;   // Contador de entradas global
        cont_out++;     // Contador de salidas global
        
        // Agrega las columnas necesarias en la tabla
        
        MiTabla.addColumn(cont_1);
        MiTabla.addColumn(cont_2);
        MiTabla.addColumn("XNOR");
}
    
}
