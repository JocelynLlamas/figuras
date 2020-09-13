package com.figuras;

import com.figuras.model.Circle;
import com.figuras.model.Rectangle;
import com.figuras.model.Square;
import com.figuras.model.Triangle;

public class Application {

    public static void main(String[] args) {

        //CREA LAS FIGURAS 
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 20);

        //ARREGLO DE 5 CUADRADOS
        Square squares[] = new Square[5];
        //INSTANCIAS DE SQUARE
        squares[0] = new Square(8);
        squares[1] = new Square(2);
        squares[2] = new Square(10);
        squares[3] = new Square(25);
        squares[4] = new Square(3);
    
        //LLAMA A LOS METODOS
        printFigure(circle1);
        printFigure(rectangle);
        printFigure(triangle);
    
        //ITERACION SOBRE EL ARREGLO DE SQUARES (ES PLURAL PORQUE ES UN ARREGLO)
        for (Square square : squares) {
            printFigure(square);
        }
    }


    public static void printFigure(Circle circle) {
        circle.draw();
        System.out.println("Area: " + circle.getArea());
    }

    public static void printFigure(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void printFigure(Square square) {
        square.draw();
        System.out.println("Area: " + square.getArea());
    }

    public static void printFigure(Triangle triangle) {
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }


}
