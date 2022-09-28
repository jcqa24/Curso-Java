package iteradores;

import java.util.Iterator;
import java.util.LinkedList;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Iteradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> A = new LinkedList<String>();
       
       
       A.add("78");
      
       A.add("76");
       
       A.add("45");
       A.add("123");
       A.add("96");
       
       
       Iterator it = A.iterator();
       
       //hasnext()
       //next()
       //remove()
       
        System.out.println("tamaño inicial "+A.size());
       
       while(it.hasNext()){
           System.out.println(it.next());
           it.remove();
       }
       
       System.out.println("tamaño final "+A.size());
       
    }
    
}
