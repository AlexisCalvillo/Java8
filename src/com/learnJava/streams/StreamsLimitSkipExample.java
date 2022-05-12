package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream().skip(2).reduce((x,y) -> x+y);
    }

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream().limit(2).reduce((x,y) -> x+y);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        if(skip(integers).isPresent()){
            System.out.println("Sum skip first 2: " + skip(integers).get());
        }
        if(limit(integers).isPresent()){
            System.out.println("Sum limit first 2: " + limit(integers).get());
        }
    }
}
