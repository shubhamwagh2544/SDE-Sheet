package com.sdesheet.patterns;
/*
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
 */
public class Pattern14 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                for (int j = 5; j >= 1; j--) {
                    if (j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            else {
                // i = 6
                for (int j = 6; j <= 10; j++) {
                    if (i < j) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
