package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudentByGpa(){
        return StudentDataBase.getAllStudents().stream().filter((student -> student.getGpa()>=3.9)).
                collect(Collectors.toList());
    }

    public static List<Student> filterStudentByGrade(){
        return StudentDataBase.getAllStudents().stream().filter((student -> student.getGpa()>=4))
                .filter(student -> student.getGender().equals("female")).
                collect(Collectors.toList());
    }

    public static List<Student> femaleStudents(){
        return StudentDataBase.getAllStudents().stream().filter((student -> student.getGender().equals("female"))).
                collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Gpa 3.9");
        filterStudentByGpa().forEach(System.out::println);


        System.out.println("Grade 2.0 and female");
        filterStudentByGrade().forEach(System.out::println);


        System.out.println("Female students");
        femaleStudents().forEach(System.out::println);

    }
}
