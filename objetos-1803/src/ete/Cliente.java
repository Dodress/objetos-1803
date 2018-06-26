
package ete;


public class Cliente {
    private String nombre;
    private Tarjeta tarjeta;

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cliente() {
    }

    public Cliente(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }
    
    
    
}
