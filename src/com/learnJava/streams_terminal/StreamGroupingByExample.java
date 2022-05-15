package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void groupStudentsByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void groupStudentsByGpa(){
         Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                 .stream().collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding":"Average"));

        System.out.println(studentMap);
    }

    public static void twoLevelGroupingV1(){
        Map<Integer, Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.groupingBy(Student::getGradeLevel,
                Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(studentMap);
    }

    public static void twoLevelGroupingV2(){
        Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> stutendLinkHashedmap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

        System.out.println(stutendLinkHashedmap);
    }


    public static void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);
    }

    public static void calculateTopGpaWithoutOptional(){
        Map<Integer,Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa))
                        ,Optional::get)));

        System.out.println(studentMapOptional);
    }

    public static void calculateLeastGpa(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);
    }


    public static void main(String[] args) {

        //groupStudentsByGender();
        //groupStudentsByGpa();
        //twoLevelGroupingV1();
        //twoLevelGroupingV2();
        //threeArgumentGroupBy();
        //calculateTopGpaWithoutOptional();
        calculateLeastGpa();

    }
}
