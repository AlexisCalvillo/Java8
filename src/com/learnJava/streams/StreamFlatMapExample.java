package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities(){
        List<String> studentActivities=StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;

    }

    public static long getStudentActivitiesCount(){
        long studentNumberActivities=StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
        return studentNumberActivities;

    }


    public static void main(String[] args) {
        System.out.println("Number of activities: " + getStudentActivitiesCount());
        System.out.println(printStudentActivities());
    }

}
