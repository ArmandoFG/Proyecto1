
package Compuertas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;




/**
 *
 * @author Armando Fallas
 */
public class And extends JLabel {
    
    int salida_and;
    
    
   
    public And (){
        
       
        
        this.setBounds(10, 30, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png"));
        
     

}
    public void operacion(int entrada1, int entrada2){
       
        salida_and = entrada1 * entrada2;
        
     
        
    }
    
    public int getsalida(){
        return salida_and;
    }
    
   

}
