package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> gradeFilter = student -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaFilter = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpaLevel)-> gradeLevel>=3 && gpaLevel>=3.9;

    BiConsumer<String, List<String>> printNAA = (name, activities) -> System.out.println(name + " activities: " + activities);

    Consumer<Student> studentConsumer = (student -> {
        /*if(gradeFilter.and(gpaFilter).test(student))
            printNAA.accept(student.getName(),student.getActivities());

         */
        if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
            printNAA.accept(student.getName(),student.getActivities());

    });

    public void printNameAndActiviies(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActiviies(studentList);
    }

}
