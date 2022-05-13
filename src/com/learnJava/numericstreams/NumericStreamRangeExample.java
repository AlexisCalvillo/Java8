package com.learnJava.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {
        int n = 1;
        int m = 60;
        IntStream intStream = IntStream.range(1,60); //An intstream for m-n-1 elements from n to m-1
        intStream.forEach( value -> System.out.println(value + ", ")); //An intstream closed, i.e. from n to m

        /*Double does not have the range method, this next methods convert the integers
        generated to double value*/
        IntStream.range(n,m).asDoubleStream().forEach(number -> System.out.println(number));


    }
}
