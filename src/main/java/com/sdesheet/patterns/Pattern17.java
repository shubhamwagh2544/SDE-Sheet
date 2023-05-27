package com.sdesheet.patterns;
/*
            *
           ***
          *****
         *******
        *********
 */
public class Pattern17 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        /*
            another approach :>
            printing space triangle first -> then printing star triangle
         */
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {       // as i (col) increases, space (j) decreases
                //spaces
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
