
package Compuertas;

/**
 *
 * @author Armando Fallas
 * @version 1.2
 */
public class FactoryCrear{
    
    /**
     * 
     * @param choice    Tipo de compuerta
     * @return 
     * 
     * Retorna de la Fabrica el tipo de compuerta que el usuario selecciono
     */
    
    public static Factory getFactory(String choice){
	      if(choice.equalsIgnoreCase("OR")){                
	         return new Factory();
	      }else if(choice.equalsIgnoreCase("NOT")){
	         return new Factory();
	      }else if(choice.equalsIgnoreCase("XOR")){
	         return new Factory();
	      }else if(choice.equalsIgnoreCase("XNOR")){
	         return new Factory();
	      }else if(choice.equalsIgnoreCase("NOR")){
	         return new Factory();
	      }else if(choice.equalsIgnoreCase("NAND")){
	         return new Factory();
	      }
              else if(choice.equalsIgnoreCase("AND")){
	         return new Factory();
	      }
	      
	      return null;
	   }

    
}
