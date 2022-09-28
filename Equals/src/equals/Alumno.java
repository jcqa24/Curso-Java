package equals;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Alumno {
    private int matricula;
    private String nombre;

    public Alumno(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    
    public boolean equals(Alumno obj) {
        if (this == obj) {
            return true;
        }
        if((this.matricula == obj.matricula) || (this.nombre.equals(obj.nombre)) ){
        
            return true;
        }

       
        return false;
    }
 
    
}
