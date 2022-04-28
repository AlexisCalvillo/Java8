package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiComsumerExample {


    public static void nameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> biConsumer = (name,activities) ->{
            System.out.println(name + ": " + activities);
        };

        studentList.forEach((student -> {biConsumer.accept(student.getName(),student.getActivities());}));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) ->{
            System.out.println("a: "+ a + " b: " + b);
        };

        biConsumer.accept("ver", "al cine");

        BiConsumer<Double, Double> biProduct = (a,b) ->{
            System.out.println("a*b: "+(a*b));
        };
        BiConsumer<Double, Double> biDivision = (a,b) ->{
            System.out.println("a/b: "+(a/b));
        };

        biProduct.andThen(biDivision).accept(10.0,2.5);

        nameAndActivities();
    }
}
