package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> geq3 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> geq3MR = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {

        System.out.println(geq3.test(StudentDataBase.studentSupplier.get()));

        System.out.println(geq3MR.test(StudentDataBase.studentSupplier.get()));

    }
}
