package com.sdesheet.patterns;
/*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
 */
public class Pattern15 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (number == 1) {
                    System.out.print(number+" ");
                    number = 0;
                }
                else {
                    System.out.print(number+" ");
                    number = 1;
                }
            }
            System.out.println();
        }
    }
}
