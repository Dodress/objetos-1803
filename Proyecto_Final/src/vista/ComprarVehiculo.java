package vista;
import entidad.*;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.*;

public class ComprarVehiculo {
    public static void main(String[] args) {        
        //creamos un objeto de tipo Automovil
        Automovil a1=new Automovil(2, 2, "Koenigsegg", "Agera", 2011, "Rojo", "Suecia", 4400000);
        //utilizamos estos metodos para introducir su clasificacion de precio y Año
        Calcular.clasificacionPrecio(a1);
        Calcular.clasificacionAño(a1);
        //creamos un objeto de tipo Motocicleta
        Motocicleta m1=new Motocicleta("Particular", 883, "Chopper", "Harley", "Iron", 2014, "negro", "EUA", 213000);
        //utilizamos este metodo para introducir su clasificacion de precio
        Calcular.clasificacionPrecio(m1);
        //creamos un objeto de tipo Camion
        Camion c1=new Camion(496000, 2, "beLAZ", "beLAZ 75710", 2013, "Amarillo", "Bielorrusia", 6000000);
        //utilizamos estos metodos para introducir su clasificacion de precio y carga
        Calcular.clasificacionPrecio(c1);
        Calcular.clasificacionCarga(c1);
        //generamos un arreglo dinamico que almacene objetos de tipo Vheiculo
        ArrayList<Vehiculo> vehiculos=new ArrayList<>();
        //le introducimos a nuestro arreglo los obejtos ya creados que al heredar de Vehiculo SON de tipo Vehiculo
        vehiculos.add(a1);
        vehiculos.add(m1);
        vehiculos.add(c1);
        //utlizamos un FOR MEJORADO para imprimir en consola los datos de los vehiculos dentro de nuestro arreglo
        int i=1;
        for(Vehiculo v:vehiculos){
            System.out.println(i+" "+v);
            i++;
        }
        System.out.println("");
        //creamos un objeto de tipo Scanner para poder introducir datos en consola        
        Scanner datos = new Scanner(System.in);
        System.out.println("Escribe el numero de lo que desees comprar: ");
        int selector=datos.nextInt();
        String basura=datos.nextLine();//Se usa para recoger la basura que genera el teclado
        selector-=1;//el arreglo empieza en 0 y al cliente se muestra desde el 1, por eso se le resta 1
        System.out.println("Introduce la forma de pago (Contado o Credito): ");
        String formaPago=datos.nextLine();
        //creamos un objeto de tipo de Venta
        Venta v1=new Venta(vehiculos.get(selector).getPrecio(), formaPago);
        System.out.println("Introduce tu nombre completo: ");
        String nombre=datos.nextLine();
        System.out.println("Introduce tu numero telefonico: ");
        int telefono=datos.nextInt();
        //creamos un objeto de tipo Cliente
        Cliente cliente1=new Cliente(nombre, telefono);
        System.out.println("");
        System.out.println("A continuacion se le muestra su factura: ");
        System.out.println("");
        System.out.println(cliente1);
        System.out.println(v1);
    }
}
