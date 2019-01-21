package com.remoran.hackerrank.solution.strings;

public class Solucion1StringsIntroduction {
    public static void main(String[] args) {

        String A= "hello";
        String B= "java";

        System.out.println(A.length() + B.length());

        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");

        A = A.replaceFirst("\\w", A.substring(0,1).toUpperCase());
        B = B.replaceFirst("\\w", B.substring(0,1).toUpperCase());

        System.out.println(A + " " + B);
    }
}
