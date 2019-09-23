
package Compuertas;


import static circuitos.Circuitos.lc;
import circuitos.Nodo_draw;
import circuitos.Nodo_lineas;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Panel2.Mo;
import static circuitos.Panel2.current_x;
import static circuitos.Panel2.current_y;
import static circuitos.Panel2.mover;
import static circuitos.Panel2.vectorlineas;
import static circuitos.Panel2.x_mouse;
import static circuitos.Panel2.y_mouse;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;




/**
 *
 * @author Armando Fallas
 */
public class And extends JLabel {
    
    //Variables a usar por la compuerta
    int contador_and = 1;
    int salida_and;
    MouseListener ml;
    static int cont_And;
    static String var; 
    static Graphics string;
    
    

    
    //Contructor
   
    public And (){
        
       
       
        //Posicion e imagen donde estara la compuerta
        
        
        this.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png"));
        
        ml = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //Lista_Compuertas.insertar("and" + Integer.toString(contador_and));
                if(e.getButton()==MouseEvent.BUTTON3){
                    
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
        
        this.addMouseListener(ml);
        
        //this.addMouseListener(Mo);
        //this.addMouseMotionListener(mover);
        
     

}
    public static void crear_comp (int x, int y,JPanel panel){
        
        cont_And = 0;
        
        var = "AND" + Integer.toString(cont_And); 
        And var = new And();
        var.setBounds(x, y, 150, 100);
        var.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png"));
        panel.add(var);
        var.setName("AND" + cont_And);
        System.out.println(var.getName());
        string = var.getGraphics();
        string.drawString("I1", x - 7, y - 7);
        vectorNodos.add(new Nodo_draw(var));
        cont_And += 1;
        
        }
    
                
    public static void Move(int x, int y, JPanel P){
        P.setLocation(P.getLocation().x + x - 80, P.getLocation().y + y - 75);
        P.repaint();
                        
    }
    //Operacion a ejecutar por la compuerta
    public void operacion(int entrada1, int entrada2){
       
        salida_and = entrada1 * entrada2;
        
     
        
    }
    
    //Obtener el resultado de la compuerta
    public int getsalida(){
        return salida_and;
        
    }
   
    /*
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

   
*/
   

}
