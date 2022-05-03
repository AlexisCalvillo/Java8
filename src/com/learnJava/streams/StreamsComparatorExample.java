package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }

    public static List<Student> sortStudentByGpaReversed() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println("Sorted by name: ");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Sorted by Gpa: ");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("Sorted by Gpa reversed: ");
        sortStudentByGpaReversed().forEach(System.out::println);

    }
}
