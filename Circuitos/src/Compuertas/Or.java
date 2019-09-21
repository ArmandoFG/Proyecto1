
package Compuertas;

import static circuitos.Circuitos.lc;
import circuitos.Nodo_draw;
import static circuitos.Panel1.vectorNodos;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author arman
 */
public class Or extends JLabel{
    
    int salida_Or;
    
    static int cont_Or;
    static String Or; 
    static Graphics string;
    
    public Or(){
        
        this.setBounds(1, 130, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Or.png"));
        
    }
    
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Or = 0;
        }
        else{
            
            salida_Or = 1;
        }
        
        
    }
    public int getsalida(){
        return salida_Or;
    }
    public static void crear_comp (int x, int y,JPanel panel){
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
        vectorNodos.add(new Nodo_draw(Or));
        cont_Or += 1;
    
}
    
}
