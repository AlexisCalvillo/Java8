package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> mod2 = a -> a%2==0;
    static Predicate<Integer> mod5 = a -> a%5==0;
    public static void predicateAnd() {
        System.out.println("Number 20 is divisible by 2 and 5:"+ mod2.and(mod5).test(20));
        System.out.println("Number 15 is divisible by 2 and 5:"+ mod2.and(mod5).test(15));
    }

    public static void predicateOr() {
        System.out.println("Number 2 is divisible by 2 Or 5:"+ mod2.or(mod5).test(2));
        System.out.println("Number 5 is divisible by 2 Or 5:"+ mod2.or(mod5).test(5));
        System.out.println("Number 10 is divisible by 2 Or 5:"+ mod2.or(mod5).test(10));
        System.out.println("Number 3 is divisible by 2 Or 5:"+ mod2.or(mod5).test(3));
    }

    public static void predicateNegate() {
        System.out.println("Number 13 is not divisible by 2 and 5:"+ mod2.and(mod5).negate().test(13));
        System.out.println("Number 10 is not divisible by 2 and 5:"+ mod2.and(mod5).negate().test(10));
    }

    public static void main(String[] args) {
        System.out.println("Number 0 is even number: " + mod2.test(0));
        predicateAnd();
        predicateNegate();
        predicateOr();
    }
}
