package ete2;

public class Triangulo implements Figura{

    private float base;
    private float altura;
    
    
    @Override
    public float area() {
        return (float)((this.base*this.altura)/2);
    }

    @Override
    public float perimetro() {
        return (float)(this.base*3);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
}
