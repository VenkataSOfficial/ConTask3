package com.moshpackage;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

                                                                            //right-angle triangle
        System.out.print("Enter Number of Rows for the right angle triangle : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
