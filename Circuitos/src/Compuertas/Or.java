
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class Or extends JLabel{
    
    int salida_Or;
    
    
    public Or(){
        
        this.setBounds(1, 130, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Or.png"));
        
    }
    
    public void operacion(int entrada1, int entrada2){
        if(entrada1 == 0 && entrada2 == 0){
            
            salida_Or = 0;
        }
        else{
            
            salida_Or = 1;
        }
        
        
    }
    public int getsalida(){
        return salida_Or;
    }
    
}
