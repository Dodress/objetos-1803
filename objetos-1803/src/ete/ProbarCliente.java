
package ete;


public class ProbarCliente {
    public static void main(String[] arg){
        
        for(Cliente c:new GeneradorTarjetas().getCliente()){
            System.out.println(c);
        }
    }
}
