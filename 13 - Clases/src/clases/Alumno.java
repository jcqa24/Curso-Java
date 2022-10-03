/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author garrobo
 */
public class Alumno {
    String Nombre;
    String ApellidoP;
    String ApellidoM;
    String Matricula;
    float Promedio;
    
    public void muestraDatos(){
        System.out.println("Tu nombre es: "+this.Nombre);
        System.out.println("Tus apellidos: "+this.ApellidoP + " " + this.ApellidoM);
        System.out.println("Tu matricula es: "+this.Matricula);
        System.out.println("Tu promedio es: "+this.Promedio);
        
        if(this.Promedio >= 6.0){
            System.out.println("Felicidades Aprobaste");
        }else{
            System.out.println("Reprobaste");
        }
        
    } 
    
}
