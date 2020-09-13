package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    //MÉTODO
    public double getArea(){
        double A1;
        A1 = Math.PI*(Math.pow(radio, 2));
        return A1;
    }

    //IMPRIME EL NOMBRE
    public void draw(){
            System.out.println("Circulo");
    }

}
