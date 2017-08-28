package com.db.data_time_practice;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import java.util.Date;

public class JodaVsJava8 {
    public static String timeLibDiff(DateTime jTime, LocalDateTime lTime){
        String str = jTime.toString() + "\n" + lTime.toString();
        System.out.println(str);
        DateTime dt = jTime.minusYears(lTime.getYear() - 1).minusMonths(lTime.getMonthOfYear() - 1).minusDays(lTime.getDayOfMonth() - 1);
        return dt.toString();
    }

    private static String parseStr(String str){
        String hh = str.substring(11, 13);
        String s = str.substring(8, 10) + " " + str.substring(5, 7) + " " + str.substring(0, 4) + " " + (hh == "00"? "23" : Integer.toString(Integer.parseInt(hh) - 1)) + str.substring(13, 19);

        return s;
    }

    public static String max(Date oldDate, LocalDateTime jsr310Date, DateTime jodaDate, String dateString){

        dateString = dateString.replace("-", " ").replace("T", " ");

        System.out.println("Date = " + oldDate.toLocaleString());
        System.out.println("LocalDateTime = " + jsr310Date.withHourOfDay(jsr310Date.getHourOfDay() -1 ).toString("dd.MM.yyyy hh:mm:ss"));
        System.out.println("DateTime = " + jodaDate.withHourOfDay(jodaDate.getHourOfDay() - 1).toString("dd.MM.yyyy hh:mm:ss"));
        System.out.println("String = " + parseStr(dateString));


        return null;
    }
}