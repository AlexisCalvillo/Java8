package com.learnJava.defaults;

public interface Interface2 extends Interface1{
    default void methodB(){
        System.out.println("Inside Method B");
    }

    @Override
    default void methodA() {
        System.out.println("Inside interface 2 method A" + Interface2.class);
    }
}
