package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> geq3 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> gpaGeq39 = student -> student.getGpa()>=3.9;

    public static void filterStudentsByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Student grade level 3.0");
        studentList.forEach(student -> {
           if(geq3.test(student)){
               System.out.println(student.getName() + " grade level: " + student.getGradeLevel());
           }
        });
    }

    public static void filterStudentsByGpaLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Gpa level 3.9 : ");
        studentList.forEach(student -> {
            if(gpaGeq39.test(student)){
                System.out.println(student.getName() + " gpa level: " + student.getGpa());
            }
        });
    }

    public static void filterStudentsByGradeandGpa() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Student grade level 3.0 and GPA level 3.9");
        studentList.forEach(student -> {
            if(geq3.and(gpaGeq39).test(student)){
                System.out.println(student.getName() + " grade level: " + student.getGradeLevel()
                        + " gpa level: " + student.getGpa());
            }
        });
    }

    public static void filterStudentsByGradeOrGpa() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Student grade level 3.0 or GPA level 3.9");
        studentList.forEach(student -> {
            if(geq3.or(gpaGeq39).test(student)){
                System.out.println(student.getName() + " grade level: " + student.getGradeLevel()
                        + " gpa level: " + student.getGpa());
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpaLevel();
        filterStudentsByGradeandGpa();
        filterStudentsByGradeOrGpa();
    }
}
