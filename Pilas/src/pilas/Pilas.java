
package pilas;

import java.util.Stack;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        
        pila.push("Mundo");
        
        pila.push("Hola");
        
        
        pila.push("Programatutos");
        
        while(!pila.empty()){
            System.out.println(pila.peek());
        }

       
        
        if(pila.empty()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("La pila tiene elementos");
        }
    }
    
}
