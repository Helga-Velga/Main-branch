package Lesson_7_Install;
// арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение)
public class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return (double) a / b;
    }
}