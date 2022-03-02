package com.moshpackage;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
                                                                //Number of digits & Summ of all digits.
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a long number: ");
        long num = sc.nextLong();
        long num2 = num;
        long sum =0;

        while (num != 0) {
             num = num/10;
             ++count;
        }
        System.out.println("Number of digits = " +count);

        while (num2 != 0)
        {
            sum = sum + num2 % 10;
            num2 = num2/10;
        }
        System.out.println("Sum of all digits = " +sum);
    }
}
