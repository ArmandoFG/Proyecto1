 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;

import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class Nodo {   
    private Object dato;
    private Object nombre;
    private Object tipo;
    Nodo siguiente;
    Nodo anterior1;
    Nodo anterior2;
    static int ContAnds = 0;
    static int ContNands  = 0;
    static int ContOrs  = 0;
    static int ContNors  = 0;
    static int ContXors  = 0;
    static int ContXnors  = 0;
    static int ContNots  = 0;
    
    public Nodo(){
   
        siguiente = null;
        anterior1 = null;
        anterior2 = null;
        dato = null;
        nombre = null;
        tipo = null;
}

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior1() {
        return anterior1;
    }

    public void setAnterior1(Nodo anterior1) {
        this.anterior1 = anterior1;
    }

    public Nodo getAnterior2() {
        return anterior2;
    }

    public void setAnterior2(Nodo anterior2) {
        this.anterior2 = anterior2;
    }
    

    
     
}
