/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuertas;

import static circuitos.Circuitos.lc;
import circuitos.Nodo;
import circuitos.Nodo_draw;
import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Nodo_draw.cont_i2;
import static circuitos.Nodo_draw.cont_out;
import static circuitos.Panel1.vectorNodos;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Armando Fallas
 * @version 1.2
 */
public class Entrada_1 extends JLabel{
    static int cont_E1;
    static String Entrada1; 
    static Graphics string;
    
    public Entrada_1(){
        
        this.setBounds(100, 480, 100, 100); //Ubicacion del jlabel dentro de la paleta
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\1.png"));  // Imagen de la compuerta
        
    }
    /**
     * 
     * @param x Posicion x del jlabel de la compuerta tipo int
     * @param y Posicion y del jlabel de la compuerta tipo int
     * @param panel Donde se mostrara la compuerto tipo JPanel
     * @param Nodoas    Nodo asociado de la lista enlazada de tipo Nodo
     * @param Nombre    Nombre del nodo de tipo String
     */
     public static void crear_comp (int x, int y,JPanel panel, Nodo Nodoas, String Nombre){
        Nodo NodoAs = Nodoas;   // Nodo asociado
        cont_E1 = 0;            //Contador de Entradas 1
        Entrada1 = "Entrada1" + Integer.toString(cont_E1); // Nombre del JLabel
        Entrada_1 Entrada1 = new Entrada_1();   // Se crea Jlabel
        Entrada1.setBounds(x, y, 150, 100); //Se le asigna posicion
        Entrada1.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\1.png"));  // Imagen de compuerta
        panel.add(Entrada1);    // Se agrega al panel
        Entrada1.setName("Entrada0" + cont_E1); // Se le asigna el nombre
        vectorNodos.add(new Nodo_draw(Entrada1, NodoAs, Nombre, cont_i1, cont_i2, cont_out));   // Se agrega al vector
        cont_E1 += 1;   // Se increme cantidad de or
        cont_out++;
    
}
     public int dato(){
         return 1;  // Se retorna dato de la entrada
     }
}
