package com.parmeet.java8.functionalInterfaces;

import com.parmeet.java8.data.Student;
import com.parmeet.java8.data.StudentDatabase;

import java.util.function.BiConsumer;
import java.util.List;

public class BiConsumerExample {

    public static void main(String[] args) {
        printNameAndActivities();

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("Hello", "World");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication: " + (a * b));
        BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println("Addition: " + (a + b));

        multiply.andThen(addition).accept(10, 5);
    }

    private static void printNameAndActivities() {
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> studentBiConsumer.accept(student.getName(), student.getActivities()));
    }
}
