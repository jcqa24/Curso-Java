package hashmaap;

import java.util.HashMap;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */

class Alumno{
    String name;
    int [] cal ;
    
    public void MuestraDAtos(){
        System.out.println("Tu nombre es: "+this.name);
    }
}


public class HashMaap {
    public static void main(String[] args) {
           HashMap<Integer, Alumno> hm = new  HashMap<Integer,Alumno>();
           
           Alumno A1 = new Alumno();
           
           A1.name = "JCQA";
           
           int [] arr = {10,10,10};
           
           A1.cal = arr;
           
           
           hm.put(1, A1);
           
           
           System.out.println(hm.size());
           
           hm.clear();
           
           
           System.out.println(hm.size());
                
    }
    
}
