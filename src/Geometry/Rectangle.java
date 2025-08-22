package Geometry;

import java.awt.*;

class Rectangle implements Shape {
    private double width;
    private  double height;
    private Color fillColor;
    private Color borderColor;

    public Rectangle (double width, double height, Color fillColor, Color borderColor){
        this.width = width;
        this.height =height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    public double getPerimeter (){
        return 2 * (width + height);
    }
    public double getArea(){
        return  width + height;
    }
    public Color getFillColor(){
        return fillColor;
    }
    public Color getBorderColor(){
        return borderColor;
    }
}
