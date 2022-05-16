package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable("Hao");
        //Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("Hao"); //Always expect send the value
        return stringOptional;
    }

    public static Optional<String> empty(){
        Optional<String> stringOptional = Optional.empty(); //Always expect send the value
        return stringOptional;
    }

    public static void main(String[] args) {

        System.out.println(ofNullable());
        //System.out.println(ofNullable().get()); //Access to the value

        System.out.println(of());
        //System.out.println(of().get()); //Access to the value

        System.out.println(empty());
    }
}
