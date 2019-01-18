package com.remoran.hackerrank.solution.introduction;

import java.util.Scanner;

public class Solution9StaticInitializerBlock {
    private static int B, H;
    private static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scan.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

