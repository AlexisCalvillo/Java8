package com.learnJava.numericstreams;


import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();

        System.out.println("Sum: " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(0,0).max();

        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : "NA");

        OptionalLong optionalLong = LongStream.rangeClosed(-16,100).min();

        System.out.println(optionalLong.isPresent() ? "Min value is: " + optionalLong.getAsLong() : "NA");

        OptionalDouble optionalDouble = LongStream.rangeClosed(-25,25).average();

        System.out.println(optionalDouble.isPresent() ? "Average is : " + optionalDouble.getAsDouble() : "NA");
        
    }
}
