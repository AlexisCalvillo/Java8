package com.learnJava.defaults;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list = IntStream.rangeClosed(1,15).boxed().collect(Collectors.toList());
        System.out.println("Result is: " + multiplier.multiply(list));
        System.out.println("Number of elements: " + multiplier.size(list));
        System.out.println(Multiplier.isEmpty(list) ? "Is not empty" : "is empty");
    }
}
