
package circuitos;

import Compuertas.And;
import Compuertas.Entrada_0;
import Compuertas.Entrada_1;
import Compuertas.Nand;
import Compuertas.Nor;
import Compuertas.Not;
import Compuertas.Or;
import Compuertas.Xnor;
import Compuertas.Xor;


import static circuitos.Ventana.jPanel1;
import static circuitos.Ventana.jPanel2;
import static circuitos.Ventana.jPanel3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.*;
/**
 *
 * @author Armando Fallas
 */
public class Panel1 extends JPanel implements ActionListener{
    
    // Variables a usar para cargar las imagenes de cada compuerta
    
    static And AND;
    Nand NAND;
    Or OR;
    Nor NOR;
    Not NOT;
    Xor XOR;
    Xnor XNOR;
    Entrada_1 Entrada1;
    Entrada_0 Entrada0;
    
    static MouseListener ml;
    MouseListener mp;
    
    static Object Source;
    static Object TempSource;
    static int x_M;
    static int y_M;
    
    static Nodo_draw Nodo_move;
    static int in_nodo;
   
    public static Vector<Nodo_draw> vectorNodos;
    
    JLabel seleccionado;
    static String elemento;
    
    JLabel texto_c;
    JLabel texto_E;
    JLabel texto_S;
    
    public Panel1(){
        // Se agrega el color y los bordes al panel1
        this.setBackground(new java.awt.Color(102, 203, 175));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        
        Point punto=MouseInfo.getPointerInfo().getLocation();
        
        
        int x=punto.x;
        int y=punto.y;
        
        vectorNodos = new Vector<>();
        
              

        //Instancias de las compuertas
        
        AND = new And();
        NAND = new Nand();
        OR = new Or();
        NOR = new Nor();
        NOT = new Not();
        XOR = new Xor();
        XNOR = new Xnor();
        Entrada1 = new Entrada_1();
        Entrada0 = new Entrada_0();
        
        seleccionado = new JLabel();
        seleccionado.setBounds(50, 600, 110, 100);
        
        texto_c = new JLabel();
        texto_c.setBounds(60, -10, 110, 100);
        texto_c.setText("COMPUERTAS");
        Font fuente = new Font ("TimesRoman", Font.BOLD, 15);
        texto_c.setFont(fuente);
        
        texto_E = new JLabel();
        texto_E.setBounds(60, 420, 110, 100);
        texto_E.setText("ENTRADAS");
        texto_E.setFont(fuente);
        
        texto_S = new JLabel();
        texto_S.setBounds(50, 540, 140, 100);
        texto_S.setText("SELECCIONADO");
        texto_S.setFont(fuente);
        
        
        
        AND.setBounds(10, 30, 100, 100);
        
        
        
        
        
        
        
        
        // Se agregan las imagenes de las compuertas al panel1
        this.add(AND);
        this.add(NAND);
        this.add(OR);
        this.add(NOR);
        this.add(NOT);
        this.add(XOR);
        this.add(XNOR);
        this.add(Entrada1);
        this.add(Entrada0);
        this.add(seleccionado);
        this.add(texto_c);
        this.add(texto_E);
        this.add(texto_S);
        
       // Esta variable ml almacena los eventos del mouse a usar
        
        ml = new MouseListener() {
            
            
            @Override
            public void mouseClicked(MouseEvent e) {
                x_M = e.getX();
                y_M = e.getY();
               
                
                if(e.getButton()==MouseEvent.BUTTON1){
                    System.out.println(e.getSource());
                        
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                if (e.getButton() == MouseEvent.BUTTON1){
                    int inodo = 0;
                    for (Nodo_draw nodo : vectorNodos){
                        if (new Rectangle (nodo.getCompuerta().getX() - Nodo_draw.ancho/2, nodo.getCompuerta().getY() -  Nodo_draw.largo/2, nodo.getCompuerta().getWidth(), nodo.Compuerta.getHeight()).contains(e.getPoint())){
                           Nodo_move = nodo; 
                           in_nodo = inodo;
                           break;
                        }
                        inodo++;
                    }
                }
                
                
                if(e.getButton()==MouseEvent.BUTTON1 && e.getSource() != jPanel1 && e.getSource() != jPanel2 && e.getSource() != jPanel3){
                    TempSource = Source;
                    Source = e.getSource();
                    
                   
                    
                    
                    
                    }
                if (e.getButton()== MouseEvent.BUTTON1 && e.getSource() == TempSource){
                    elemento = null;
                    seleccionado.setIcon(new ImageIcon(elemento));
                    Source = null;
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == AND){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\And.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NAND){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nand.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada0){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\0.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada1){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\1.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOR){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Nor.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOT){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Not.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == OR){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Or.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XNOR){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xnor.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XOR){
                    elemento = "C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\Xor.png";
                    seleccionado.setIcon(new ImageIcon(elemento));
                }
                
                if(e.getButton()==MouseEvent.BUTTON1 && Source == AND && e.getSource() == jPanel2){
                        
                        And.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();
                        
                        
                }
                    
                    
                    
                    
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NAND && e.getSource() == jPanel2){
                    
                        Nand.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();
                      
                    
                    
                    
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOR && e.getSource() == jPanel2){
                        Nor.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOT && e.getSource() == jPanel2){
                        Not.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == OR && e.getSource() == jPanel2){
                        Or.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XNOR && e.getSource() == jPanel2){
                        Xnor.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XOR && e.getSource() == jPanel2){
                        Xor.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                        jPanel2.repaint();
                    }
                
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada0 && e.getSource() == jPanel2){
                        Entrada_0.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                        Circuitos.Num_entradas += 1;
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada1 && e.getSource() == jPanel2){
                        Entrada_1.crear_comp(e.getX(), e.getY(), jPanel2);
                        jPanel2.updateUI();     
                        Circuitos.Num_entradas += 1;
                        
                    }
                
                }
                
                
        

            @Override
            public void mouseReleased(MouseEvent e) {
               Nodo_move = null;
               in_nodo = -1;
                
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            private void add(JLabel fu) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //Eventos para copiar la imagen de cada compuerta
        
    
        
        //Cada compuerta estara a la escucha en algun evento del mouse
        
        AND.addMouseListener(ml);
        NAND.addMouseListener(ml);
        OR.addMouseListener(ml);
        NOR.addMouseListener(ml);
        NOT.addMouseListener(ml);
        XNOR.addMouseListener(ml);
        XOR.addMouseListener(ml);
        Entrada1.addMouseListener(ml);
        Entrada0.addMouseListener(ml);
        seleccionado.addMouseListener(ml);
        
        
        
        
            
            
            
            
            
            
            
            
        } 
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //String Texto_c = "COMPUERTAS";
        Font fuente = new Font ("TimesRoman", Font.BOLD, 24);
        g.drawString("Compuertas", 70, 40);
        
    }

  */
}

    
    

