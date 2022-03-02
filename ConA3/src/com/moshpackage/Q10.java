package com.moshpackage;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
                                                                                 //Pascals Triangle
        System.out.print("Enter Number of Rows : ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int spc, num;
        for(int i=0; i<row; i++)
        {
            for(spc=row; spc>i; spc--)
            {
                System.out.print(" ");
            }
            num=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num = num*(i-j)/(j+1);
            }
            System.out.println("");
        }
    }
}
