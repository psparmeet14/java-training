package com.parmeet.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Sum of integers for the range from 0 to 100
        sumOfIntegersFrom0To100();
       // Remove the duplicates from the list
        removeDuplicatesFromList();
    }

    private static void sumOfIntegersFrom0To100() {
         /*
            Imperative style - HOW style of programming
         */
        var sum = 0;
        for (var i = 0; i <= 100; i++) {
            sum += i; // shared mutable state, it's sequential, it's not thread safe, issues if we run the code in multithreaded environment
        }
        System.out.println("Imperative Style - Sum of integers for the range from 0 to 100: " + sum);


        /*
            Declarative style - WHAT style of programming
         */
        var sum1 = IntStream.rangeClosed(0, 100)
                //.parallel() // parallel stream
                .sum();
        System.out.println("Declarative Style - Sum of integers for the range from 0 to 100: " + sum1);
    }

    private static void removeDuplicatesFromList() {
        var integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9);

        /*
            Imperative style - HOW style of programming
         */
        var uniqueList = new ArrayList<Integer>();
        for (var integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("Imperative Style - Unique List: " + uniqueList);

        /*
            Declarative style - WHAT style of programming
         */
        var uniqueList1 = integerList.stream()
                .distinct()
                .collect(toList());
        System.out.println("Declarative Style - Unique List: " + uniqueList1);
    }
}
