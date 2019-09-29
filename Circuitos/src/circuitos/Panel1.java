
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
import static circuitos.Circuitos.lc;
import static circuitos.Lista_Compuertas.Calculos;


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
    
    // Variables a usar para cargar las imagenes de cada compuerta en la paleta
    
    static And AND;
    Nand NAND;
    Or OR;
    Nor NOR;
    Not NOT;
    Xor XOR;
    Xnor XNOR;
    Entrada_1 Entrada1;
    Entrada_0 Entrada0;
    
    
    // Variables para eventos del mouse al seleccionar una compuerta de la paleta
    static MouseListener ml;
    MouseListener mp;
    
    // Variables para saber el tipo de compuerta seleccionada
    static Object Source;
    static Object TempSource;
    
    
    // Variables a usar para el movimiento de las compuertas en pantalla
    static Nodo_draw Nodo_move;
    static int in_nodo;
    static int in_nodor;
    
    // Vector a usar para dibujar compuertas
    public static Vector<Nodo_draw> vectorNodos;
    
    
    // Variables a usar para ver que compuerta hemos seleccionado
    JLabel seleccionado;
    static String elemento;
    
    // Variables para el texto de las categorias de la paleta
    JLabel texto_c;
    JLabel texto_E;
    JLabel texto_S;
    
    static String Nombre_comp;
    int indice;
    
    static int Dato;
    public Panel1(){
        // Se agrega el color y los bordes al panel1
        this.setBackground(new java.awt.Color(102, 203, 175));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        
        
        
        vectorNodos = new Vector<>();
        Nombre_comp = null;

        //Instancias de las compuertas
        
        AND = new And();
        NAND = new Nand();
        NAND.setName("NAND");
        OR = new Or();
        OR.setName("OR");
        NOR = new Nor();
        NOR.setName("NOR");
        NOT = new Not();
        NOT.setName("NOT");
        XOR = new Xor();
        XOR.setName("XOR");
        XNOR = new Xnor();
        XNOR.setName("XNOR");
        Entrada1 = new Entrada_1();
        Entrada1.setName("DATO");
        Entrada0 = new Entrada_0();
        Entrada1.setName("DATO");
        
        // JLabel donde se almacena la imagen de la compuerta seleccionada
        
        seleccionado = new JLabel();
        seleccionado.setBounds(50, 600, 110, 100);
        
        // Tamaño, fuente de los textos de la paleta
        
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
        AND.setName("AND");
        
        
        
        
        
        
        
        
        
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
                
               
                
                if(e.getButton()==MouseEvent.BUTTON3){
                    int inodos = 0;
                    for (Nodo_draw nodo : vectorNodos){
                        if (new Rectangle (nodo.getCompuerta().getX() + 68, nodo.getCompuerta().getY() + 15, nodo.getCompuerta().getWidth(), nodo.Compuerta.getHeight()).contains(e.getPoint())){
                           in_nodor = inodos;
                           
                           break;
                        }
                        inodos++;
                    }
                   
                        
                }
                
            }
                // Toma el nodo que estamos seleccionando para poder moverlo
            @Override
            public void mousePressed(MouseEvent e) {
                
                if (e.getButton() == MouseEvent.BUTTON1){
                    int inodo = 0;
                    for (Nodo_draw nodo : vectorNodos){
                        if (new Rectangle (nodo.getCompuerta().getX() + 68, nodo.getCompuerta().getY() + 15, nodo.getCompuerta().getWidth(), nodo.Compuerta.getHeight()).contains(e.getPoint())){
                           Nodo_move = nodo; 
                           in_nodo = inodo;
                           //System.out.println(in_nodo);
                           break;
                        }
                        inodo++;
                    }
                }
                
                
                // Evento para dejar de selecionar una compuerta 
                
                if(e.getButton()==MouseEvent.BUTTON1 && e.getSource() != jPanel1 && e.getSource() != jPanel2 && e.getSource() != jPanel3){
                    TempSource = Source;
                    Source = e.getSource();
                    
                   
                    
                    
                // Evento del mouse para mostrar la imagen de la compuerta seleccionada en el programa.
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
                
                //Eventos para mostrar las compuertas en la ventana y almacenarlas en la listas
                
                if(e.getButton()==MouseEvent.BUTTON1 && Source == AND && e.getSource() == jPanel2){
                        Nombre_comp = "AND";
                        lc.insertar("AND", "AND");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        System.out.println(NodoAsociado.getNombre());
                        And.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();
                        
                        
                }
                    
                    
                    
                    
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NAND && e.getSource() == jPanel2){
                        Nombre_comp = "NAND";
                        lc.insertar("NAND", "NAND");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Nand.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();
                    
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOR && e.getSource() == jPanel2){
                        Nombre_comp = "NOR";
                        lc.insertar("NOR", "NOR");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Nor.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == NOT && e.getSource() == jPanel2){
                        Nombre_comp = "NOT";
                        lc.insertar("NOT", "NOT");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Not.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == OR && e.getSource() == jPanel2){
                        Nombre_comp = "OR";
                        lc.insertar("OR", "OR");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        System.out.println(Nombre_comp);
                        Or.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XNOR && e.getSource() == jPanel2){
                        Nombre_comp = "XNOR";
                        lc.insertar("XNOR", "XNOR");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Xnor.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();     
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == XOR && e.getSource() == jPanel2){
                        Nombre_comp = "XOR";
                        lc.insertar("XOR", "XOR");
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Xor.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        indice++;
                        jPanel2.updateUI();     
                        
                    }
                
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada0 && e.getSource() == jPanel2){
                        Nombre_comp = "DATO";
                        lc.insertasDato(Nombre_comp, 0);
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Entrada_0.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        jPanel2.updateUI();     
                        indice++;
                        Circuitos.Num_entradas += 1;
                    }
                if(e.getButton()==MouseEvent.BUTTON1 && Source == Entrada1 && e.getSource() == jPanel2){
                        Nombre_comp = "DATO";
                        lc.insertasDato(Nombre_comp, 1);
                        Nodo NodoAsociado = new Nodo();
                        NodoAsociado = lc.buscar(indice);
                        Entrada_1.crear_comp(e.getX(), e.getY(), jPanel2, NodoAsociado, Nombre_comp);
                        jPanel2.updateUI();
                        indice++;
                        Circuitos.Num_entradas += 1;
                        
                    }
                
                }
                
                
        // Evento que inicia las variables para mover las compuertas cuando se suelte un boton del mouse 

            @Override
            public void mouseReleased(MouseEvent e) {
               Nodo_move = null;
               in_nodo = -1;
               in_nodor = -1;
                
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
    
      public static int CalculaResultado(Nodo end){
        if (end.anterior1.getTipo() != "DATO"){
            end.anterior1.setDato(CalculaResultado(end.anterior1));
        }
        /*
        if (end.anterior2.getTipo() != "DATO" && end.anterior2 != null && end.getTipo() != "NOT"){
            end.anterior2.setDato(CalculaResultado(end.anterior2));
        }
                */
        if (end.getTipo() == "NOT"){
            
            Dato = Calculos((String)end.getTipo(), (int)end.anterior1.getDato(), 0);
            System.out.println(Dato);
            
        }
        else if(end.getTipo() != "DATO" && end.getTipo() != "NOT"){
            Dato = Calculos((String)end.getTipo(), (int)end.anterior1.getDato(), (int)end.anterior2.getDato());
        }
        return Dato;
    
}
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
   
}

    
    

