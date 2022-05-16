package com.learnJava.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        //isPresent
        Optional<String> optional= Optional.ofNullable("Quiobole optional"); //Quiobole is like whats up in México
        System.out.println(optional.isPresent());
        if(optional.isPresent())
            System.out.println(optional.get());

        //ifPresent
        optional.ifPresent(s -> System.out.println(s));
    }

}
