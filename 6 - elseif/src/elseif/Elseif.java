/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;

import java.util.Scanner;

/**
 *
 * @author garrobo
 */
public class Elseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int hora;
//        
//        System.out.println("Inicio del programa");
//        
//        hora = 9;
//        
//        if (hora < 12 && hora >= 6){
//            System.out.println("Buenos dias");
//        }else if(hora >= 12 && hora < 19) {
//            System.out.println("Buenas tardes");
//        }else{
//            System.out.println("Buenas noches");
//        }
//        
//        
//        System.out.println("Fin del programa");

        double a,b,c,d,x1,x2,r1,r2;
        
          Scanner s = new Scanner(System.in);
          
          System.out.println("Ingresa el coeficiente de x^2");
          a = s.nextDouble();
          System.out.println("Ingresa el coeficiente de x");
          b = s.nextDouble();
          System.out.println("Ingresa el termino constante");
          c = s.nextDouble();
          
          if (a == 0){
              System.out.println("La ecuacion no es de segundo grado");
          }else{
              // Math.pow(b,2) = b*b
              d = (b*b) - 4*a*c ;
              
              if (d < 0){
                  System.out.println("La ecuacion no tiene soluciones reales");
              }else{
                  x1 = (-b + Math.sqrt(d)) / 2*a ;
                  x2 = (-b - Math.sqrt(d)) / 2*a ;
                  
                  r1 = ((x1*x1)*a)+(x1*b)+c;
                  r2 = ((x2*x2)*a)+(x2*b)+c;
                  if (r1 != 0 || r2 !=0){
                      System.out.println("Error al calcular las soluciones");
                  }else{
                      System.out.println("X1 => "+x1+"        X2 => "+x2);
                  }
              }
          }
    }
    
}
