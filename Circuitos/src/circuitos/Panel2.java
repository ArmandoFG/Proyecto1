package circuitos;






import static circuitos.Panel1.AND;
import static circuitos.Panel1.Nodo_move;
import static circuitos.Panel1.in_nodo;
import static circuitos.Panel1.ml;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Ventana.jPanel2;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.*;




/**
 *
 * @author arman
 */
public class Panel2 extends JPanel  { 
    
    
    //Variables a usar para arrastrar y poner cada compuerta

    MouseListener Mouse;
    public static MouseMotionListener mover;
    
    Nodo aux;
    Nodo aux_temp;
    
    Image imagenAux;
    Graphics gAux;
    Dimension dimAux;
    Dimension dimPanel;
    
    Graphics line;
    
    public static int x_mouse, y_mouse, current_x, current_y;
   
    
    public static MouseListener Mo;
    
 
    public static Vector<Nodo_lineas> vectorlineas;

    
    public Panel2() {
       
    //________________________________________________________________________________________________________________________________________________________________________________  
        // leasignamos color, bordes y el tamaño real que tendra el panel
        this.setDoubleBuffered(true);
        
       
       
        
        this.addMouseListener(ml);
        vectorlineas = new Vector<>();
            
        dimPanel = this.getSize(); 
        
        
        this.setBackground(new java.awt.Color(113, 176, 140));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        this.setPreferredSize(new java.awt.Dimension(800, 900));
        //Draw_line(this);
    //    ___________________________________________________________________________________________________________________________________     
        
        Mo = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e ) {
                
                if(e.getButton() == MouseEvent.BUTTON3){
                    
                    x_mouse = e.getX();
                    y_mouse = e.getY();
                    
                    
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON3){
                    vectorlineas.add(new Nodo_lineas(x_mouse, y_mouse, current_x, current_y));
                    repaint();
                   
                        
                        

            }
                }

            @Override
            public void mouseEntered(MouseEvent e) {
             
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        this.addMouseListener(Mo);
        
        mover = new MouseMotionListener(){
            

            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
                    
                    if(Nodo_move != null){
                        Nodo_move.getCompuerta().setLocation(e.getX(), e.getY());
                        vectorNodos.set(in_nodo, new Nodo_draw(Nodo_move.Compuerta));
                    }
                    
                 
                        
                    }
                if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
                    
                    current_x = e.getX();
                    current_y = e.getY();
                   
                }
                            
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        };
        this.addMouseMotionListener(mover);
        
        
            
        }
    @Override
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    for (Nodo_lineas linea : vectorlineas){
        linea.pintar(g);
    }
    g.drawLine(x_mouse, y_mouse, current_x, current_y);
    repaint();
   
    
}

    
    
    
  
    

}
    
    
   
    
    
    
    
    
    
    
  
    
  
    
    
  
    
    
    
    

    
    
