
package modelo;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class ProbarOrdenamientos {
    public static void main(String[] args){
        System.out.println("Aleatorios");
        Set<Integer> valores=new LinkedHashSet<>();        
        while(valores.size()<4){
            Random r=new Random();
            int valor=r.nextInt(4);
            valores.add(valor);            
        }
        for(Integer i:valores){
            System.out.println("opcion: "+i);
        }
        
    }
    
    
    
}
