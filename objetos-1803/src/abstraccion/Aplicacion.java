package abstraccion;

public class Aplicacion {
    public static void main(String[] args){
    //crear un objetivo de tipo Grados
    Grados g=new Grados();
    //A este objeto le asignamos un valor a su atributo centigrados
    g.setCentigrados(20);
    //creamos un objeto de la clase Conversion
    Conversion c=new Conversion();
    c.setGrados(g);
    //aplicar el modelo
    System.out.println(c.centigradosAFarenheit());
    }
}
