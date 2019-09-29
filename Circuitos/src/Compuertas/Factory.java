/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuertas;

/**
 *
 * @author arman
 */
public class Factory extends Comp_Factory {

   

    @Override
    public OpAnd getAND(String tipoAnd) {
        if(tipoAnd == null){
            return null;
        }
        if(tipoAnd.equalsIgnoreCase("AND")){
            return new And();
    }
        return null;
    }
    @Override
    public OpNand getNAND(String tipoNand) {
        if(tipoNand == null){
            return null;
        }
        if(tipoNand.equalsIgnoreCase("NAND")){
            return new Nand();
    }
        return null;
    }

    @Override
    public OpNor getNOR(String tipoNor) {
        if(tipoNor == null){
            return null;
        }
        if(tipoNor.equalsIgnoreCase("NOR")){
            return new Nor();
    }
        return null;
    }

    @Override
    public OpNot getNOT(String tipoNot) {
        if(tipoNot == null){
            return null;
        }
        if(tipoNot.equalsIgnoreCase("NOT")){
            return new Not();
    }
        return null;
    }

    @Override
    public OpOr getOR(String tipoOr) {
        if(tipoOr == null){
            return null;
        }
        if(tipoOr.equalsIgnoreCase("OR")){
            return new Or();
    }
        return null;
    }

    @Override
    public OpXnor getXNOR(String tipoXnor) {
        if(tipoXnor == null){
            return null;
        }
        if(tipoXnor.equalsIgnoreCase("XNOR")){
            return new Xnor();
    }
        return null;
    }

    @Override
    public OpXor getXOR(String tipoXor) {
        if(tipoXor == null){
            return null;
        }
        if(tipoXor.equalsIgnoreCase("XOR")){
            return new Xor();
    }
        return null;
    }
    
}
