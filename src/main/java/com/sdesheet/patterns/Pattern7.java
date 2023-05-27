package com.sdesheet.patterns;
/*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
 */
public class Pattern7 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
