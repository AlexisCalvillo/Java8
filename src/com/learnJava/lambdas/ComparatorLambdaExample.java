package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {


        /**
         * prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of comparator is : " + comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> { return  a.compareTo(b);};

        System.out.println("Result of lambda comparator is : " + comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambdaWC = ( a, b) -> { return  a.compareTo(b);};

        System.out.println("Result of lambda comparator WC is : " + comparatorLambdaWC.compare(3,2));

    }
}
