package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import com.learnJava.functionalInterfaces.PredicateStudentExample;
import com.learnJava.methodreference.RefactorMethodReferenceExample;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> gpa3 = student -> student.getGpa()>=3.9;
    static Predicate<Student> geq3MR = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static void main(String[] args) {

        //Student namme and there activities in a map
        Map<String, List<String>> studentMap= StudentDataBase.getAllStudents().stream()
                /*.peek((student) -> {
                    System.out.println(student);
                })/*/
                .filter(gpa3)
                .peek((student) -> {
                    System.out.println(student);
                })//
                .filter(geq3MR)//.filter(RefactorMethodReferenceExample::greaterThanGradeLevel)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);
    }
}
