package com.remoran.hackerrank.solution.introduction;

import java.util.Scanner;

public class Solution5OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d \n", s1, x);
        }
        System.out.println("================================");

    }
}