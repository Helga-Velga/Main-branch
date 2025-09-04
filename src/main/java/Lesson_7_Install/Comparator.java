package Lesson_7_Install;
//сравнивнить  два целых числа
public class Comparator {
    public static int compareNumbers(int a, int b) {
        if (a < b) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return 0;
        }
    }
}