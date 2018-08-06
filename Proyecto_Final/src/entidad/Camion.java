package entidad;

public class Camion extends Vehiculo{
    private float capacidadCarga;
    private int numeroOcupantes;
    private String clasificacionCarga;

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public String getClasificacionCarga() {
        return clasificacionCarga;
    }

    public void setClasificacionCarga(String clasificacionCarga) {
        this.clasificacionCarga = clasificacionCarga;
    }

    public Camion() {
    }

    public Camion(float capacidadCarga, int numeroOcupantes, String marca, String modelo, int año, String color, String paisOrigen, float precio) {
        super(marca, modelo, año, color, paisOrigen, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroOcupantes = numeroOcupantes;
    }
    
    @Override
    public String toString() {
        return "Camion{" + tooString() + "capacidadCarga=" + capacidadCarga + ", numeroOcupantes=" + numeroOcupantes + ", clasificacionCarga=" + clasificacionCarga + '}';
    }

    
}
