
package genericos;

import java.util.ArrayList;

public class AplicacionPregunta {
    public static void main(String[] args){
        //generamos las opciones
        Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        
        Opcion o21=new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        
         Opcion o31=new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        
         Opcion o41=new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
        //sigue las preguntas
        
        Pregunta p11=new Pregunta();
        p11.setTitulo("¿Cual es la capital de España?");
        //Antes generamos el arrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp11=new ArrayList<>(); 
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
        //ahora si este arrayList lo agregamos a la primera pregunta
        p11.setOpcion(opcionesp11);
        
        //el cuestionario
        
        Cuestionario c1=new Cuestionario();
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        c1.setPreguntas(preguntas);
        
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
            
            for(Opcion o:p.getOpcion()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
    }
    
}
