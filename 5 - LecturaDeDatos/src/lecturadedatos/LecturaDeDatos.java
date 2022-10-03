/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturadedatos;
import java.util.Scanner;
/**
 *
 * @author garrobo
 */
public class LecturaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
//        System.out.println("Ingresa tu nombre");
//       
//       String Nombre = s.nextLine();
//       
//        System.out.println("Tu nombre es: "+ Nombre);
    
        System.out.println("Ingresa tu edad: ");
        
        int edad = s.nextInt();
        
        System.out.println("Tu edad es: " + edad);
        
        
    }
    
}
