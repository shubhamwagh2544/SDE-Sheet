package com.sdesheet.patterns;

/*
        *
       ***
      *****
       ***
        *
 */
public class Pattern19 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                //space
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                //stars
                System.out.print("*");
            }
            System.out.println();
        }
        n = 3;
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                //space
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                //stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
