
package com.mycompany.numdiv3y5;

/**
 *
 * @author Brandon Hernandez Moreno
 * @beu7www@gmail.com
 */
import java.util.HashSet;
import java.util.Set;

public class NumDiv3y5 {
    public static void main(String[] args) {
        
        Set<Integer> conjB = new HashSet<>();
        Set<Integer> conjC = new HashSet<>();
        
           Set<Integer> union = new HashSet<>();
        Set<Integer> interseccion = new HashSet<>(); 
        Set<Integer> conjB2 = new HashSet<>();
        Set<Integer> conjC2 = new HashSet<>();

        for (int i = 1; i <= 1000; i++) { 
            if ((i % 3) == 0) {
                conjB.add(i);
                conjB2.add(i);   
            }
            
            if ((i % 5) == 0) {
                conjC.add(i);
                conjC2.add(i);    
            }
        }
        
        System.out.println("Los números divisibles entre 3 del conjunto B son: " + conjB);
        System.out.println("Los números divisibles entre 5 del conjunto C son: " + conjC);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        conjB.retainAll(conjC);
        System.out.println("La interección de B y C es: " + conjB);
        
        
        conjB2.addAll(conjC2);
        System.out.println("La unión de B y C es: " + conjB2);
        
        
        union.addAll(conjB2);
        
        interseccion.addAll(conjB);
        
        union.removeAll(interseccion);
        System.out.println(" B+C = <BuC> - <BnC> sesulta: " + union);
        
         
    }

}