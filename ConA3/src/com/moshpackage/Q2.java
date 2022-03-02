package com.moshpackage;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
                                                                //Take 10 inputs and sum it.
        int total = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("Enther Number " + i);
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            total = total + num;
        }
        System.out.println("Total = " +total);
    }
}
