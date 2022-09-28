/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
        Alumno A1 = new Alumno();
        System.out.println("Ingresa tu nombre(s)");
        A1.Nombre = s.nextLine();
        System.out.println("Apellido Paterno");
        A1.ApellidoP = s.nextLine();
        System.out.println("Apellido Materno");
        A1.ApellidoM = s.nextLine();
        System.out.println("Matricula");
        A1.Matricula = s.nextLine();
        System.out.println("Promedio");
        A1.Promedio = s.nextFloat();
        
        
        A1.muestraDatos();
    }
    
}
