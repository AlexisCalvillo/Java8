package com.learnJava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Local time : " + localTime);

        LocalTime localTime1 = LocalTime.of(11,11);
        System.out.println("Local time 1 : " + localTime1);

        LocalTime localTime2 = LocalTime.of(11,11,59);
        System.out.println("Local time 2 : " + localTime2);

        LocalTime localTime3 = LocalTime.of(11,11,47,100);
        System.out.println("Local time 3 : " + localTime3);


        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minute: " + localTime.getMinute());
        System.out.println("Second: " + localTime.getSecond());

        System.out.println("CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());

        /**
         * Modify values of LocalTime
         */

        System.out.println("minusHours : " + localTime.minusHours(5));
        System.out.println("minusMinutes : " + localTime.minusMinutes(180));
        System.out.println("minues: " + localTime.minus(17, ChronoUnit.HOURS));

    }
}
