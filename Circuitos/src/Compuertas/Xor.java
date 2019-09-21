
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
public class Xor extends JLabel{
    
    int salida_Xor;
    
    static int cont_Xor;
    static String Xor; 
    static Graphics string;
    
    public Xor(){
        
        this.setBounds(94, 230, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xor.png"));
        
    }
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Xor = 0;
        }
        if(entrada1 == 1 && entrada2 == 0){
            
            salida_Xor = 1;
        }
        if(entrada1 == 0 && entrada2 == 1){
            
            salida_Xor = 1;
        }
        if(entrada1 == 1 && entrada2 == 1){
            
            salida_Xor = 0;
        }
        
    }
    public int getsalida(){
        return salida_Xor;
    }
    
    public static void crear_comp (int x, int y,JPanel panel){
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
        vectorNodos.add(new Nodo_draw(Xor));
        cont_Xor += 1;
    
}
    
}
