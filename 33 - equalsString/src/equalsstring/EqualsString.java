package equalsstring;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class EqualsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "hola";
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");
    }
    
}
