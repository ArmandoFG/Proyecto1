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
public class Nodo {   

    JLabel Compuerta;
    Nodo siguiente;
    Nodo anterior;
    
    public Nodo(JLabel c){
        this(c,null,null);
    }
    
    public Nodo(JLabel c, Nodo n, Nodo a){
    
        Compuerta = c;
        siguiente = n;
        anterior = a;
}
    
    public JLabel getCompuerta(){
        return Compuerta;
    }
    
    public void setCompuerta(JLabel Compuerta){
        this.Compuerta = Compuerta;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
        
    }
    
    public Nodo getAnterior(){
        return anterior;
        
    }
    
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
}
