package ete2;

public class Circulo implements Figura {

    private float radio;
    
    @Override
    public float area() {
        return (float)(3.1416*this.radio*this.radio);
    }

    @Override
    public float perimetro() {
        return (float)(3.1416*this.radio*2);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    
}
