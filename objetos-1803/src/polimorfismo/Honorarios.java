
package polimorfismo;


public class Honorarios extends Trabajador{

    @Override
    public void pagar() {
        System.out.println("SE VA A PAGAR A HONORARIOS A ESTE TRABAJADOR");
    }
    
    
}
