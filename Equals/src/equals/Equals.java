package equals;

import java.util.Iterator;
import java.util.LinkedList;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Alumno> lista = new LinkedList<Alumno>();
        Iterator<Alumno> it = lista.iterator();
        boolean enlista= false;
        Alumno newA = new Alumno(1,"jc");
        
        while(it.hasNext() && !enlista){
            if(it.next().equals(newA)){
                enlista = true;
            }
        }
        
        if(!enlista){
            lista.add(newA);
        }
        
        newA = new Alumno(12,"jcqw");
        it = lista.iterator();
        
        while(it.hasNext() && !enlista){
            if(it.next().equals(newA)){
                enlista = true;
            }
        }
        
        if(!enlista){
            lista.add(newA);
        }
        
        Iterator<Alumno> it2 = lista.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next().getNombre());
        }
       
    }
    
}
