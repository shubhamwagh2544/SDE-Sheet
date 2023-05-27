package com.sdesheet.patterns;
/*
        1                 1
        1 2             2 1
        1 2 3         3 2 1
        1 2 3 4     4 3 2 1
        1 2 3 4 5 5 4 3 2 1
 */
public class Pattern20 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            for(int s = (n-i)*2; s >= 1; s--){
                // space
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
