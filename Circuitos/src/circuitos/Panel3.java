
package circuitos;

import static circuitos.Circuitos.lc;
import static circuitos.Panel1.CalculaResultado;
import static circuitos.Panel1.vectorNodos;
import static circuitos.Ventana.jPanel1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Armando Fallas
 * @version 1.2
 */
public class Panel3 extends JPanel implements ActionListener {
    //Variables que almacenan los textods del boton, y resultado
    
    JLabel texto_R; 
    JLabel texto_Num;
    int ResultadoFinal;
    
    
    MouseListener Mouse;    // Eventos del mouse
    
    public Panel3(){
        // Color del fondo del panel y tipo de bordes
        this.setBackground(new java.awt.Color(102, 203, 175));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        // Variable que almacena el boton de iniciar el calculo del circuito
        JButton Iniciar = new javax.swing.JButton();
        Iniciar.setText("Resultado");   
        Iniciar.setBounds(60, 40, 120, 60); //Ubicacion del boton
        this.add(Iniciar);
        
        //Fuente de los textos
        Font fuente = new Font ("TimesRoman", Font.BOLD, 20);
        
        texto_R = new JLabel();
        texto_R.setBounds(70, 120, 110, 100);
        texto_R.setText("Resultado");
        texto_R.setFont(fuente);
        
        texto_Num = new JLabel();
        texto_Num.setBounds(116, 180, 110, 100);
        texto_Num.setFont(fuente);
        repaint();
        
        this.add(texto_R);
        this.add(texto_Num);
        
        Mouse = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                // Cuando se presione el mouse llama el metodo de calcular y muestra el resultado en el panel
                if (e.getSource() == Iniciar){
                    
                    CalcularSalida();
                    ResultadoFinal = CalcularSalida();
                    System.out.println("Dato final es:" + ResultadoFinal);
                    texto_Num.setText(Integer.toString(ResultadoFinal));
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getSource());
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
        Iniciar.addMouseListener(Mouse);
        this.addMouseListener(Mouse);
    }
    
    //Metodo donde se recorre cada nado y llama al metodo Calcular la operacion
    public int CalcularSalida(){
        Nodo ultimo = new Nodo();
        ultimo = vectorNodos.lastElement().getNodoAsociado();      
        ultimo.setDato(CalculaResultado(ultimo));
        
        
        return (int) ultimo.getDato();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
