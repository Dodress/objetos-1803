
package modelo;

import java.util.*;
import java.io.Serializable;

public class Pregunta implements Serializable{
    private String titulo;
    private ArrayList<Opcion> opcion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opcion> opcion) {
        this.opcion = opcion;
    }

    public Pregunta() {
    }

    public Pregunta(String titulo, ArrayList<Opcion> opcion) {
        this.titulo = titulo;
        this.opcion = opcion;
    }
    
    
}
