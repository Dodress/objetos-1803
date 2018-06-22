
package serializar;

import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
    
            
    //primero guardamos
    
    public static void guardar (Cliente c)throws Exception{
    //paso 1 generar el archivo donde se va  guardar nuestro serializado
    ArrayList<Cliente> clientes=new ArrayList<>();
   
    File file= new File("archivaldo.yomero");
    
    if(file.exists())clientes= leer();
    clientes.add(c);
    
    //paso 2 indicar que lo vamos a generar para escribir en el
    FileOutputStream fos=new FileOutputStream(file);
    
    //paso 3 escribir un objeto en el
    
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
    
    oos.writeObject(clientes);
    oos.close();
    }
    
    public static ArrayList<Cliente> leer() throws Exception{
        //para leer primero ponemos el archivo
        File file=new File("archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Cliente> clientes = (ArrayList<Cliente>) ois.readObject();
        return clientes;
    }
}
