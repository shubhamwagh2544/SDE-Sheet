package com.sdesheet.binarysearch;
/*
        peak element : element who's adjacent elements are smaller than it
 */
public class PeakElement {
    public static void main(String[] args) {
        //int[] array = {1, 2, 3, 1};
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak Element : " + peakElement(array, array.length));
    }

    private static int peakElement(int[] array, int length) {
        if (length == 1) return array[0];
        if (array[0] > array[1]) return array[0];
        if (array[length-1] > array[length-2]) return array[length-1];

        int start = 0;
        int end = length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != 0 && array[mid] > array[mid-1] && array[mid] > array[mid+1]) {
                return array[mid];
            }
            else if (mid != length-1 && array[mid] < array[mid+1]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
