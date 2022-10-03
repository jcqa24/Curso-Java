/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkgwhile;

import java.util.Scanner;

public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,r,c,i;
        a = 6;
        b = 5;
        r = 0;
        c = 0;
        i = 2;
        
        Scanner s = new Scanner(System.in);
        
//        do{
//            System.out.println("Quieres continuar: ");
//            System.out.println("1 -> SI ");
//            System.out.println("2 -> No");
//            System.out.println("Ingresa tu respuesta");
//            r = s.nextInt();
//        }while(r != 2);
//        
//        System.out.println("Adios!!!");
          System.out.println("Ingresa un numero");
          r = s.nextInt();
          
          while( (i<r) && (c == 0) ){
              if ((r % i) == 0){
                  c++;
              }
              i++;
          }
          
          if (c == 0){
              System.out.println("EL numero "+r+" es primo");
          }else{
              System.out.println("EL numero "+r+" no es primo");
          }
        
    }
    
}
