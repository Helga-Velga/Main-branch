package Geometry;

import java.awt.*;

public abstract class GeometryApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5.0, Color.GRAY, Color.BLUE),
                new Rectangle(4.0, 6.0, Color.PINK, Color.MAGENTA),
                new Triangle(3.0, 4.0, 5.0, Color.ORANGE, Color.YELLOW)
        };

        for (Shape shape:shapes) {
            System.out.println("Фигура " + shape.getClass());
            System.out.println("Периметр " + shape.getPerimeter());
            System.out.println("Площадь" + shape.getArea());
            System.out.println("Цвет заливки " + shape.getFillColor());
            System.out.println("Цвет границ " + shape.getBorderColor());
            shapes.toString();
            System.out.println();
        }
    }}
