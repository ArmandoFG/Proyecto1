
package circuitos;

import Compuertas.And;
import Compuertas.Nand;
import Compuertas.Nor;
import Compuertas.Not;
import Compuertas.Or;
import Compuertas.Xnor;
import Compuertas.Xor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public Panel1(){
        
        this.setBackground(new java.awt.Color(102, 203, 175));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        
        AND = new And();
        NAND = new Nand();
        OR = new Or();
        NOR = new Nor();
        NOT = new Not();
        XOR = new Xor();
        XNOR = new Xnor();
        
        this.add(AND);
        this.add(NAND);
        this.add(OR);
        this.add(NOR);
        this.add(NOT);
        this.add(XOR);
        this.add(XNOR);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

