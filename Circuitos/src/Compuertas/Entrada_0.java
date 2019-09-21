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
 * @author Armando
 */
public class Entrada_0 extends JLabel{
    static int cont_E0;
    static String Entrada0; 
    static Graphics string;
    
    public Entrada_0(){
        this.setBounds(1, 480, 100, 100);
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\0.png"));
    }
    
    public static void crear_comp (int x, int y,JPanel panel){
        cont_E0 = 0;
        Entrada0 = "Entrada0" + Integer.toString(cont_E0); 
        Entrada_0 Entrada0 = new Entrada_0();
        Entrada0.setBounds(x, y, 150, 100);
        Entrada0.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\0.png"));
        panel.add(Entrada0);
        Entrada0.setName("Entrada0" + cont_E0);
        System.out.println(Entrada0.getName());
        string = Entrada0.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(Entrada0));
        cont_E0 += 1;
    
}
    
}
