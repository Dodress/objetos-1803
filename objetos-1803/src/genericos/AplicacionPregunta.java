
package genericos;

import java.util.ArrayList;

public class AplicacionPregunta {
    public static void main(String[] args){
        
        GeneradorCuestionario generador=new GeneradorCuestionario();
        
        for(Pregunta p:generador.getCuestionario().getPreguntas()){
            System.out.println(p.getTitulo());
            
            for(Opcion o:p.getOpcion()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
    }
    
}
