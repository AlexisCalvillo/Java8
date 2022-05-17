package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DeaultMethodsExample2 {

    static Consumer<Student> studentConsumer = student -> {
        System.out.println(student);
    };
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> nameComparatorNulls = Comparator.nullsLast(nameComparator);
    public static void sortByName(List<Student> studentList){
        studentList.sort(nameComparator);
    }

    public static void sortByGpa(List<Student> studentList){
        studentList.sort(gpaComparator);
    }

    public static void comparatorChaining(List<Student> studentList){
        studentList.sort(gradeComparator.thenComparing(nameComparator));
    }

    public static void sorthWithNullValues(List<Student> students){
        students.sort(nameComparatorNulls);
    }

    public static void main(String[] args) {
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //System.out.println(studentList);
        studentList.forEach(studentConsumer);

        /*
        System.out.println("Before sort: ");
        studentList.forEach(studentConsumer);
        sortByName(studentList);
        System.out.println("After sort by name: ");
        studentList.forEach(studentConsumer);

        sortByGpa(studentList);
        System.out.println("After sort by gpa: ");
        studentList.forEach(studentConsumer);


        comparatorChaining(studentList);
        System.out.println("After chaining comparators: ");
        studentList.forEach(studentConsumer);
        */
        sorthWithNullValues(studentList);
        System.out.println("After sort w nulls: ");
        studentList.forEach(studentConsumer);
    }

}
