package com.sdesheet.basicmaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        isPalindrome(number);   //number

        String s = String.valueOf(number);
        StringBuilder str = new StringBuilder(s);
        String s1 = new String(str.reverse());
        isPalindrome(s, s1);   //string
    }

    private static void isPalindrome(String s, String s1) {
        System.out.println(s.equals(s1));
    }

    private static void isPalindrome(int number) {
        int reverse = ReverseNumber.reverseNumber(number);
        System.out.println(reverse == number);
    }
}
