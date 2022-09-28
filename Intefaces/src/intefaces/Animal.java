package intefaces;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Animal implements Comer, Dormir{
    public void Desayuno(){
        System.out.println("El animal esta desayunando");
    }
    public void Comida(){
        System.out.println("El animal esta comiendo");
    }
    
    public void Cena(){
        System.out.println("El animal esta cenado");
    }
    
    public boolean Dormido(){
        System.out.println("Estoy durmiendo");
        return true;
    }
    public boolean Despierto(){
        System.out.println("Estoy despierto");
        return false;
    }
}
