package com.learnJava.parallelstream;


import java.util.stream.IntStream;

public class SumClient {


    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);
        //Every time the result is diferente because of the concurrent access to total variable.
        //This problem is called as "race condition"
        System.out.println(sum.getTotal());


    }
}
