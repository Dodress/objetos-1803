package ete2;

import java.util.ArrayList;

public class ProbarFiguras {
    public static void main(String[] args){
        Circulo circulo=new Circulo(3);
        Cuadrado cuadrado=new Cuadrado(2);
        Triangulo triangulo=new  Triangulo(2, 3);
        
        ArrayList<Figura> figuras=new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);
        
        for(Figura f:figuras){
            String s=(f.getClass().toString());
            System.out.println("La figura: "+s.substring(11));
            System.out.println("Area: "+f.area());
            System.out.println("Perimetro: "+f.perimetro());
        }
    }
}
