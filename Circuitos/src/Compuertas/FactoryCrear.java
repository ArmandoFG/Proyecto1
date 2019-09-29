/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compuertas;

/**
 *
 * @author Armando Fallas
 */
public class FactoryCrear{
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
