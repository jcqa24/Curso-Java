package intefaces;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Persona implements Comer {
    
    public void Desayuno(){
        System.out.println("La persona esta desayunando");
    }
    public void Comida(){
        System.out.println("La persona esta comiendo");
    }
    
    public void Cena(){
        System.out.println("La persona esta cenado");
    }

}
