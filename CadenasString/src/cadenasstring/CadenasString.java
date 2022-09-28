package cadenasstring;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class CadenasString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // String = char []
        char [] arr = {'t','E','X','t','o'};
        char c;
        int size,index;
        String b = "texto";
        String a = new String(arr);
        
        c = b.charAt(2);
        size = b.length();
        
        b = b.toUpperCase();
        
        b = b.toLowerCase();
        
        index = b.lastIndexOf("T");
        
        
        System.out.println(b);
    }
    
}
