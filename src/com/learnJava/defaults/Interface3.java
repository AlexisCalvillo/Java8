package com.learnJava.defaults;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("Inside Method C");
    }

    @Override
    default void methodA() {
        System.out.println("Inside interface 3 method A" + Interface3.class);
    }

    @Override
    default void methodB() {
        System.out.println("Inside interface 3 method B" + Interface3.class);
    }


}
