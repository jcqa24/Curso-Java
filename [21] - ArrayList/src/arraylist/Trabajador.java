/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Trabajador {
    
    private double salario;
    private int id;

    public Trabajador(double salario, int id) {
        this.salario = salario;
        this.id = id;
    }
    
    public void muestraInfo(){
        System.out.println("Id: "+this.id + " salario: $"+this.salario);
    }
    
}
