package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y)-> x+y); // Unboxig to convert the Integer to int
    }

    public static int sumOfNNumbersIntStream(int min, int max){
        return IntStream.range(min,max).sum();
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of N numbers: "+ sumOfNumbers(integerList));
        System.out.println("Sum of N numbers (IntStream)" + sumOfNNumbersIntStream(1,6));
    }
}
