/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;

import Compuertas.Comp_Factory;
import Compuertas.FactoryCrear;
import Compuertas.OpAnd;
import Compuertas.OpNand;
import Compuertas.OpNor;
import Compuertas.OpNot;
import Compuertas.OpOr;
import Compuertas.OpXnor;
import Compuertas.OpXor;
import static circuitos.Nodo.ContAnds;
import static circuitos.Nodo.ContNands;
import static circuitos.Nodo.ContNors;
import static circuitos.Nodo.ContNots;
import static circuitos.Nodo.ContOrs;
import static circuitos.Nodo.ContXnors;
import static circuitos.Nodo.ContXors;



/**
 *
 * @author arman
 */
public class Lista_Compuertas {
    
    public Nodo cabeza;
    public int size;
    
    public Lista_Compuertas(){
        this.cabeza = null;
        this.size = 0;
    
}
    public boolean Empty(){
        return this.cabeza == null;
    }
    
    public int size(){
        return this.size;
    }
    
    public Nodo ultimo(){
        Nodo ultimo = this.cabeza;
        while ( ultimo.getSiguiente() != null ){
            ultimo = ultimo.siguiente;
        }
        return ultimo;
    }
    
    public Nodo buscar (int indice){
        int index = 0;
        Nodo buscar = this.cabeza;
        while (index < indice){
            buscar = buscar.getSiguiente();
            index++;
        }
        return buscar;
        
    }
    
    public void insertar(String Comp, String tipo){
        Nodo Compuerta = new Nodo();
        
        if (this.Empty()){
            this.cabeza = Compuerta;
            switch(tipo){
                case "AND":
                    this.cabeza.setNombre(tipo + ContAnds);
                    ContAnds++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "NAND":
                    this.cabeza.setNombre(tipo + ContNands);
                    ContNands++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "NOR":
                    this.cabeza.setNombre(tipo + ContNors);
                    ContNors++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "NOT":
                    this.cabeza.setNombre(tipo + ContNots);
                    ContNots++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "OR":
                    this.cabeza.setNombre(tipo + ContOrs);
                    ContOrs++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "XNOR":
                    this.cabeza.setNombre(tipo + ContXnors);
                    ContXnors++;
                    this.cabeza.setTipo(Comp);
                    break;
                case "Xor":
                    this.cabeza.setNombre(tipo + ContXors);
                    ContXors++;
                    this.cabeza.setTipo(Comp);
                    break;
            }
        }
        else{
            Nodo aux = this.cabeza;
            
            while (aux.getSiguiente() != null){
                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(Compuerta);
            aux = aux.getSiguiente();
            
            switch(tipo){
                case "AND":
                    aux.setNombre(tipo + ContAnds);
                    ContAnds++;
                    aux.setTipo(Comp);
                    break;
                case "NAND":
                    aux.setNombre(tipo + ContNands);
                    ContNands++;
                    aux.setTipo(Comp);
                    break;
                case "NOR":
                    aux.setNombre(tipo + ContNors);
                    ContNors++;
                    aux.setTipo(Comp);
                    break;
                case "NOT":
                    aux.setNombre(tipo + ContNots);
                    ContNots++;
                    aux.setTipo(Comp);
                    break;
                case "OR":
                    aux.setNombre(tipo + ContOrs);
                    ContOrs++;
                    aux.setTipo(Comp);
                    break;
                case "XNOR":
                    aux.setNombre(tipo + ContXnors);
                    ContXnors++;
                    aux.setTipo(Comp);
                    break;
                case "XOR":
                    aux.setNombre(tipo + ContXors);
                    ContXors++;
                    aux.setTipo(Comp);
                    break;
            }
        }
        this.size++;
    }
    
    public void insertasDato (String nombre, int dato){
        Nodo Dato = new Nodo();
        
        if (this.Empty()){
            this.cabeza = Dato;
            this.cabeza.setDato(dato);
            this.cabeza.setAnterior1(this.cabeza);
            this.cabeza.setNombre(nombre);
            this.cabeza.setTipo("DATO");
        }else{
            Nodo aux = this.cabeza;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(Dato);
            aux = aux.getSiguiente();
            aux.setNombre(nombre);
            aux.setDato(dato);
            aux.setAnterior1(aux);
            aux.setTipo("DATO");
        }
        this.size++;
    }
    
    public static int Calculos(String Compuerta, int entrada1, int entrada2){
        int resultado;
        resultado = 0;
        
        if(Compuerta == "AND"){
            Comp_Factory Factory= FactoryCrear.getFactory("AND");
            OpAnd AND = Factory.getAND("AND");
            resultado = AND.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "NAND"){
            Comp_Factory Factory = FactoryCrear.getFactory("NAND");
            OpNand NAND = Factory.getNAND("NAND");
            resultado = NAND.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "NOR"){
            Comp_Factory Factory = FactoryCrear.getFactory("NOR");
            OpNor NOR = Factory.getNOR("NOR");
            resultado = NOR.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "NOT"){
            Comp_Factory Factory = FactoryCrear.getFactory("NOT");
            OpNot NOT = Factory.getNOT("NOT");
            resultado = NOT.operacion(entrada1);
            
        }else if(Compuerta == "OR"){
            Comp_Factory Factory = FactoryCrear.getFactory("OR");
            OpOr OR = Factory.getOR("OR");
            resultado = OR.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "XNOR"){
            Comp_Factory Factory = FactoryCrear.getFactory("XNOR");
            OpXnor XNOR = Factory.getXNOR("XNOR");
            resultado = XNOR.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "XNOR"){
            Comp_Factory Factory = FactoryCrear.getFactory("XNOR");
            OpXnor XNOR = Factory.getXNOR("XNOR");
            resultado = XNOR.operacion(entrada1, entrada2);
            
        }else if(Compuerta == "XOR"){
            Comp_Factory Factory = FactoryCrear.getFactory("XOR");
            OpXor XOR = Factory.getXOR("XOR");
            resultado = XOR.operacion(entrada1, entrada2);
            
        }
        
    return resultado;
}
    
    
}