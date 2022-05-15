package com.learnJava.parallelstream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities= StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time sequential: " + (endTime-startTime));
        return studentActivities;

    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities= StudentDataBase.getAllStudents().stream() //Stream<Student>
                .parallel()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time parallel: " + (endTime-startTime));
        return studentActivities;

    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
        
    }

}
