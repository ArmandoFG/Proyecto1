/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author Armando
 */
public class Nodo_draw {
    //Variables donde se almacena la imagen de las compuertas a usar en el circuito
    
    JLabel Compuerta;
    int x;
    int y;
    static int ancho;
    static int largo;
    
    // esta variable indicara a que nodo está asociado en la lista enlazada
    public Nodo Nodoasociado;
    String Nombre;
    
    public static int cont_i1;
    int cont_I1;
    public static int cont_i2;
    int cont_I2;
    public static int cont_out;
    int cont_OUT;
    
   // Contructor de la compuerta
    
    public Nodo_draw(JLabel c, Nodo NodoAsociado, String nombre, int contador1, int contador2, int contador3){
       
        Compuerta = c;
        largo = c.getHeight();
        ancho = c.getWidth();
        Nodoasociado = NodoAsociado;
        this.Nombre = nombre;
        cont_I1 = contador1;
        cont_I2 = contador2;
        cont_OUT = contador3;
}
    
    public void pintarE(Graphics g, int o1, int o2)
{
    g.setColor(Color.BLACK);
    g.drawString("O" + Integer.toString(cont_OUT), o1, o2);
    
    
    

    
}
    
  
    
    public void pintar(Graphics g, int x1, int y1, int x2, int y2, int o1, int o2)
{
    g.setColor(Color.BLACK);
    g.drawString("I" + Integer.toString(cont_I1), x1, y1);
    g.drawString("I" + Integer.toString(cont_I2), x2, y2);
    g.drawString("O" + Integer.toString(cont_OUT), o1, o2);
    
    
    

    
}
    public void pintarNot(Graphics g, int x1, int y1, int o1, int o2)
{   g.setColor(Color.BLACK);
    g.drawString("I" + Integer.toString(cont_I1), x1, y1);
    g.drawString("O" + Integer.toString(cont_OUT), o1, o2);
    
    
    

    
}
    // Metodos get y set para la compuerta y su posicion
    
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
    
    public Nodo getNodoAsociado(){
        return Nodoasociado;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getcont_I1(){
        return cont_I1;
    }
    public int getcont_I2(){
        return cont_I2;
    }
    public int getcont_OUT(){
        return cont_OUT;
    }
 
 
}
 


