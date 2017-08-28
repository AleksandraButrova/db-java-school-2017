package com.db.data_time_practice;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTime jTime1 = new DateTime();
        DateTime jTime2 = new DateTime();

        jTime1 = jTime1.withYear(1993).withMonthOfYear(12).withDayOfMonth(27).withTime(0,0, 0, 0);
        jTime2 = jTime1.withYear(1996).withMonthOfYear(2).withDayOfMonth(4).withTime(0,0, 0, 0);


        //System.out.println(jTime2.minusYears(jTime1.getYear()).minusMonths(jTime1.getMonthOfYear()).minusDays(jTime1.getDayOfMonth()));


        LocalDateTime lTime1 = new LocalDateTime();
        LocalDateTime lTime2 = new LocalDateTime();

        lTime1 = lTime1.withYear(1993).withMonthOfYear(12).withDayOfMonth(27).withTime(0,0, 0, 0);
        lTime2 = lTime2.withYear(1996).withMonthOfYear(2).withDayOfMonth(4).withTime(0,0, 0, 0);

        //System.out.println(lTime2.minusYears(lTime1.getYear()).minusMonths(jTime1.getMonthOfYear()).minusDays(jTime1.getDayOfMonth()));

        //System.out.println(JodaVsJava8.timeLibDiff(jTime1, lTime1));


        Date oldDate = new Date();
        LocalDateTime jsr310Date = new LocalDateTime();
        DateTime jodaDate = new DateTime();
        String dateString = jsr310Date.toString();

        JodaVsJava8.max(oldDate, jsr310Date, jodaDate, dateString);
    }
}