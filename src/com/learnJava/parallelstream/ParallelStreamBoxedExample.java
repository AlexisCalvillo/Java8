package com.learnJava.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {


    public static int sequentialSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.stream().reduce(0,(x,y)-> x+y);
        long duration = System.currentTimeMillis() - startTime;

        System.out.println("Execution time sequential: " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.parallelStream()
                .reduce(0,(x,y)-> x+y); //perform the unboxing from Integer to int
        long duration = System.currentTimeMillis() - startTime;

        System.out.println("Execution time parallel: " + duration);
        return sum;
    }


    public static void main(String[] args) {
        List<Integer> integersList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integersList);
        parallelSum(integersList);

    }
}
