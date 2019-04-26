package com.remoran.hackerrank.solution.string;

public class Solution3SubstringComparisons {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        int iteration = s.length()-(k-1);

        String[] array = new String[iteration];
        for (int i = 0; i < iteration; i++) {
            array[i] = s.substring(i, i + k);
        }
        java.util.Arrays.sort(array);

        System.out.println(array[0] + "\n" + array[iteration-1]);
    }
}
