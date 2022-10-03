/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifjava;

import java.util.Scanner;

/**
 *
 * @author garrobo
 */
public class IfJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int a,b;
//        
//        a=10;
//        b=10;
//        
//        System.out.println("Inicio del programa");
//        
//        if(a > b){
//            System.out.println("El valor de a es mas grande");
//        }else if(b > a) {
//            System.out.println("El valor de b es mas grande");
//        }else{
//            System.out.println("Los dos valores son iguales");
//        }
//        
//        System.out.println("Fin del programa");

            int a,b,c,d;
            
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingresa el coeficiente de x^2");
            a = sc.nextInt();
            System.out.println("Ingresa el coeficiente de x");
            b = sc.nextInt();
            System.out.println("Ingresa el coeficiente constante");
            c = sc.nextInt();
            
            d = (b*b) - (4*a*c) ;
            
            if(a == 0){
                System.out.println("La ecuacion no es de segundo grado");
                
            }else{


                if(d >= 0){
                    System.out.println("La ecuacion tiene soluciones en los numeros"
                            + " reales");
                }else{
                       System.out.println("La ecuacion tiene soluciones en los numeros"
                            + " imaginarios");
            }  
            }
            
            
            
    }
    
}
