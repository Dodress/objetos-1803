/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
}
