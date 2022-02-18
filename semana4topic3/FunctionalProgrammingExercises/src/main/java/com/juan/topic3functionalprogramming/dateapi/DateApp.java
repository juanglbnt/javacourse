package com.juan.topic3functionalprogramming.dateapi;

import java.time.*;
import java.util.Calendar;

public class DateApp {

    public static void main(String[] args) {
        DateApp dateApp = new DateApp();
        //dateApp.check(7);
        //dateApp.check(8);

        /*try {

            dateApp.measureTime(7);
            System.out.println();
            dateApp.measureTime(8);

        } catch (Exception e){

        }*/

        dateApp.periodBetweenYears();

    }

    public void check(int version) {

        if (version == 7) {

            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
            date1.set(1991, 03, 12);
            System.out.println(date1.after(date2));

        } else if (version == 8) {

            LocalDate date1 = LocalDate.of(1991, 03, 12);
            LocalDate date2 = LocalDate.now();
            System.out.println(date1.isAfter(date2));
            System.out.println(date1.isBefore(date2));

            LocalDateTime time1 = LocalDateTime.of(1993, 1, 21, 22, 30, 50);
            LocalDateTime time2 = LocalDateTime.of(1993, 1, 21, 22, 30, 54);
            System.out.println(time1.isAfter(time2));
            System.out.println(time1.isBefore(time2));
        }
    }

    public void measureTime(int version) throws InterruptedException{

        if (version == 7) {

            Long init = System.currentTimeMillis();
            Thread.sleep(1000);
            Long end = System.currentTimeMillis();
            System.out.println(end - init);

        } else if (version == 8){
            Instant init = Instant.now();
            Thread.sleep(1000);
            Instant end = Instant.now();
            System.out.println(Duration.between(init, end));
        }

    }

    public void periodBetweenYears() {
        LocalDate born = LocalDate.of(1995, 2, 8);
        LocalDate today = LocalDate.now();
        Period period = Period.between(born, today);
        System.out.println(period);
    }

}
