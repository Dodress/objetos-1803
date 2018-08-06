package entidad;

public class Automovil extends Vehiculo{
    private int puertas;
    private int numeroOcupantes;
    private String clasificacionAño;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public String getClasificacionAño() {
        return clasificacionAño;
    }

    public void setClasificacionAño(String clasificacionAño) {
        this.clasificacionAño = clasificacionAño;
    }

    public Automovil() {
    }
    //este es un constructor que no recive clasificacionPrecio, ese atributo se obtiene de otra clase
    public Automovil(int puertas, int numeroOcupantes, String marca, String modelo, int año, String color, String paisOrigen, float precio) {
        super(marca, modelo, año, color, paisOrigen, precio);
        this.puertas = puertas;
        this.numeroOcupantes = numeroOcupantes;
    }

    @Override//este metodo sirve para devolver todos los atributos como una cadena al imprimir el OBJETO
    public String toString() {
        return "Automovil{" + tooString() + "puertas=" + puertas + ", numeroOcupantes=" + numeroOcupantes + ", clasificacionA\u00f1o=" + clasificacionAño + '}';
    }
    
    
}
