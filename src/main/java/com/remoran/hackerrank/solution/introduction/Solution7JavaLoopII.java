package com.remoran.hackerrank.solution.introduction;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution7JavaLoopII {
    public static void main(String[] args) {
        option1();
        option2();
    }

    private static void option1() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                int r = 0;
                for (int z = 0; z <= j; z++) {
                    r += Math.pow(2, z) * b;
                }
                System.out.print(a + r + " ");
            }
            System.out.println();

        }
        in.close();
    }

    private static void option2() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            int a, b, n;
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int series = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    series = series + a + ((int) Math.pow(2, j)) * b;
                else
                    series = series + ((int) Math.pow(2, j)) * b;
                System.out.print(series + " ");
            }
            System.out.println();
        }
    }
}
