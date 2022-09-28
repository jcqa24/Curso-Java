package iteradores;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Iteradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <String> lista = new Stack <String>();
        
        lista.push("Hola");
        lista.push("Mundo");
        
        Iterator <String> it = lista.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());            
        }
    }
    
}
