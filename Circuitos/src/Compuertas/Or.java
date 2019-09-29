
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
public class Or extends JLabel implements OpOr{
    
    int salida_Or;
    
    static int cont_Or;
    static String Or; 
    static Graphics string;
    
    public Or(){
        
        this.setBounds(1, 130, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Or.png"));
        
    }
    
    @Override
    public int operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Or = 0;
            return salida_Or;
        }
        else{
            
            salida_Or = 1;
            return salida_Or;
        }
        
        
    }
    
    public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
        Nodo NodoAs = Nodoas;
        cont_Or = 0;
        Or = "Entrada0" + Integer.toString(cont_Or);
        Or Or = new Or();
        Or.setBounds(x, y, 150, 100);
        Or.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Or.png"));
        panel.add(Or);
        Or.setName("Entrada0" + cont_Or);
        System.out.println(Or.getName());
        string = Or.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Or, NodoAs, Nombre, cont_i1, cont_i2, cont_out));
        cont_Or += 1;
        cont_i1 += 2;
        cont_i2 += 2;
        cont_out++;
}
    
}
