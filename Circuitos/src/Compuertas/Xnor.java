
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
public class Xnor extends JLabel{
    
    int salida_Xnor;
    
    static int cont_Xnor;
    static String Xnor; 
    static Graphics string;
    
    public Xnor(){
        
        this.setBounds(1, 320, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xnor.png"));
        
        
    }
    
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Xnor = 1;
        }
        if(entrada1 == 1 && entrada2 == 0){
            
            salida_Xnor = 0;
        }
        if(entrada1 == 0 && entrada2 == 1){
            
            salida_Xnor = 0;
        }
        if(entrada1 == 1 && entrada2 == 1){
            
            salida_Xnor = 1;
        }
        
    }
    public int getsalida(){
        return salida_Xnor;
    }
    public static void crear_comp (int x, int y,JPanel panel){
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
        vectorNodos.add(new Nodo_draw(Xnor));
        cont_Xnor += 1;
    
}
    
}
