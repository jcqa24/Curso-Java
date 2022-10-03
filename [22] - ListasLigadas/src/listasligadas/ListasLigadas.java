package listasligadas;

import java.util.LinkedList;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ListasLigadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* LinkedList<String> lista = new LinkedList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        
        
        lista.addFirst("AA");
        lista.add(2,"ASD");
        lista.addLast("Z");
        for(int i=0;i<lista.size();i++){
           System.out.println(lista.get(i));
       }
        
        System.out.println("***********");
        lista.removeFirst();
        lista.removeLast();
        lista.remove(1);
        lista.remove("C");
        
       for(int i=0;i<lista.size();i++){
           System.out.println(lista.get(i));
       }*/
       
       
       LinkedList<Trabajador> listaTrabajadores = new LinkedList<Trabajador>();
       
       listaTrabajadores.add(new Trabajador(50,1));
       listaTrabajadores.add(new Trabajador(150,2));
       listaTrabajadores.add(new Trabajador(1500,3));
       
        for(int i=0;i<listaTrabajadores.size();i++){
           listaTrabajadores.get(i).muestraInfo();
       }
       
       
       
    }
    
}
