
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author arman
 */
public class Xor extends JLabel{
    
    int salida_Xor;
    
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
    
}
