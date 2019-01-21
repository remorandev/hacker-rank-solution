package com.remoran.hackerrank.solution.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution12CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = nfUS.format(payment);
        String india = nfIndia.format(payment);
        String china = nfChina.format(payment);
        String france = nfFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
