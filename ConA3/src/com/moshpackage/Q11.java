package com.moshpackage;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
                                                     //Check if two numbers are same upto two decimal places.******
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();

        if ((num1 - num2) < (0.01)) {
            System.out.println("The numbers are the same upto two decimal places.");
        }
        else {
            System.out.println("The numbers are different.");
        }
    }
}
