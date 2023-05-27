package com.sdesheet.binarysearch;
/*
        bitonic array => monotonic increase + monotonic decrease
         1, 3, 8, 12, 4, 2
 */
public class MaximumElementInBitonicArray {
    public static void main(String[] args) {
        //int[] array = {1, 3, 8, 12, 4, 2};
        int[] array = {1, 2, 3, 2, 1};
        System.out.println("Max Element : " + maxElementInBitonicArray(array, array.length));
    }

    public static int maxElementInBitonicArray(int[] array, int length) {
        int start = 0;
        int end = length-1;
        int res = -1;
        int index = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != length-1 && array[mid] > array[mid+1]) {
                res = array[mid];
                index = mid;
                end = mid - 1;
            }
            else if (array[mid] < array[mid+1]) {
                start = mid + 1;
            }
        }
        //return res;
        return index;
    }
}
