package com.sdesheet.binarysearch;

public class CountOfElement {
    public static void main(String[] args) {
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int element = 2;
        System.out.println(countOfElementInSortedArray(array, element));
    }

    private static int countOfElementInSortedArray(int[] array, int element) {
        int firstO = FirstOccurrence.getFirstOccurrence(array, element);
        int secondO = LastOccurrence.getLastOccurrence(array, element);

        if (firstO != -1 && secondO != -1) {
            return secondO - firstO + 1;
        }
        else {
            return 0;
        }
    }
}
