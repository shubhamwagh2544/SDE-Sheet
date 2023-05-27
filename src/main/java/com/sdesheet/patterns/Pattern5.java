package com.sdesheet.patterns;
/*
         * * * * *
         * * * *
         * * *
         * *
         *
 */
public class Pattern5 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
