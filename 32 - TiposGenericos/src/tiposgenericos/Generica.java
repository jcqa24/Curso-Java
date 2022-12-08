package tiposgenericos;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Generica <T> {
    private T dato1;

    public Generica(T dato1) {
        this.dato1 = dato1;
    }

    public T getDato1() {
        return dato1;
    }

    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }
    
    public String obtenTipo(){
        return this.dato1.getClass().toString();
    }  
    
    
}
