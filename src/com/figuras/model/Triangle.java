package com.figuras.model;

public class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    //METODO
    public double getArea() {
        double A3;
        A3 = (base*height)/2;
        return A3;
    }

    //IMPRIME NOMBRE
    public void draw() {
        System.out.println("Triángulo");
    }
}
