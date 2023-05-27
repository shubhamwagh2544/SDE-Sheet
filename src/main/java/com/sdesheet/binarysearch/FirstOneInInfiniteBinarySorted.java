package com.sdesheet.binarysearch;
/*
combination of FirstOccurrence + InfiniteSorted
 */
public class FirstOneInInfiniteBinarySorted {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; //infinite array
        int element = 1;
        System.out.println(firstOneInInfiniteBinarySorted(array, element));
    }

    private static int firstOneInInfiniteBinarySorted(int[] array, int element) {
        int start = 0;
        int end = 1;    // since array is infinite, we don't know end
        while (start <= end) {
            if (array[end] < element) {
                start = end;
                end = end * 2;
            }
            else break;
        }
        return FirstOccurrence.helperFunction(array, start, end, element);
    }
}
