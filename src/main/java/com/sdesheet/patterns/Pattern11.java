package com.sdesheet.patterns;
/*
        * * * * *
         * * * *
          * * *
           * *
            *
 */
public class Pattern11 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i > j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
