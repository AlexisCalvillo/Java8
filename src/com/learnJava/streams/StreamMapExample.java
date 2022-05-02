package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static List<String> namesList(){
        List<String> studentList =StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input --> Student name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return studentList;
    }

    public static Set<String> namesSet(){
        Set<String> studentList =StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input --> Student name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        return studentList;
    }

    public static void main(String[] args) {

        System.out.println(namesList());
    }
}
