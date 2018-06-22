
package serializar;


public class Aplicacion {
    public static void main(String[] args)throws Exception{
        
    
       for(Cliente c:PersistenciaUsuario.leer()){
           System.out.println("Nombre "+c.getNombre());
       }
        
        //System.out.println("Vamos a checar el nombre "+c.getNombre());
        
        /*
        Cliente c=new Cliente();
        c.setNombre("nube");
        c.setEdad(19);
        PersistenciaUsuario.guardar(c);
        */
    }
}
