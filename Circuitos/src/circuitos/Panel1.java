
package circuitos;

import Compuertas.And;
import Compuertas.Nand;
import Compuertas.Nor;
import Compuertas.Not;
import Compuertas.Or;
import Compuertas.Xnor;
import Compuertas.Xor;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
/**
 *
 * @author arman
 */
public class Panel1 extends JPanel implements ActionListener{
    
    And AND;
    Nand NAND;
    Or OR;
    Nor NOR;
    Not NOT;
    Xor XOR;
    Xnor XNOR;
    static MouseListener ml;
    MouseListener mp;
   
    
    
    
    
    public Panel1(){
        // Se agrega el color y los bordes al panel1
        this.setBackground(new java.awt.Color(102, 203, 175));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        
        

        //Instancias de las compuertas
        
        AND = new And();
        NAND = new Nand();
        OR = new Or();
        NOR = new Nor();
        NOT = new Not();
        XOR = new Xor();
        XNOR = new Xnor();
        
       
        
        // Se agregan las imagenes de las compuertas 
        this.add(AND);
        this.add(NAND);
        this.add(OR);
        this.add(NOR);
        this.add(NOT);
        this.add(XOR);
        this.add(XNOR);
        
       
        
        ml = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3){
                    JComponent jc = (JComponent)e.getSource();
                    TransferHandler th = jc.getTransferHandler();
                    th.exportAsDrag(jc, e, TransferHandler.COPY);
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

            private void add(JLabel fu) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        AND.setTransferHandler(new TransferHandler("icon"));
        NAND.setTransferHandler(new TransferHandler("icon"));
        OR.setTransferHandler(new TransferHandler("icon"));
        NOR.setTransferHandler(new TransferHandler("icon"));
        NOT.setTransferHandler(new TransferHandler("icon"));
        XNOR.setTransferHandler(new TransferHandler("icon"));
        XOR.setTransferHandler(new TransferHandler("icon"));
        
        
        
        AND.addMouseListener(ml);
        NAND.addMouseListener(ml);
        OR.addMouseListener(ml);
        NOR.addMouseListener(ml);
        NOT.addMouseListener(ml);
        XNOR.addMouseListener(ml);
        XOR.addMouseListener(ml);
       
       
        
        
        
        
        
        
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

