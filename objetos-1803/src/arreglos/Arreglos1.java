
package arreglos;


public class Arreglos1 {
    public static void main(String[] args){
        int[] valores={1,-20,4};
    
        for(int i=0;i<valores.length;i++){
            System.out.println(valores[i]);
        }
        
        //este ciclo for es el mejorado y se recomienda simpre
        for(int v:valores){
            System.out.println(v);
        }
        
        //segunda forma de inicializar los arreglos
        int otro[]=new int[4];
        
        for(int v:otro){
            System.out.println(v);
        }
    
    }
}
