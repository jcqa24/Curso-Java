package herencia;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Profesor extends Persona {
    
    int noTrabajador;
    double salario;
    
    Profesor(String nombre, int edad,int noTrabajador,double salario){
        super(nombre,edad);
        this.noTrabajador = noTrabajador;
        this.salario = salario;
    }
    
    void muestraDatosProfe(){
        this.muestraDatosGenerales();
        System.out.println("Tu numero de trabajador es: "+this.noTrabajador+" tu salario es: "+this.salario);
    }
}
