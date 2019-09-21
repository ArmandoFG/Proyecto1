/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;


import static circuitos.Panel2.vectorlineas;
import static circuitos.Ventana.jPanel2;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 *
 * @author arman
 */
public class Draw_line {
    
    static int x_mouse;
    static int y_mouse;
    static int current_x;
    static int current_y;
    static Graphics line;
    static MouseListener M2;
    static MouseMotionListener M3;
    static Graphics line2;
   
    
    
    
    public static void Draw_line(JPanel Panel){
        
        
       
        M2 = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
              
                if(e.getButton() == MouseEvent.BUTTON3){
                    
                    x_mouse = e.getX();
                    y_mouse = e.getY();
                    
                    
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON3){
                    vectorlineas.add(new  Nodo_lineas(x_mouse, y_mouse, current_x, current_y));
                    
                    
                    
                    
                }    
                    
            }//}

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        
        Panel.addMouseListener(M2);
        
        
        M3 = new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
                if(e.getModifiersEx() == 4096){
             
                    Panel.setDoubleBuffered(true);
                    current_x = e.getX();
                    current_y = e.getY();
                    line = Panel.getGraphics();
                    line.setColor(Color.red);
                    line.drawLine(x_mouse, y_mouse, current_x, current_y);
                    Panel.repaint();
                    
                
                
                }
                
                
                    
               
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        };
        Panel.addMouseMotionListener(M3);
    }
    
}
