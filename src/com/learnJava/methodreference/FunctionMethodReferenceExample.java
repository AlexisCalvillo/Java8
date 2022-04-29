package com.learnJava.methodreference;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {

    //Lambda
    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
    //Method Reference
    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    //Lambda
    static UnaryOperator<String> unaryLambdaUpperCase = s -> s.toUpperCase();
    //Method Reference
    static UnaryOperator<String> unaryLambdaUpperMethod = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("To upper case LaMdA"));
        System.out.println(toUpperCaseMethodReference.apply("To upper case mETHOoD RefeREncE"));

        System.out.println(unaryLambdaUpperCase.apply("To upper case LaMdA Unary"));
        System.out.println(unaryLambdaUpperMethod.apply("To upper case mETHOoD RefeREncE Unary"));
    }
}
