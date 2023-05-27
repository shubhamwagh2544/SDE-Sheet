package com.sdesheet.basicmaths;

import java.util.Scanner;

/*
Given a number N. Count the number of digits in N which evenly divides N.
Ex: N = 23 :> 0 ( both 2 & 3 do not divide 23 )
Ex: N = 12 :> 2 ( both 1 & 2 divides 12 evenly )
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countDigits(n);
    }

    private static void countDigits(int n) {
        int temp = n;
        int cnt = 0;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem != 0 && n % rem == 0) {
                cnt++;
            }
            temp = temp/10;
        }
        System.out.println(cnt);
    }
}
