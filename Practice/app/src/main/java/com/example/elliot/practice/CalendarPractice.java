package com.example.elliot.practice;

/**
 * Created by elliot on 8/9/18.
 */

import java.util.*;
public class CalendarPractice {
    public static void main(String[] args)
    {
        int year = 2016;
        int month = 0; // January
        int date = 1;

        Calendar cal = Calendar.getInstance();
        // Sets the given calendar field value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();
    }
}