package com.sdesheet.binarysearch;

public class SearchIn2DSorted {
    public static void main(String[] args) {
        int[][] array = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        //array printing
        for (int i=0; i<array[0].length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int element = 11;
        System.out.println("\nLooking Into Array:");
        searchElementIn2DSorted(array, element);
    }
    private static void searchElementIn2DSorted(int[][] array, int element) {
        for (int i = 0; i < array[0].length; ) {
            for (int j = array.length-1; j >= 0; ) {
                if (element == array[i][j]) {
                    System.out.println("FOUND");
                    return;
                }
                else if (element < array[i][j]) {
                    // go left
                    j--;
                }
                else {
                    // go down
                    i++;
                }
                if (j < 0) {
                    System.out.println("NOT FOUND");
                    return;
                }
            }
            if (i >= array[0].length) {
                System.out.println("NOT FOUND");
                return;
            }
        }
    }
}
