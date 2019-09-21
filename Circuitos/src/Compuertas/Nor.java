
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
public class Nor extends JLabel{
    
    int salida_Nor;
    
    static int cont_Nor;
    static String Nor; 
    static Graphics string;
    
    public Nor(){
        
        
        this.setBounds(100, 127, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nor.png"));
    }
    
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Nor = 1;
        }
        if(entrada1 == 1 && entrada2 == 0){
            
            salida_Nor = 0;
        }
        if(entrada1 == 0 && entrada2 == 1){
            
            salida_Nor = 0;
        }
        if(entrada1 == 1 && entrada2 == 1){
            
            salida_Nor = 0;
        }
        
    }
    
     public int getsalida(){
        return salida_Nor;
    }
     
     public static void crear_comp (int x, int y,JPanel panel){
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
        vectorNodos.add(new Nodo_draw(Nor));
        cont_Nor += 1;
        
    
}
    
    
}
