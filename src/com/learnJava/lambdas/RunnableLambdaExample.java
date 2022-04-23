package com.learnJava.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda

        // ()->{};
        Runnable runnableLambda = ()->{
            System.out.println("Inside lambda runnable");
        };

        new Thread(runnableLambda).start();

        Runnable runnableL1L = () -> System.out.println("Inside lambda1L");

        new Thread(runnableL1L).start();

        new Thread(()->{
            System.out.println("Inside simplified lambda");
        }).start();


    }
}
