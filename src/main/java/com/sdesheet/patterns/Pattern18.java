package com.sdesheet.patterns;
/*
          *****
           ***
            *
 */
public class Pattern18 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
