package com.parmeet.java8.functionalInterfaces;

import com.parmeet.java8.data.Student;
import com.parmeet.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = i -> i % 2 == 0;
    static Predicate<Integer> p2 = i -> i % 5 == 0;

    static Predicate<Student> sPredicate1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> sPredicate2 = s -> s.getGpa() >= 3.9;

    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p.test(5));

        predicateAnd();
        predicateOr();
        predicateNegate();

        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudentsByGradleLevelAndGpa();
    }

    public static void filterStudentsByGradleLevelAndGpa() {
        System.out.println("filterStudentsByGradleLevelAndGpa: ");
        var allStudents = StudentDatabase.getAllStudents();
        allStudents.forEach(student -> {
            if (sPredicate1.and(sPredicate2).test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel: ");
        var allStudents = StudentDatabase.getAllStudents();
        allStudents.forEach(student -> {
            if (sPredicate1.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa: ");
        var allStudents = StudentDatabase.getAllStudents();
        allStudents.forEach(student -> {
            if (sPredicate2.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void predicateNegate() {
        System.out.println("predicateNegate: ");
        System.out.println(p.or(p2).negate().test(10));
        System.out.println(p.or(p2).negate().test(8));
    }

    private static void predicateOr() {
        System.out.println("predicateOr: ");
        System.out.println(p.or(p2).test(10));
        System.out.println(p.or(p2).test(8));
    }

    public static void predicateAnd() {
        System.out.println("predicateAnd: ");
        System.out.println(p.and(p2).test(10));
        System.out.println(p.and(p2).test(9));
    }
}
