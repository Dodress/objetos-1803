
package serializar;

import java.io.*;
public class PersistenciaUsuario {
    
    //primero guardamos
    
    public static void guardar (Cliente c)throws Exception{
    //paso 1 generar el archivo donde se va  guardar nuestro serializado
    File file= new File("D:\\archivaldo.yomero");
    
    //paso 2 indicar que lo vamos a generar para escribir en el
    FileOutputStream fos=new FileOutputStream(file);
    
    //paso 3 escribir un objeto en el
    
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(c);
    oos.close();
    }
}
