package com.sdesheet.binarysearch;
/*
nearly sorted array :> ith element can be found at (i+1)th position or (i-1)th position

Nearly Sorted :> 5 10 30 20 40
Sorted Array :> 5 10 20 30 40

For Complete Sorted  :> we check at middle and move left/right accordingly
For Nearly Sorted :> we check at middle & middle+1 & middle-1 as element can be at (i+1) and (i-1) position
                     then move to left/right accordingly.
 */
public class SearchingInNearlySorted {
    public static void main(String[] args) {
        int[] array = {5, 10, 30, 20, 40};
        int element = 20;
        System.out.println(findElementInNearlySorted(array, element));
    }

    private static int findElementInNearlySorted(int[] array, int element) {
        int start = 0;
        int end = array.length-1;
        return helperFunction(array, start, end, element);
    }
    private static int helperFunction(int[] array, int start, int end, int element) {
        if (start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        if (array[mid] == element) {
            return mid;
        }
        if (mid!=0 && array[mid-1] == element) {
            return mid-1;
        }
        if (mid!=array.length-1 && array[mid+1] == element) {
            return mid+1;
        }
        if (mid!=0 && element < array[mid-2]) {
            return helperFunction(array, start, mid-2, element);
        }
        if (mid!=array.length-1 && element > array[mid+2]) {
            return helperFunction(array, mid+2, end, element);
        }
        return -1;
    }
}
