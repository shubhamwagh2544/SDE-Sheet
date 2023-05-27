package com.sdesheet.basicmaths;
/*
reverse the number
ex: 123 :> 321
 */
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));

    }

    public static int reverseNumber(int n) {
        int number = 0;
        int temp = n;
        int rem = 0;
        int k = countDigitsInNumber(temp);
        //System.out.println(k);
        while (temp != 0) {
            rem = temp % 10;
            number += rem * Math.pow(10, --k);
            temp = temp / 10;
        }
        return number;
    }

    private static int countDigitsInNumber(int temp) {
        int cnt = 0;
        while (temp != 0) {
            temp = temp/10;
            cnt++;
        }
        return cnt;
    }
}
