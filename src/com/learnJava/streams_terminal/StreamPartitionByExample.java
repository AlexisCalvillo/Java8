package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitionByExample {

    public static void partitionByV1(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println("PartitioningMap: " + partitioningMap);
    }

    public static void partitionByV2(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));
        System.out.println("PartitioningMapV2: " + partitioningMap);
    }

    public static void main(String[] args) {
        //partitionByV1();
        partitionByV2();
    }
}
