package com.moshpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                                                            //Print Multiplication Table
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number");
        int num = in.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
        }

    }
}
