package herencia;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Alumno extends Persona {
    
    int matricula;
    double promedio;
    
    Alumno(String nombre,int edad, int matricula,double promedio){
        super(nombre,edad);
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    void muestraDatosAlumno(){
        this.muestraDatosGenerales();
        System.out.println("Tu matricula es: "+this.matricula+" tu pomedio es: "+ this.promedio);
    }
    
}
