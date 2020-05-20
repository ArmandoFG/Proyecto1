package circuitos;







import static circuitos.Nodo_draw.cont_i1;
import static circuitos.Panel1.Nodo_move;
import static circuitos.Panel1.in_nodo;
import static circuitos.Panel1.in_nodor;

import static circuitos.Panel1.ml;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Ventana.jPanel2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.Vector;
import javax.swing.*;




/**
 *
 * @author Armando
 */
public class Panel2 extends JPanel  { 
    
    
    //Variables a usar para arrastrar y poner cada compuerta
    
    MouseListener Mouse;
    public static MouseMotionListener mover;
    
    
    
   
    
 
    
    Graphics line;
    Point p1, p2;
    
    static Nodo_draw Nodoline;
    static int inodo;
    
    public static MouseListener Mo;
    
 
    public static Vector<Nodo_lineas> vectorlineas;
    
    // Variable a usar para almacenar el anterior de una compuerta
    Nodo temporal;

    
    public Panel2() {
       
       
    //________________________________________________________________________________________________________________________________________________________________________________  
        
        
       
       
        
        this.addMouseListener(ml);
        vectorlineas = new Vector<>();
            
        
        // le asignamos color, bordes y el tamaño real que tendra el panel
        
        this.setBackground(new java.awt.Color(255, 255, 255));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        this.setPreferredSize(new java.awt.Dimension(800, 900));
      
    //    ___________________________________________________________________________________________________________________________________     
        
        Mo = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                //Al presionar click derecho se dibujan las lineas
                
                if(e.getButton() == MouseEvent.BUTTON3){
                   //Recorre los nodos y con rectangulo se toma cual nodo se presiono para dibujar la linea
                        for (Nodo_draw nodo : vectorNodos){ 
                            
                            if (new Rectangle (nodo.getCompuerta().getX() + 68, nodo.getCompuerta().getY() + 15, nodo.getCompuerta().getWidth(), nodo.Compuerta.getHeight()).contains(e.getPoint())){
                               
                                
                                if (p1 == null){
                                    
                                        temporal = nodo.Nodoasociado;   //Almacena el nodo que sera el nodo anterior de la otra compuerta donde se dibujara la linea
                                       
                                        p1 = new Point(nodo.getCompuerta().getX() + 78, nodo.getCompuerta().getY() + 50);
                                     
                                        
                     } else{
                           
                            if(nodo.Nodoasociado.anterior1 == null && nodo.Nodoasociado.getTipo() != "DATO"){
                                    
                                    nodo.Nodoasociado.setAnterior1(temporal); // Se le asigna al nodo el nodo anterior
                                    Random num = new Random();                            
                                    Color azar = new Color(num.nextInt(255),num.nextInt(255),num.nextInt(255)); // Crea colores aleatorios para las lineas
                                    p2 = new Point(nodo.getCompuerta().getX() + 18, nodo.getCompuerta().getY() + 44);
                                    vectorlineas.add(new Nodo_lineas(p1.x,p1.y,p2.x,p2.y, azar));       //Se agrega la linea en el vector
                                  
                                    
                                    
                               }else if(nodo.Nodoasociado.anterior2 == null && nodo.Nodoasociado.getTipo() != "DATO" && nodo.Nodoasociado.getTipo() != "NOT"){
                                   nodo.Nodoasociado.setAnterior2(temporal);    // Se le asigna al nodo el nodo anterior
                                    Random num = new Random();                      
                                    Color azar = new Color(num.nextInt(255),num.nextInt(255),num.nextInt(255)); // Crea colores aleatorios para las lineas
                                    p2 = new Point(nodo.getCompuerta().getX() + 18, nodo.getCompuerta().getY() + 60);
                                    vectorlineas.add(new Nodo_lineas(p1.x,p1.y,p2.x,p2.y,azar));    //Se agrega la linea en el vector
                                    
                                 
                                    
                                   } 
                            // Refresca el panel y inicializa los puntos del mouse
                            repaint();
                            p1 = null;
                            p2 = null;
                            
                                
                                }       
                
                                
                            }
                            
                    }
                        
                        
            }}

            @Override
            public void mousePressed(MouseEvent e ) {
                
                if(e.getButton() == MouseEvent.BUTTON3){
                   
                    
                    
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
                }

            @Override
            public void mouseEntered(MouseEvent e) {
             
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        
        // El panel esta pendiente a los eventos del mouse
        this.addMouseListener(Mo);
        
        mover = new MouseMotionListener(){
            

            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
                    
                    //Mueve las compuertas tomando los puntos (x,y) del mouse
                    
                    if(Nodo_move != null){
                        Nodo_move.getCompuerta().setLocation(e.getX() - 87, e.getY() - 48);
                        vectorNodos.set(in_nodo, new Nodo_draw(Nodo_move.Compuerta, Nodo_move.getNodoAsociado(), Nodo_move.getNombre(), Nodo_move.getcont_I1(), Nodo_move.getcont_I2(), Nodo_move.getcont_OUT()));
                        int indicelinea = 0;
                        // Mueve las lineas conforme se mueve la compuerta tomando el rectangulo de cada lina recorriendp el vector de lineas
                        for (Nodo_lineas line : vectorlineas){
                            if (new Rectangle(line.getX1() - Nodo_draw.ancho, line.getY1() - Nodo_draw.largo/2, Nodo_draw.ancho + 15, Nodo_draw.largo + 15).contains(e.getPoint())){
                                vectorlineas.set(indicelinea, new Nodo_lineas(e.getX(),e.getY(),line.getX2(),line.getY2(), line.getColor()));
                }           else if(new Rectangle(line.getX2() - Nodo_draw.ancho/4, line.getY2() - Nodo_draw.largo/2, Nodo_draw.ancho + 15, Nodo_draw.largo + 15).contains(e.getPoint())){
                                                    vectorlineas.set(indicelinea, new Nodo_lineas(line.getX1(),line.getY1(),e.getX() - 69,e.getY() - 4, line.getColor()));

                                
                        }
                            indicelinea++;
                        }
                        
                    }repaint();                    
                 
                        
                    }
                if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
                    
                  
      
                   
                }
                            
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        };
        this.addMouseMotionListener(mover);
        
        
            
        }
    //Metodo para pintar lineas de conexion que hereda de su padre
    
    @Override
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    for (Nodo_lineas linea : vectorlineas){
        linea.pintar(g);
    }
    
    // Recorre los nodos del vector y dibuja los textos de entradas y salida
    for (Nodo_draw nodo : vectorNodos){
        
        if (nodo.getNombre() == "DATO"){
            nodo.pintarE(g, nodo.Compuerta.getX() + 80, nodo.Compuerta.getY() + 35);
        }else if(nodo.getNombre() == "NOT") {
            nodo.pintarNot(g, nodo.Compuerta.getX() + 10, nodo.Compuerta.getY() + 34, nodo.Compuerta.getX() + 80, nodo.Compuerta.getY() + 35);
        
    }else{
        nodo.pintar(g, nodo.Compuerta.getX() + 10, nodo.Compuerta.getY() + 30, nodo.Compuerta.getX() + 10, nodo.Compuerta.getY() + 80, nodo.Compuerta.getX() + 80, nodo.Compuerta.getY() + 35);
      
    }
   
   
} 

    
} 
    
  
    

}
    
    
   
    
    
    
    
    
    
    
  
    
  
    
    
  
    
    
    
    

    
    
