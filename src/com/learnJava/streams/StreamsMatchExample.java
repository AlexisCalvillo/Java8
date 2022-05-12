package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsMatchExample {

    public static boolean allMatch(Double gpa){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=gpa);
    }

    public static boolean anyMatch(Double gpa){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=gpa);
    }

    public static boolean noneMatch(Double gpa){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=gpa);
    }

    public static void main(String[] args) {
        Double gpa = 3.9;
        System.out.println("Result all  match GPA >="+ gpa+" : " + allMatch(gpa));
        System.out.println("Result any  match GPA >="+ gpa+" : " + anyMatch(gpa));
        System.out.println("Result none match GPA >="+ gpa+" : " + noneMatch(gpa));


    }


}
