package com.learnJava.dates;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("localDate : " + localDate);

        LocalDate birthday = LocalDate.of(1997,07,31);
        System.out.println("Birthday : " + birthday);

        LocalDate day189 = LocalDate.ofYearDay(2017,189);
        System.out.println("Day 189 of 2017 was : " + day189 );

        /**
         *  Get values from localDate
         */

        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());

        System.out.println("Day of Month using get: " + localDate.get(ChronoField.DAY_OF_MONTH));


        /**
         * Modifying localdate
         */

        System.out.println(localDate.plusDays(365));
        System.out.println(localDate.plusMonths(365));
        System.out.println(localDate.plusYears(-4));
        System.out.println(localDate.minusYears(-4));
        System.out.println(localDate.withYear(2019));
    }
}
