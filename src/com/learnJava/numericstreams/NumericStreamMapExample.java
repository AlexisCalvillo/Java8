package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,15).mapToObj((i) ->{
                return new Integer(8);
        }).collect(toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,15)
                .mapToLong( i -> i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(2,16).mapToDouble(i -> {
            return (double) (i+1)/(i+2);
        })
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj: " + mapToObj());
        System.out.println("mapToLong " + mapToLong());
        System.out.println("mapToDouble " + mapToDouble());
    }
}
