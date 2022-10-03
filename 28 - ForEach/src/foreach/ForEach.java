package foreach;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //String [] A = {"J","C","Q","A"};
            
            Stack<String> A = new Stack<String>();
            A.push("J");
            A.push("C");
            A.push("Q");
            A.push("A");
            
            
            
            for (String i : A) {
                System.out.println(i.toLowerCase());
        }
    }
    
}
