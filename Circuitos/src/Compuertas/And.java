
package Compuertas;


import circuitos.Nodo;
import circuitos.Nodo_draw;
import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Nodo_draw.cont_i2;
import static circuitos.Nodo_draw.cont_out;
import static circuitos.Panel1.vectorNodos;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;




/**
 *
 * @author Armando Fallas
 * @version 1.2
 * 
 */
public class And extends JLabel implements OpAnd{
    
    
    int contador_and = 1;   //Contador de compuertas AND
    int salida_and;         //Salida de la operacion
    
    MouseListener ml;       //Evento del mouse
    
    static int cont_c;      //Contador entradas
    static int cont_o;      //Contador salidas
    
    
    static String var;      // Nombre de compuerta
    static Graphics string; //Grafico para dibujar nombres de entradas y salidas


    
    

    
    //Contructor
   
    public And (){
        
       
       
        //Posicion e imagen donde estara la compuerta
 
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png"));
         
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
        
        Nodo NodoAs = Nodoas;   //Nodo asociado
        var = "AND" + Integer.toString(cont_c); //Nombre compuerta
        And var = new And();    //Se crea el nuevo JLabel
        var.setBounds(x, y, 150, 100);  // Ubicacion y tamaño del JLabel
        var.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png")); //Imagen de la compuerta
        panel.add(var); //Se agrega al panel
        var.setName("AND" + cont_c);    //Se le asigna el nombre al JPanel
        vectorNodos.add(new Nodo_draw(var, NodoAs, Nombre, cont_i1, cont_i2, cont_out));    //Se almacena en el vector
        cont_c += 1;
        cont_o += 1;
        
        cont_i1 += 2;
        cont_i2 += 2;
        cont_out++;
        }
   
    
                
  
    /**
     * 
     * @param entrada1  De tipo int almacena un 1 o 0
     * @param entrada2  De tipo int almacena un 1 o 0
     * @return De tipo int retorna resultado
     */
    @Override
    public int operacion(int entrada1, int entrada2){
       
        salida_and = entrada1 * entrada2;
        return salida_and;
     
        
    }
    

    
        
    
    
   
   
    
    
   
    
    
}
   

   

