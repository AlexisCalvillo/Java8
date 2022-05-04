package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(-3,(a,b)-> a*b); //new value-->b. result-->a
    }


    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> {
                    if(s1.getGpa()>s2.getGpa())
                        return s1;
                    else
                        return s2;
                });
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7,9);
        System.out.println(performMultiplication(integers));

        Optional<Student> studentOptional = getHighestGPAStudent();
        if(studentOptional.isPresent())
            System.out.println(studentOptional.get());
    }
}
