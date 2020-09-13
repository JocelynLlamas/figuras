package com.figuras.model;

public class Square {
    private int side;

    //CONSTRUCTOR
    public Square(int side) {
        this.side = side;
    }

    //METODO
    public double getArea() {
        double A4;
        A4=(Math.pow(side, 2));
        return A4;
    }

    //IMPRIME NOMBRE
    public void draw() {
            System.out.println("Cuadrado");
    }
}
