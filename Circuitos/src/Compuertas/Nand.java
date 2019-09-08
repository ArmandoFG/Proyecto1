
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class Nand extends JLabel{
    
    int salida_Nand;
    
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
    
}
