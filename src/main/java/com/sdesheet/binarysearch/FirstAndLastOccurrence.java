package com.sdesheet.binarysearch;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int element = 10;
        getLeftAndRightOccurrence(array, element);
    }

    private static void getLeftAndRightOccurrence(int[] array, int element) {
        FirstOccurrence.getFirstOccurrence(array, element);
        LastOccurrence.getLastOccurrence(array, element);
    }

}
