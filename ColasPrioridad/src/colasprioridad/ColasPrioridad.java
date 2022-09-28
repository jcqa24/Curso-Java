package colasprioridad;

import java.util.PriorityQueue;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ColasPrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(4);
        pq.add(2);
        pq.add(3);
        
        System.out.println(pq);
        
        pq.add(1);
        
        System.out.println(pq);
        
        
        
    }
    
}
