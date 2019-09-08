
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class Not extends JLabel{
    
    int salida_Not;
    
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
    
    
    
}
