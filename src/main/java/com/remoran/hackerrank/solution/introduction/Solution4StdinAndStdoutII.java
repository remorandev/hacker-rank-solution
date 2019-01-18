package com.remoran.hackerrank.solution.introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution4StdinAndStdoutII {
    public static void main(String args[]) {
        option1();
        option2();
    }

    private static void option1(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    private static void option2(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(br.readLine());
            Double d = Double.parseDouble(br.readLine());
            String s = br.readLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
