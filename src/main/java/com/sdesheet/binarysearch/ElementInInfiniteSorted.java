package com.sdesheet.binarysearch;

public class ElementInInfiniteSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25}; // consider infinite array
        int element = 7;
        System.out.println(positionOfElementInInfiniteSorted(array, element));
    }

    private static int positionOfElementInInfiniteSorted(int[] array, int element) {
        int start = 0;
        int end = 1;
        while (start <= end) {
            if (array[end] < element) {
                start = end;
                end = end * 2;
            }
            else break;
        }
        return BinarySearch.getBinarySearch(array, start, end, element);
    }
}
