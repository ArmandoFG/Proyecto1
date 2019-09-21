/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;

import Compuertas.And;
import javax.swing.JLabel;


/**
 *
 * @author arman
 */
public class Lista_Compuertas {
    
    public static Nodo inicio;
    Nodo fin;
    public static Nodo anterior;
    static JLabel dato_nodo;
    
    public Lista_Compuertas(){
        inicio = null;
        fin = null;
        anterior = null;
        
        
        
    }
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void insertarFinal (JLabel info){
        if (!estaVacia()){
            fin = new Nodo(info, null, fin);
            fin.anterior.siguiente=fin;
            System.out.println(dato_nodo);
        }else{
            inicio = fin = new Nodo (info);
            dato_nodo = (JLabel) inicio.getCompuerta();
            System.out.println(dato_nodo);
        }
    }
    
    public void insertarInicio(JLabel info){
        if (!estaVacia()){
            inicio = new Nodo(info, inicio, null);
            inicio.siguiente.anterior=inicio;
            
            
        }else{
            inicio = fin = new Nodo (info);
        }    
    }
    public void MostrarLista(){
        if(!estaVacia()){
        Nodo auxiliar = inicio;
        while (auxiliar != null){
            
            auxiliar = auxiliar.siguiente;
            
            
                    
                }
        auxiliar = inicio;
                
            }
        }

    void addMouseMotionListener(Panel2 aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
