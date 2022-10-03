/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;



/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ArrayL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> ListaNumeros = new ArrayList<String>();
               
        
        ListaNumeros.add("a");
        ListaNumeros.add("b");
        ListaNumeros.add("c");
        ListaNumeros.add("d");
        ListaNumeros.add("c");
        
        ListaNumeros.clear();
        
        
        
        for(int i =0; i < ListaNumeros.size();i++){
            System.out.println(ListaNumeros.get(i));
        }
        
        
        ArrayList<Trabajador> ListaTrabajadores = new ArrayList<Trabajador>();
        
        Trabajador t1 = new Trabajador(500.0,1);
        ListaTrabajadores.add(t1);
        
        ListaTrabajadores.get(0).muestraInfo();
        
        ListaTrabajadores.add(new Trabajador(1000.0,2));
        ListaTrabajadores.get(1).muestraInfo();
        
        
        
    }
    
}
