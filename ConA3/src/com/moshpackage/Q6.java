package com.moshpackage;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
                                                         //Check if Increasing or decreasing order
        int num;
        boolean flag = false;
        boolean flag2 = false;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = scanner.nextInt();
        int num2 = num;


        while(num>0){
            int cd = num % 10;
            num = num/10;
            if(cd <= num % 10){
                flag = true;
                break;
            }

            cd = num % 10;
            num = num/10;
        }
        if(!flag){
            System.out.println("Digits are in increasing order.");
        }

        while(num2>0){
            int cd2 = num2 % 10;
            num2 = num2/10;
            if(cd2 >= num2 % 10){
                flag2 = true;
                break;
            }

            cd2 = num2 % 10;
            num2 = num2/10;
        }
        if(flag2){
            System.out.println("Digits are in Decreasing order.");
        }
        else{
            System.out.println("Digits are in neither Ascending nor Descending Order");
        }
    }
}
