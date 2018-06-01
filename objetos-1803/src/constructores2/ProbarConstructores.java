
package constructores2;

import javax.swing.JFrame;


public class ProbarConstructores {
    public static void main(String[] args){
    //creamos un objeto de la clase persona
    Persona p1=new Persona("Bryan");
    Persona p2=new Persona();
    JFrame ventanita=new JFrame("Hola mundo");
    ventanita.setSize(300,300);
    ventanita.setVisible(true);
    }
    
}
