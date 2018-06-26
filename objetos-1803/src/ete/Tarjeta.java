package ete;

public class Tarjeta {
private int numero;
private String nombre;
private float saldo;

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Tarjeta() {
    }

    public Tarjeta(int numero, String nombre, float saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Tarjeta(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    
}
