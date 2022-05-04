package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMinMaxExample {

    public static int findMax(List<Integer> integerList){
        return integerList.stream().reduce(Integer.MIN_VALUE0,Integer::max);
    }

    public static int findMin(List<Integer> integerList){
        return integerList.stream().reduce(Integer.MAX_VALUE,Integer::min);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        System.out.println("Max. Value: " + findMax(integerList));
        System.out.println("Min. Value: " + findMin(integerList));

    }
}
