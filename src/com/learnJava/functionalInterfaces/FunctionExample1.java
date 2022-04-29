package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;

import java.util.function.Function;

public class FunctionExample1 {


    public static String permormConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = permormConcat("Hi ");

        System.out.println(result);

    }
}
