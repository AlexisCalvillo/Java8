package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {


    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () ->{
            return new Student("Alexis",4,4.1,"M", Arrays.asList("swimming", "basketball"));
        };

        System.out.println("Student is: " + studentSupplier.get());

        Supplier<List<Student >> listSupplier = ()->{
            return StudentDataBase.getAllStudents();
        };


        System.out.println("Students are:");
        listSupplier.get().forEach(student -> System.out.println(student));

    }
}
