package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String joiningV1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream<String>
                .collect(Collectors.joining());
    }

    public static String joiningV2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream<String>
                .collect(Collectors.joining(", "));
    }

    public static String joiningV3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream<String>
                .collect(Collectors.joining("-","Students: "," team"));
    }

    public static void main(String[] args) {
        System.out.println("Joining V1: " + joiningV1());
        System.out.println("Joining V2: " + joiningV2());
        System.out.println("Joining V2: " + joiningV3());
    }
}
