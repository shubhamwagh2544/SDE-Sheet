package com.sdesheet.slidingwindow;

public class FirstNegativeInWindowOfK {
    public static void main(String[] args) {
        int[] array = {12, -1, -7, 8, -15, 30, 18, 28, 20};
        int n = array.length;
        int i=0;
        int j=0;
        int k=2;
        while (i < k && i < n) {
            if (array[i] < 0) {
                System.out.println(array[i]);
                j++;
                i=j;
                k++;
                continue;
            }
            i++;
        }
    }
}
