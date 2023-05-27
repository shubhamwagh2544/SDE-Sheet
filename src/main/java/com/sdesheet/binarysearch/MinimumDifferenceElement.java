package com.sdesheet.binarysearch;

import java.util.Map;

public class MinimumDifferenceElement {
    public static void main(String[] args) {
        int[] array = {4, 6, 10};
        //int[] array = {1, 3, 7, 9, 10};
        int key = 7;
        minimumDifferenceElementInSorted(array, array.length, key);
    }
    private static void minimumDifferenceElementInSorted(int[] array, int length, int key) {
        FloorOfElement.findFloorOfElement(array, key);
        CeilOfElement.findCeilOfElement(array, key);

        int minimumDiff = Integer.MAX_VALUE;
        int floor = FloorOfElement.getResult();
        int ceil = CeilOfElement.getResult();
/*
        if (Math.abs(floor-key) < Math.abs(ceil-key)) {
            minimumDiff = floor;
        }
        else {
            minimumDiff = ceil;
        }
 */
        minimumDiff = (Math.abs(floor-key) < Math.abs(ceil-key)) ? floor : ceil;

        System.out.println("Minimum Difference Element is : " + minimumDiff);
    }
}
