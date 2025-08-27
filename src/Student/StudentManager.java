package Student;

import java.util.Set;

public class StudentManager {

    public static void removeLowPerformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) { if (student.getAverageGrade() >= 3.0) {
            student.incrementCoutse(); }
    }
        }
public static void printStudents(Set<Student> students, int course) {
    System.out.println("Студенты " + course + " курса:");
    for (Student student : students)
    { if (student.getCourse() == course) {
        System.out.println(student.getName()); }
    }
}
}