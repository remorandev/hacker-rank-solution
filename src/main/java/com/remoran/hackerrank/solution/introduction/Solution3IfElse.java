package com.remoran.hackerrank.solution.introduction;

public class Solution3IfElse {
    public static void main(String[] args) {
        int N = 1;
        for (int i = 0; i <= 100; i++) {
            N = i;
            if ((N % 2) == 0) {
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Weird");
            }
        }
    }
}
