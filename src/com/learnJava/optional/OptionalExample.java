package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null)
            return student.getName();
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        if(student.isPresent()) {
            student.get();
            return student.map(Student::getName);
        }
        return Optional.empty(); //Represents an optional object with not value

    }

    public static void main(String[] args) {

        /*
        String name = getStudentName();
        if(name!=null)
            System.out.println("Length of the student name: " +   name.length());
        else
            System.out.println("Student not found");
         */

        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println("The lenght of the student name: " + stringOptional.get().length());
        }

    }
}
