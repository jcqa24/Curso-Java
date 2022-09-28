package herencia;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Herencia {


    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("JCQA",24,1,10);
        
        System.out.println("Alumno :::");
        a1.muestraDatosAlumno();
        
        
        Profesor t1 = new Profesor("Programatutos",50,01,500);
        
        System.out.println("Profesor:::");
        t1.muestraDatosProfe();
        
        
        
        
    }
    
}
