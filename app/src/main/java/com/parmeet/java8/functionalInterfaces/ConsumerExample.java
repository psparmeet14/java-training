package com.parmeet.java8.functionalInterfaces;

import com.parmeet.java8.data.Student;
import com.parmeet.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = s -> System.out.println(s);
    static Consumer<Student> c2 = s -> System.out.println(s.getName());
    static Consumer<Student> c3 = s -> System.out.println(s.getActivities());
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Hello World");

        printName();
        printNameAndActivities();
        printNameAndActivitesUsingCondition();
    }

    private static void printName() {
        System.out.println("printName: ");
        var allStudents = StudentDatabase.getAllStudents();
        allStudents.forEach(c1);
    }

    private static void printNameAndActivities() {
        System.out.println("printNameAndActivities: ");
        var students = StudentDatabase.getAllStudents();
        students.forEach(c2.andThen(c3)); // consumer chaining
    }

    private static void printNameAndActivitesUsingCondition() {
        System.out.println("printNameAndActivitesUsingCondition: ");
        var students = StudentDatabase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c2.andThen(c3).accept(student);
            }
        });
    }
}
