
package serializar;


public class Aplicacion {
    public static void main(String[] args)throws Exception{
        
        //pues a usar nuestro modelo
        Cliente c=new Cliente();
        c.setEdad(21);
        c.setNombre("Bryan Loza");
        c.setSueldo(45000);
        
        PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con exito!!");
    }
}
