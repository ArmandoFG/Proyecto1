
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author arman
 */
public class Xnor extends JLabel{
    
    int salida_Xnor;
    
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
    
}
