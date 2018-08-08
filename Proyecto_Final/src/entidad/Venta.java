package entidad;

public class Venta {
    private double precio;
    private String formaPago;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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

    public Venta(double precio, String formaPago) {
        this.precio = precio;
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Venta{" + "precio=" + precio + ", formaPago=" + formaPago + '}';
    }
    
}
