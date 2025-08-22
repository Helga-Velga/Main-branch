package Geometry;

import java.awt.*;

interface Shape{

    double getArea();
    double getPerimeter();
    Color getFillColor();
    Color getBorderColor();

    default void dysplayInfo(){

        System.out.println("Фигура: " + getClass().getSimpleName());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());

    }

}
