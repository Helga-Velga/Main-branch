package Lesson_7_Install;
//найти площадь треугольника
public class Triangle {
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Все стороны должны быть положительными");
        }
        return 0.5 * base * height;
    }
}