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
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*System.out.println(Suma(2,1));
            System.out.println(Suma(2,1,2));
            System.out.println(Suma(2.0f,1.0f));*/
            
            
            Persona o1,o2,o3,o4,o5;
            
            o1 = new Persona();
            o2 = new Persona("Paco");
            o3 = new Persona("Paco","Sanchez");
            o4 = new Persona("Paco","Sanchez","Hernadez");
            o5 = new Persona("Paco","Hernadez",19);
            
            o1.MuestraDatos();
            o2.MuestraDatos();
            o3.MuestraDatos();
            o4.MuestraDatos();
            o5.MuestraDatos();
            
        
    }
    
    
    static int Suma(int a, int b){
        System.out.println("Metodo 1");
        return a+b;
    }
    
    static int Suma(int a ,int b, int c){
         System.out.println("Metodo 2");
        return a+b+c;
    }
    
    static float Suma(float a, float b){
         System.out.println("Metodo 3");
        return a+b;
    }
    

    
}
