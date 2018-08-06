package entidad;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private String paisOrigen;
    private float precio;
    private String clasificacionPrecio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getClasificacionPrecio() {
        return clasificacionPrecio;
    }

    public void setClasificacionPrecio(String clasificacionPrecio) {
        this.clasificacionPrecio = clasificacionPrecio;
    }

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String color, String paisOrigen, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.paisOrigen = paisOrigen;
        this.precio = precio;
    }

    public String tooString() {
        return "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", color=" + color + ", paisOrigen=" + paisOrigen + ", precio=" + precio + ", clasificacionPrecio=" + clasificacionPrecio + ", ";
    }
    
    
}
