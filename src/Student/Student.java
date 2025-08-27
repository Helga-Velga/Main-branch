package Student;

//Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
// Создайте коллекцию, содержащую объекты класса Student. Следует написать метод, который удаляет студентов со средним
// баллом < 3, а также отдельный метод, который переводит студента на следующий курс, если средний балл >= 3.
// Напишите метод printStudents(Set<Student> students, int course), который получает список студентов и номер курса.
// Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public double getAverageGrade(){
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
    public void incrementCoutse(){
        this.course++;
    }
    @Override
    public String toString(){
        return name + " (группа: " + group + ", курс: " + course + ", ср.балл: " + getAverageGrade() + ")";
    }}

