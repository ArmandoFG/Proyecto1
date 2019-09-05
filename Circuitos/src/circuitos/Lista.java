/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author arman
 */


public class Lista {
    
    private int x, y;
    public static final int d = 60;
    
    
    public Lista(int x, int y) {
        
        this.x = x;
        this.y = y;
        
     
        
    }
    
    public void pintar (JLabel J){
        
        J.setBounds(x, y, 120, 120);
        J.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png"));

    
    
}
    
}

