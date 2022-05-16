package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);

        String name = student.map(Student::getName).orElse("NA");
        return name;
    }

    //orElseGet

    public static String optionalOrElseGet(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String name = student.map(Student::getName).orElseGet(()->"NA");

        return name;
    }
    //orElseThrow
    public static String optionalOrElseThrow(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String name = student.map(Student::getName).orElseThrow(()->new NullPointerException("There no exist the student"));

        return name;

    }

    public static void main(String[] args) {

        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}
