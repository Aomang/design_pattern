package Prototype;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        // Clone teacher
        Teacher teacher = new Teacher("Sean", "Creational Design Patterns in Java.");
        Teacher teacherClone = (Teacher) teacher.clone();
        System.out.println(MessageFormat.format(
                "Teacher was cloned: {0} who teaches {1}",
                teacherClone.getName(), teacher.getCourse()));

        // Clone student
        Student student = new Student("James", teacherClone);
        Student studentClone = (Student) student.clone();
        System.out.println(MessageFormat.format(
                "Student was cloned: {0} that is enrolled in {1}''s course",
                studentClone.getName(), student.getTeacher().getName()));

        // Change teacher name
        teacherClone.setName("John");
        System.out.println(MessageFormat.format(
                "Student was cloned: {0} that is enrolled in {1}''s course",
                studentClone.getName(), student.getTeacher().getName()));
    }
}
