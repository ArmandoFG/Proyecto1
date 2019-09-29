/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuertas;

/**
 *
 * @author Armando Fallas
 * @version 1.2
 */

/**
 * Descripcion:
 * 
 * Retorna la operacion de la compuerta dependiendo
 * del tipo de compuerta ingresada
 * 
 */
public abstract class Comp_Factory {
     abstract public OpAnd getAND(String tipoAnd);
     abstract public OpNand getNAND(String tipoNand);
     abstract public OpNor getNOR(String tipoNor);
     abstract public OpNot getNOT(String tipoNot);
     abstract public OpOr getOR(String tipoOr);
     abstract public OpXnor getXNOR(String tipoXnor);
     abstract public OpXor getXOR(String tipoXor);
}
