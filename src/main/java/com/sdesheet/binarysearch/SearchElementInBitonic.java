package com.sdesheet.binarysearch;

public class SearchElementInBitonic {
    public static void main(String[] args) {
        int[] array = {1, 3, 8, 12, 4, 2};
        int element = 4;
        System.out.println("The index of Element : " + searchElementInBitonicArray(array, array.length, element));
    }

    private static int searchElementInBitonicArray(int[] array, int length, int element) {
        /*
                get index of max element in bitonic array
                apply binary search on two partitions
         */
        int index = MaximumElementInBitonicArray.maxElementInBitonicArray(array, length);
        int res1 = BinarySearch.getBinarySearch(array, 0, index, element);
        int res2 = BinarySearchForDescSort.getBinarySearchForDescSort(array, index, length-1, element);
        return Math.max(res1, res2);
    }
}
