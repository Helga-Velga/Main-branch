package Student;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Джонни", "A1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Гэнгста", "B2", 2, Arrays.asList(2, 2, 3)));
        students.add(new Student("Федор Уайт", "A1", 1, Arrays.asList(5, 5, 5)));
        students.add(new Student("Дикий лосось", "C3", 3, Arrays.asList(3, 3, 3)));

        System.out.println("До удаления и перевода:");
        students.forEach(System.out::println);
        StudentManager.removeLowPerformingStudents(students);
        StudentManager.promoteStudents(students);
        System.out.println("\nПосле удаления и перевода:"); students.forEach(System.out::println);

        System.out.println("\nВывод студентов 2 курса:"); StudentManager.printStudents(students, 2);
    }
}

