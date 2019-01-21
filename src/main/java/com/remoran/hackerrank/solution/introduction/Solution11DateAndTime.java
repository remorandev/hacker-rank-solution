package com.remoran.hackerrank.solution.introduction;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;

public class Solution11DateAndTime {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    //Opcion Java 8
    public static String findDay(int month, int day, int year) {
        LocalDate lc = LocalDate.of(year, month, day);
        return lc.getDayOfWeek().toString();
    }


    public static void main(String[] args) throws IOException {
        System.out.println(findDay(8,5, 2015));
    }
}

