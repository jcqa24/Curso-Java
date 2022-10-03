/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Persona {
    
    String Nombre;
    String APaterno;
    String AMaterno;
    int edad;
    
    public Persona(){
        Nombre = null;
        APaterno = null;
        AMaterno = null ;
        edad = 0;
    }
    
    public Persona(String N){
        Nombre = N;
        APaterno = null;
        AMaterno = null ;
        edad = 0;
    }
    public Persona(String N, String AP){
        Nombre = N;
        APaterno = AP;
        AMaterno = null ;
        edad = 0;
    }
    public Persona(String N, String AP, String AM){
        Nombre = N;
        APaterno = AP;
        AMaterno = AM ;
        edad = 0;
    }
    public Persona(String N,  String AM, int e){
        Nombre = N;
        APaterno = null;
        AMaterno = AM ;
        edad = e;
    }
   
    public void MuestraDatos(){
        System.out.println(this.Nombre + " " + this.APaterno + " " + this.AMaterno + " Edad: "+this.edad);
    }
}
