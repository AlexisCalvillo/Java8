package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAny(Double gpa){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=gpa).findAny();
    }

    public static Optional<Student> findFirst(Double gpa){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=gpa).findAny();
    }

    public static void main(String[] args) {
        Double gpa = 3.9;
        Optional<Student> findAny = findAny(gpa);
        Optional<Student> findFirst = findFirst(gpa);
        if(findAny.isPresent())
            System.out.println("Result of find any: " + findAny(gpa));
        else
            System.out.println("Student not found!");
        if(findFirst.isPresent())
            System.out.println("Result of find first: " + findFirst(gpa));
        else
            System.out.println("Student not found");
    }
}
