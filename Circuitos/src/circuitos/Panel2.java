package circuitos;



import Compuertas.And;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.*;




/**
 *
 * @author arman
 */
public class Panel2 extends JPanel { 

    And AND;
    JLabel prueba;
    JLabel uno;
    JLabel dos;
    JLabel tres;
    JLabel cuatro;
    JLabel cinco;
    JLabel seis;
    JLabel siete;
    JLabel ocho;
    JLabel nueve;
    JLabel diez;
    JLabel once;
    JLabel doce;
  

    public Panel2() {
        
        
        
        this.setBackground(new java.awt.Color(113, 176, 140));
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        this.setPreferredSize(new java.awt.Dimension(800, 900));
        
        prueba = new JLabel();
        prueba.setBounds(0, 0, 150, 150);
        prueba.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(prueba);
        
        uno = new JLabel();
        uno.setBounds(200, 0, 150, 150);
        uno.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(uno);
        
        dos = new JLabel();
        dos.setBounds(400, 0, 150, 150);
        dos.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(dos);
        
        tres = new JLabel();
        tres.setBounds(600, 0, 150, 150);
        tres.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(tres);
        
        cuatro = new JLabel();
        cuatro.setBounds(800, 0, 150, 150);
        cuatro.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(cuatro);
        
        cinco = new JLabel();
        cinco.setBounds(0, 200, 150, 150);
        cinco.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(cinco);
        
        seis = new JLabel();
        seis.setBounds(200, 200, 150, 150);
        seis.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(seis);
        
        siete = new JLabel();
        siete.setBounds(400, 200, 150, 150);
        siete.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(siete);
        
        ocho = new JLabel();
        ocho.setBounds(400, 200, 150, 150);
        ocho.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(siete);
        
        ocho = new JLabel();
        ocho.setBounds(600, 200, 150, 150);
        ocho.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(ocho);
        
        nueve = new JLabel();
        nueve.setBounds(0, 400, 150, 150);
        nueve.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(nueve);
        
        diez = new JLabel();
        diez.setBounds(200, 400, 150, 150);
        diez.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(diez);
        
        once = new JLabel();
        once.setBounds(400, 400, 150, 150);
        once.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(once);
        
        doce = new JLabel();
        doce.setBounds(600, 400, 150, 150);
        doce.setIcon(new ImageIcon("C:\\Users\\arman\\OneDrive\\Escritorio\\Proyecto1\\Circuitos\\src\\Imagenes\\punto.png"));
        this.add(doce);


        

        
        Point punto=MouseInfo.getPointerInfo().getLocation();
        int x=punto.x;
        int y=punto.y;
        
        prueba.setTransferHandler(new TransferHandler("icon"));
        prueba.addMouseListener(Panel1.ml);
        
        uno.setTransferHandler(new TransferHandler("icon"));
        uno.addMouseListener(Panel1.ml);
        
        dos.setTransferHandler(new TransferHandler("icon"));
        dos.addMouseListener(Panel1.ml);
        
        tres.setTransferHandler(new TransferHandler("icon"));
        tres.addMouseListener(Panel1.ml);
        
        cuatro.setTransferHandler(new TransferHandler("icon"));
        cuatro.addMouseListener(Panel1.ml);
        
        cinco.setTransferHandler(new TransferHandler("icon"));
        cinco.addMouseListener(Panel1.ml);
        
        seis.setTransferHandler(new TransferHandler("icon"));
        seis.addMouseListener(Panel1.ml);
        
        siete.setTransferHandler(new TransferHandler("icon"));
        siete.addMouseListener(Panel1.ml);
        
        ocho.setTransferHandler(new TransferHandler("icon"));
        ocho.addMouseListener(Panel1.ml);
        
        nueve.setTransferHandler(new TransferHandler("icon"));
        nueve.addMouseListener(Panel1.ml);
        
        diez.setTransferHandler(new TransferHandler("icon"));
        diez.addMouseListener(Panel1.ml);
        
        once.setTransferHandler(new TransferHandler("icon"));
        once.addMouseListener(Panel1.ml);
        
        doce.setTransferHandler(new TransferHandler("icon"));
        doce.addMouseListener(Panel1.ml);
        
        
    }
    
    
    }
    
    
