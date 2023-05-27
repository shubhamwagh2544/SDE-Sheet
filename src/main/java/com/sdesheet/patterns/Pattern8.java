package com.sdesheet.patterns;
/*
                *
               **
              ***
             ****
            *****
 */
public class Pattern8 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
