package com.sdesheet.binarysearch;

// number of times sorted array is rotated => index of minimum number in sorted rotated array
/*
        only 3 scenarios
        1. left scenario
            array(mid) < array(start) => rotation (min number) resides in left

        2. right scenario
            array(mid) > array(end) => rotation (min number) resides in right

        3. middle scenario
            array[mid] > array[mid+1] && mid != array.length-1      => trigger point (mid+1 is min number)
            array[mid] < array[mid-1] && mid != 0                   => trigger point (mid is min number)
 */

public class SortedRotatedArray {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 15, 18, 2, 5, 6, 8},
                {6, 8, 11, 12, 15, 18, 2, 5},
                {15, 18, 2, 5, 6, 8, 11, 12},
                {2, 5, 6, 8, 11, 12, 15, 18}
        };

        for (int i=0; i<array.length; i++) {
            System.out.println(numberOfTimesSortedArrayIsRotated(array[i]));
        }
    }

    public static int numberOfTimesSortedArrayIsRotated(int[] array) {
        int start = 0;
        int end = array.length-1;
        return helperFunction(array, start, end);
    }
    private static int helperFunction(int[] array, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end)/2;
        if (array[mid] > array[mid+1] && mid != array.length-1) {
            return mid+1;
        }
        if (array[mid] < array[mid-1] && mid != 0) {
            return mid;
        }
        if (array[mid] > array[end]) {
            return helperFunction(array, mid+1, end);
        }
        if (array[mid] < array[start]) {
            return helperFunction(array, start, mid-1);
        }
        return -1;
    }
}
