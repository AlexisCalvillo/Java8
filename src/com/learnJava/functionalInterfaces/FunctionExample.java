package com.learnJava.functionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = name -> name.toUpperCase();

    static Function<String, String> addSomeString = name -> name.toUpperCase().concat("Concat");

    public static void main(String[] args) {

        System.out.println(function.apply("a ver en mayúsculas"));

        System.out.println(function.andThen(addSomeString).apply("andThen"));

        System.out.println(function.compose(addSomeString).apply("compose"));
    }
}
