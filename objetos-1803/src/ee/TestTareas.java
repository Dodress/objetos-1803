package ee;

import java.util.ArrayList;

public class TestTareas {
    
    public static void main(String[] args){
    ArrayList<Tarea> t;
    
    t=new ArrayList<>();
    
    Tarea t1=new Tarea(true,"hacer examen parcial",120);
    Tarea t2=new Tarea(true,"hacer examen parcial",120);
    Tarea t3=new Tarea(true,"hacer examen parcial",120);
    Tarea t4=new Tarea(true,"hacer examen parcial",120);
    
    t.add(t1);
    t.add(t2);
    t.add(t3);
    t.add(t4);
    
    for(Tarea ta:t){
        System.out.println(ta);
    }
    }

}
