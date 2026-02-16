package problem4;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gb = new GradeBook(course);
        Scanner sc = new Scanner(System.in);

        Student[] students = {
            new Student("Student A", "1"),
            new Student("Student B", "4"),
            new Student("Student C", "12")
        };

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            double grade = sc.nextDouble();
            gb.addGrade(s, grade);
        }

        gb.displayGradeReport();
    }
}