
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
 */
public class Nand extends JLabel implements OpNand{
    
    //Variables a usar por la compuerta
    
    int salida_Nand;
    
    static int cont_Nand;
    static String Nand; 
    static Graphics string; //Grafico para dibujar nombres de entradas y salidas
    
    //Consturctor
    public Nand(){
        //Posicion e imagen donde estara la compuerta
        this.setBounds(100, 30, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        
        
    }
    
     /**
     * 
     * @param entrada1  De tipo int almacena un 1 o 0
     * @param entrada2  De tipo int almacena un 1 o 0
     * @return De tipo int retorna resultado
     */
    
    @Override
    public int operacion(int entrada1, int entrada2){
        
        salida_Nand = entrada1 * entrada2;
        
        if(entrada1 == 0){
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
     * 
     * Crea el JLabel donde carga la imagen de la compuerta
     */
    
    
     public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
         
        Nodo NodoAs = Nodoas;
        cont_Nand = 0;
        Nand = "Entrada0" + Integer.toString(cont_Nand);
        Nand Nand = new Nand();
        Nand.setBounds(x, y, 150, 100);
        Nand.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        panel.add(Nand);
        Nand.setName("Entrada0" + cont_Nand);
        vectorNodos.add(new Nodo_draw(Nand, NodoAs, Nombre, cont_i1, cont_i2, cont_out));   // Agrega la imagen de la compuerta, el nodo asociado en la lista enlazada y los contadores de las compuertas
        cont_Nand += 1;
        cont_i1 += 2;   // Contador de entradas global
        cont_i2 += 2;   // Contador de entradas global
        cont_out++;     // Contador de salidas global
        
        // Agrega las columnas necesarias en la tabla
        
        MiTabla.addColumn(cont_1);
        MiTabla.addColumn(cont_2);
        MiTabla.addColumn("NAND");
}
}
