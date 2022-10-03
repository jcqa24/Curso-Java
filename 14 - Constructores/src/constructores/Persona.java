/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Persona {
    
    String Nombre;
    String AMaterno;
    String APaterno;
    int edad;
    boolean mayorEdad;
    
    public Persona(String N, String AM, String AP, int e){
        this.Nombre = N;
        this.AMaterno = AM;
        this.APaterno = AP;
        this.edad = e;
        mayorEdad= false;
    }

    
    public void ImprimeDatos(){
        if(this.edad >= 18){
            mayorEdad = true;
        }
        System.out.println(this.Nombre+" "+this.APaterno + " "+ this.AMaterno + " ");
        System.out.println("Tienes una edad de : "+ this.edad+ " años");
        if(mayorEdad){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    } 
}
