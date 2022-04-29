package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ComsumerMethodReferenceExample {

    /**
     * classname: methodName
     */
    static Consumer<Student> studPrnt = System.out::println;

    static Consumer<Student> studPrntActMR = Student::printListOfActivities; //Method reference print activities


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studPrnt);
        StudentDataBase.getAllStudents().forEach(studPrntActMR);
    }

}
