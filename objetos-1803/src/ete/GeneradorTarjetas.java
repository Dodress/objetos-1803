
package ete;

import java.util.ArrayList;


public class GeneradorTarjetas {
    private ArrayList<Cliente> cliente;

    public GeneradorTarjetas() {
        cliente=new ArrayList<>();
        
    Tarjeta t1=new Tarjeta(1234,"Banamex",32000);
    Tarjeta t2=new Tarjeta(5678,"HSBC",17500);
    Tarjeta t3=new Tarjeta(8765,"Scotia",19600);
    Tarjeta t4=new Tarjeta(9321,"Bancomer",48000);
    
    Cliente c1=new Cliente("Juan",t1);
    Cliente c2=new Cliente("Ana",t2);
    Cliente c3=new Cliente("Pedro",t3);
    Cliente c4=new Cliente("Irma",t4);
    
    cliente.add(c1);
    cliente.add(c2);
    cliente.add(c3);
    cliente.add(c4);
    
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    
}
