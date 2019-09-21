
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
 * @author Armando Fallas
 */
public class Nand extends JLabel{
    
    //Variables a usar por la compuerta
    
    int salida_Nand;
    
    static int cont_Nand;
    static String Nand; 
    static Graphics string;
    
    //Consturctor
    public Nand(){
        
        this.setBounds(100, 30, 110, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        
        
    }
    
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Nand = 1;
        }
        if(entrada1 == 1 && entrada2 == 0){
            
            salida_Nand = 1;
        }
        if(entrada1 == 0 && entrada2 == 1){
            
            salida_Nand = 1;
        }
        if(entrada1 == 1 && entrada2 == 1){
            
            salida_Nand = 1;
        }
        
          
    }
    
     public int getsalida(){
        return salida_Nand;
    }
     public static void crear_comp (int x, int y,JPanel panel){
        cont_Nand = 0;
        Nand = "Entrada0" + Integer.toString(cont_Nand);
        Nand Nand = new Nand();
        Nand.setBounds(x, y, 150, 100);
        Nand.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png"));
        panel.add(Nand);
        Nand.setName("Entrada0" + cont_Nand);
        System.out.println(Nand.getName());
        string = Nand.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Nand));
        cont_Nand += 1;
    
}
}
