package tiposgenericos;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class TiposGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generica<Double> obj = new Generica<Double>(10.5);
        
                
        System.out.println(obj.obtenTipo());
        
    }

}
