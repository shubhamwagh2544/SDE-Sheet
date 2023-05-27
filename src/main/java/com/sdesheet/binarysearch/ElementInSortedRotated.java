package com.sdesheet.binarysearch;

public class ElementInSortedRotated {
    public static void main(String[] args) {
        int[] array = {15, 18, 2, 5, 6, 8, 11, 12};
        int element = 11;
        System.out.println(findElementInSortedRotatedArray(array, element));
    }

    private static int findElementInSortedRotatedArray(int[] array, int element) {
        //getting min number index (rotation index)
        int pivot = SortedRotatedArray.numberOfTimesSortedArrayIsRotated(array);
        int leftArrayIndex = BinarySearch.getBinarySearch(array, 0, pivot-1, element);
        int rightArrayIndex = BinarySearch.getBinarySearch(array, pivot, array.length-1, element);

        if (leftArrayIndex != -1) return leftArrayIndex;
        return rightArrayIndex;
    }
}
