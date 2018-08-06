package entidad;

public class Venta {
    private float precio;
    private String formaPago;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Venta() {
    }

    public Venta(float precio, String formaPago) {
        this.precio = precio;
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Venta{" + "precio=" + precio + ", formaPago=" + formaPago + '}';
    }
    
}
