package circuitos;





import static circuitos.Draw_line.Draw_line;
import static circuitos.Panel1.Nodo_move;
import static circuitos.Panel1.in_nodo;
import static circuitos.Panel1.ml;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Ventana.jPanel2;
import java.awt.Graphics;
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
    MouseMotionListener mover;
    
    Nodo aux;
    Nodo aux_temp;
    
    Draw_line draw;
    
    public static Vector<Nodo_lineas> vectorlineas;
    
    Graphics d;
    
    
    
    
    
    public Panel2() {
       
    //________________________________________________________________________________________________________________________________________________________________________________  
        // leasignamos color, bordes y el tamaño real que tendra el panel
        
        
        this.addMouseListener(ml);
        
        
        
      
        vectorlineas = new Vector<>();
            
        
        
        
        this.setBackground(new java.awt.Color(113, 176, 140));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        this.setPreferredSize(new java.awt.Dimension(800, 900));
        Draw_line(this);
    //    ___________________________________________________________________________________________________________________________________     
        
        mover = new MouseMotionListener(){
            

            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
                    
                    if(Nodo_move != null){
                        Nodo_move.getCompuerta().setLocation(e.getX(), e.getY());
                        vectorNodos.set(in_nodo, new Nodo_draw(Nodo_move.Compuerta));
                    }
                    
                    /*
                    for(Nodo_draw nodo : vectorNodos){
                        nodo.Compuerta.addMouseMotionListener(this);
                        nodo.setlocation(e.getX(), e.getY());
                            
                        }   
                            */
                    }}

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        };
        this.addMouseMotionListener(mover);
        
        
            
        }}
    
    
   
    
    
    
    
    
    
    
  
    
  
    
    
  
    
    
    
    

    
    
