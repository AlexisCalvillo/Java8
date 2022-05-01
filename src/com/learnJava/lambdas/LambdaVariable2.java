package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    //static int value = 4; //local variable
    public static void main(String[] args) {
        int value = 4; //local variable

        Consumer<Integer> c1 = (i -> {
            //value=7;
            System.out.println(value+i);
        });

        //value=7;

        c1.accept(6);

    }
}
