/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuertas;

import static circuitos.Circuitos.lc;
import circuitos.Nodo_draw;
import static circuitos.Panel1.vectorNodos;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Armando Fallas
 */
public class Entrada_1 extends JLabel{
    static int cont_E1;
    static String Entrada1; 
    static Graphics string;
    
    public Entrada_1(){
        
        this.setBounds(100, 480, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\1.png"));
        
    }
    
     public static void crear_comp (int x, int y,JPanel panel){
        cont_E1 = 0;
        Entrada1 = "Entrada0" + Integer.toString(cont_E1); 
        Entrada_1 Entrada1 = new Entrada_1();
        Entrada1.setBounds(x, y, 150, 100);
        Entrada1.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\1.png"));
        panel.add(Entrada1);
        Entrada1.setName("Entrada0" + cont_E1);
        System.out.println(Entrada1.getName());
        string = Entrada1.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Entrada1));
        cont_E1 += 1;

    
}
}
