package com.moshpackage;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
                                                    //Write a Java program to find the number of days in a month.
        int month;
        Scanner sc=  new Scanner(System.in);

        System.out.print("Month Number : ");
        month = sc.nextInt();
        System.out.print("Input Year : ");
        int year = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
        {
            System.out.println("31 Days");
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 )
        {
            System.out.println("30 Days");
        }
        else if ( month == 2 )
        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("29 Days");
            } else {
                System.out.println("28 Days");

            }
        }
    }
}
