package com.moshpackage;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
                                                                        //Leap Year or not
        Scanner sc=  new Scanner(System.in);
        System.out.print("Input Year : ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
               // int number_Of_DaysInMonth = 29;
                System.out.println("It is a Leap Year");
            } else {
               // int number_Of_DaysInMonth = 28;
            System.out.println("It is not a Leap Year");

            }
    }
}
