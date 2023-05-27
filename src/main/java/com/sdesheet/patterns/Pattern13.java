package com.sdesheet.patterns;
/*
            *
           **
          ***
         ****
        *****
         ****
          ***
           **
            *
 */
public class Pattern13 {
    public static void main(String[] args) {
        print();    //1
        System.out.println("------------------------------");
        print("method2");   //2
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void print(String method2) {
        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                for (int j = 5; j >= 1; j--) {
                    if (i < j) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            else {
                for (int j = 6; j <= 10; j++) {
                    if (i >= j) {
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

}
