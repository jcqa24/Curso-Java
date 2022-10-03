
package intefaces;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Intefaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona P = new Persona();
       Animal a = new Animal();
       
       P.Desayuno();
       a.Desayuno();
       a.Dormido();
       
       
        System.out.println("Yo debo dormir "+a.horasDormir+" horas");
    }
    
}
