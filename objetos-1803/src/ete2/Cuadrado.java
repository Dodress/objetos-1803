package ete2;

public class Cuadrado implements Figura{

    private float lado;
    
    @Override
    public float area() {
         return (float)(this.lado*this.lado);
    }

    @Override
    public float perimetro() {
        return (float)(this.lado*4);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    
}
