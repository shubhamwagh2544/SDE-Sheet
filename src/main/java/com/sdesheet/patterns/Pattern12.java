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
public class Pattern12 {
    public static void main(String[] args) {
        print();    //1
        System.out.println("----------------------------------------");
        print("method2");   //2
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void print(String method2) {
        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for (int j = 10; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
