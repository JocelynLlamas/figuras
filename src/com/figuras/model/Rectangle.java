package com.figuras.model;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.height = height;
        this.base = base;
    }

    //METODO
    public double getArea(){
        double A2;
        A2=(base*height); 
        return A2;
    }

    //IMPRIME NOMBRE
    public void draw(){
        System.out.println("Rectángulo");
    }
}
