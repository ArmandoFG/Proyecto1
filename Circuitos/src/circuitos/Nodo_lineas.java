/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;


import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author Armando
 */
public class Nodo_lineas {
    // Variables de posicion de la lineas
    
        int x1,y1,x2,y2;
        Color colorlinea;
    
    
   // Contructor de la clase linea
    
    public Nodo_lineas(int x1, int y1, int x2, int y2, Color color){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.colorlinea = color;
        
    // Metodo para pintar la linea en sus coordenadas
}
    public void pintar(Graphics g){
        g.setColor(colorlinea);
        g.drawLine(x1, y1, x2, y2);
        
    }
    
    // Metodos get y set para modificar o obtener sus coordenadas

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    public Color getColor (){
        return colorlinea;
    }
   
}