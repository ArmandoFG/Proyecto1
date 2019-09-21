/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;


import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class Nodo_draw {
    
    JLabel Compuerta;
    int x;
    int y;
    static int ancho;
    static int largo;
    
    
   
    
    public Nodo_draw(JLabel c){
    
        Compuerta = c;
        largo = c.getHeight();
        ancho = c.getWidth();
}
    
    public JLabel getCompuerta(){
        return Compuerta;
    }
    
    public void setCompuerta(JLabel Compuerta){
        this.Compuerta = Compuerta;
    }
    public void setlocation (int x, int y){
        this.Compuerta.setLocation(x + this.Compuerta.getX(), y + this.Compuerta.getY());
        this.Compuerta.repaint();
    }
    
  
    
 
}

