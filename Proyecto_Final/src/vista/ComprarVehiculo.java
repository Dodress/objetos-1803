package vista;
import entidad.*;
import java.util.Scanner;
import modelo.*;

public class ComprarVehiculo {
    public static void main(String[] args) {        
        System.out.println("¿Que tipo de vehiculo deseas comprar?");
        System.out.println("1. Automovil");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camion");
        Scanner datos=new Scanner(System.in);//se crea un objeto de clase escanner para recivir un numero a travez de la consola
        int i=datos.nextInt();
        System.out.println("\n");//un salto de linea
        Vehiculo vehiculo=new Vehiculo();//se crea un objeto de tipo vehiculo
        switch(i){
            case 1:
                vehiculo=automovil();//metodo automovil() regresa un objeto de tupo Automovil
                break;
            case 2:
                vehiculo=motocicleta();//el metodo de tipo motocicleta regresa un objeto de tipo Motocicleta
                break;
            case 3:
                vehiculo=camion();//el metodo de tipo camion regresa un objeto de tipo Camion
                break;
            default:
                System.out.println("Eliga una opcion correcta");
            break;
            /*como las clases Automovil, Motocicleta y Camion heredan de la clase Vehiculo
            entonces estas 3 clases tambien son de tipo Vehiculo, es por eso que nuestro objeto vehiculo
            de tipo Vehiculo puede ser igualado con cualquiera de estas 3 clases, hacer esto
            empieza el POLIMORFISMO
            */
        }
        System.out.println("\n***Datos del cliente***\n");
        System.out.println("Nombre completo: ");
        String basura=datos.nextLine();//esta variable recoge la basura que genera el teclado
        String nombre=datos.nextLine();
        System.out.println("Numero telefonico: ");
        long telefono=datos.nextLong();
        Cliente c1=new Cliente(nombre, telefono);//se crea un objeto de tipo cliente
        System.out.println("Forma de pago(contado/credito): ");
        String basura2=datos.nextLine();
        String formaPago=datos.nextLine();
        Venta v1=new Venta(vehiculo.getPrecio(), formaPago);//se crea un objeto de tipo venta
        System.out.println("\nFactura de venta:");
        System.out.println(v1);//la clase venta tambien tiene el metodo ToString()
        System.out.println("\nInformacion del auto a comprar:");
        /*POLIMORFISMO significa "muchas formas", aqui es donde se USA, se imprime
        el objeto vehiculo, la clase Vehiculo tiene el metodo ToString() este sirve 
        para imprimir sus atributos con solo imprimir el objeto,PERO dependiendo del
        tipo de objeto que se le almaceno anteriormente a vehiculo ya sea Automovil, Motocicleta o
        Camion el metodo ToString() hara o mostrara diferentes cosas, cuando el mismo
        metodo es capaz de mostrar diferentes cosas o incluso hacer cosas diferentes,
        ESO es el POLIMORFISMO*/
        System.out.println(vehiculo);//vehiculo puede tomar forma de automovil, motoclicleta o camion(muchas formas)
    }
    
    
    private static Automovil automovil(){/*en su valor de retorno se pone que retornara un objeto de tipo Automovil
                                        Cuando un metodo es estatico, significa que no se requiere 
                                        instanciar la clase para llamar a estos metodos, igual que la 
                                           clase Calcular, cuando un metodo no es estatico se requiere crear
                                        un objeto de esta clase y de ese objeto ya se invocan los metodos*/
        Scanner datos=new Scanner(System.in);/*se crea un objeto de tipo escanner que servira
                                             para que el usuario meta datos a traves de la consola*/
        System.out.println("Marca: ");
        String marca=datos.nextLine();//el usuario mete un String y lo guardamos en la variable marca
        System.out.println("Modelo: ");
        String modelo=datos.nextLine();
        System.out.println("Año: ");
        int año=datos.nextInt();
        System.out.println("Color: ");
        String basura=datos.nextLine();//recoge la basura que genera el teclado
        String color=datos.nextLine();
        System.out.println("Pais de origen: ");
        String paisOrigen=datos.nextLine();
        System.out.println("Precio: ");
        double precio=datos.nextDouble();
        System.out.println("Puertas: ");
        int puertas=datos.nextInt();
        System.out.println("Numero de ocupantes: ");
        int numeroOcupantes=datos.nextInt();
        /*se crea un objeto de tipo Automovil llamado a1, se utiliza un constructor diferente al de defecto*/
        Automovil a1=new Automovil(puertas, numeroOcupantes, marca, modelo, año, color, paisOrigen, precio);
        //estos metodos ponen la clasificacion de precio y de año al objeto a1
        Calcular.clasificacionPrecio(a1);
        Calcular.clasificacionAño(a1);
        //regresamos el objeto a1
        return a1;
    }
    
    
    private static Motocicleta motocicleta(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Marca: ");
        String marca=datos.nextLine();
        System.out.println("Modelo: ");
        String modelo=datos.nextLine();
        System.out.println("Año: ");
        int año=datos.nextInt();
        System.out.println("Color: ");
        String basura=datos.nextLine();
        String color=datos.nextLine();
        System.out.println("Pais de origen: ");
        String paisOrigen=datos.nextLine();
        System.out.println("Precio: ");
        double precio=datos.nextDouble();
        System.out.println("Uso: ");
        String uso=datos.nextLine();
        System.out.println("Centimetros cubicos de motor: ");
        int ccMotor=datos.nextInt();
        System.out.println("Clasificacion del uso: ");
        String basura2=datos.nextLine();
        String clasificacionUso=datos.nextLine();
        Motocicleta m1=new Motocicleta(uso, ccMotor, clasificacionUso, marca, modelo, año, color, paisOrigen, precio);
        Calcular.clasificacionPrecio(m1);
        return m1;
    }
    
    
    private static Camion camion(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Marca: ");
        String marca=datos.nextLine();
        System.out.println("Modelo: ");
        String modelo=datos.nextLine();
        System.out.println("Año: ");
        int año=datos.nextInt();
        System.out.println("Color: ");
        String basura=datos.nextLine();
        String color=datos.nextLine();
        System.out.println("Pais de origen: ");
        String paisOrigen=datos.nextLine();
        System.out.println("Precio: ");
        double precio=datos.nextDouble();
        System.out.println("Capacidad de carga(Kg): ");
        float capacidadCarga=datos.nextFloat();
        System.out.println("Numero de ocupantes: ");
        int numeroOcupantes=datos.nextInt();
        Camion c1=new Camion(capacidadCarga, numeroOcupantes, marca, modelo, año, color, paisOrigen, precio);
        Calcular.clasificacionPrecio(c1);
        Calcular.clasificacionCarga(c1);
        return c1;
    }
}
