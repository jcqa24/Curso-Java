/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkgfor;

/**
 *
 * @author garrobo
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i,j,a,c;
        a = 10;
        
        for(i=1;i<=a;i++){
            for (j = 1; j <= a; j++) {
                System.out.println(i+" X "+j+" = "+i*j);
            }
            System.out.println("===============================");           
        }
        
        
    }
    
}
