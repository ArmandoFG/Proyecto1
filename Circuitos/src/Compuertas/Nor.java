
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author arman
 */
public class Nor extends JLabel{
    
    int salida_Nor;
    
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
    
    
}
