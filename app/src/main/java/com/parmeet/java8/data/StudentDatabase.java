package com.parmeet.java8.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        var student1 = new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        var student2 = new Student("Jenny",2,3.8,"female", 11, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        var student3 = new Student("Emily",3,4.0,"female", 12, Arrays.asList("swimming", "gymnastics","aerobics"));
        var student4 = new Student("Dave",3,4.0,"male", 15, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        var student5 = new Student("Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"));
        var student6 = new Student("James",4,3.9,"male", 22, Arrays.asList("swimming", "basketball","baseball","football"));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
