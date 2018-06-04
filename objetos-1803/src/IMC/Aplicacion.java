package IMC;

public class Aplicacion {

    public static void main(String[] args) {
        //genero una instancia de la clase usuario
        Usuario a = new Usuario();

        a.setAltura(1.61f);
        a.setPeso(55);

        //genero una instancia de la clase imc
        Imc b = new Imc();
        b.setUsuario(a);

        System.out.println(b.getImc());

    }

}
