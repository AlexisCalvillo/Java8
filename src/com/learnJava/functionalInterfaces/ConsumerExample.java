package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studName = (student -> System.out.print(student.getName()));
    static Consumer<Student> actName = (student -> System.out.println(student.getActivities()));
    static Consumer<Student> printN = student -> System.out.println(student);

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(printN);
    }

    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studName.andThen(actName));
    }

    public static void printNameAndActivitiesUsingCondition() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()>=3){
                studName.andThen(actName).accept(student);
            }
        });

    }

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());

        c1.accept("example");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
