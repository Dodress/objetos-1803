/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author T-101
 */
public class PersistenciaPregunta {

    public static void guardar(Pregunta p) throws Exception {
        //paso 1 generar el archivo donde se va  guardar nuestro serializado
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("cuestionario.yo");
        if (file.exists()) {
            preguntas = leer();
        }
        preguntas.add(p);
        //paso 2 indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3 escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();
    }

    public static ArrayList<Pregunta> leer() throws Exception {
        //para leer primero ponemos el archivo
        File file = new File("cuestionario.yo");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Pregunta> preguntas = (ArrayList<Pregunta>) ois.readObject();
        return preguntas;
    }
    
    public static void borrar(int num) throws Exception{
        num-=1;//se le resta uno porque al usuario se le presentaron a partir del 1 y NO del 0
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file= new File("cuestionario.yo");
        preguntas=leer();//se pasa todo a un arreglo que podamos manipular
        preguntas.remove(num);//se elimina la que queremos
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);//se sobreescribe todo
        oos.close();
    }
    
    public static ArrayList<Opcion> opcionesAleatorias(ArrayList<Opcion> opciones){
    ArrayList<Opcion> opcionesAleatorias=new ArrayList<>();    
    Set<Integer> valores=new LinkedHashSet<>();                
        while(valores.size()<4){
            Random r=new Random();
            int valor=r.nextInt(4);
            valores.add(valor);            
        }        
        for(Integer i:valores){
            opcionesAleatorias.add(opciones.get(i));
    }
        return opcionesAleatorias;
    }
}
