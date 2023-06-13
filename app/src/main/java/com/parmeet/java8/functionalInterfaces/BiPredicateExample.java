package com.parmeet.java8.functionalInterfaces;

import com.parmeet.java8.data.Student;
import com.parmeet.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
    Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    Consumer<Student> studentConsumer = s -> {
        if (biPredicate.test(s.getGradeLevel(), s.getGpa())) {
            studentBiConsumer.accept(s.getName(), s.getActivities());
        }
    };

    public void printNameAndActivities() {
        var students = StudentDatabase.getAllStudents();
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new BiPredicateExample().printNameAndActivities();
    }
}
