package com.remoran.hackerrank.solution.string;

public class Solution1StringsIntroduction {
    public static void main(String[] args) {

        String A= "hello";
        String B= "java";

        System.out.println(A.length() + B.length());

        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");

        A = A.replaceFirst(A.substring(0,1).toUpperCase(), A.substring(0,1).toUpperCase());
        B = B.replaceFirst(B.substring(0,1).toUpperCase(), B.substring(0,1).toUpperCase());

        System.out.println(A + " " + B);
    }
}
