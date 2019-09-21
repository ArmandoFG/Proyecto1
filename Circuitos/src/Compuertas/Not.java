
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
public class Not extends JLabel{
    
    int salida_Not;
    
    static int cont_Not;
    static String Not; 
    static Graphics string;
    
    public Not (){
        
        this.setBounds(-7, 230, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Not.png"));
        
    }
    
    public void operacion(int entrada){
        if(entrada == 0){
            
            salida_Not = 1;
        }else{
            salida_Not = 0;
        
        }  
    }
    
     public int getsalida(){
        return salida_Not;
    }
     
     public static void crear_comp (int x, int y,JPanel panel){
        cont_Not = 0;
        Not = "Entrada0" + Integer.toString(cont_Not);
        Not Not = new Not();
        Not.setBounds(x, y, 150, 100);
        Not.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Not.png"));
        panel.add(Not);
        Not.setName("Entrada0" + cont_Not);
        System.out.println(Not.getName());
        string = Not.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Not));
        cont_Not += 1;
    
}
    
    
    
}
