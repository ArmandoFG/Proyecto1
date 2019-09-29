
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
public class Xor extends JLabel implements OpXor{
    
    int salida_Xor;
    
    static int cont_Xor;
    static String Xor; 
    static Graphics string;
    
    public Xor(){
        
        this.setBounds(94, 230, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xor.png"));
        
    }
    @Override
    public int operacion(int entrada1, int entrada2){
        
        salida_Xor = entrada1 + entrada2;
        if (salida_Xor == 0){
            return 0;
            
        }else if (salida_Xor == 1){
            return 1;
            
        }else {
            return 0;
        }
        
    }
  
    
    public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
        Nodo NodoAs = Nodoas;
        cont_Xor = 0;
        Xor = "Entrada0" + Integer.toString(cont_Xor);
        Xor Xor = new Xor();
        Xor.setBounds(x, y, 150, 100);
        Xor.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xor.png"));
        panel.add(Xor);
        Xor.setName("Entrada0" + cont_Xor);
        System.out.println(Xor.getName());
        string = Xor.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Xor, NodoAs, Nombre, cont_i1, cont_i2, cont_out));
        cont_Xor += 1;
        cont_i1 += 2;
        cont_i2 += 2;
        cont_out++;
}
    
}
