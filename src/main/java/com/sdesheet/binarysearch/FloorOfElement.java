package com.sdesheet.binarysearch;
/*
    floor of element in sorted array :>
    1. if element is present, then itself is floor
    2. if element is not present,then maximum smaller number below the element
 */
public class FloorOfElement {
    static int res = -1;
    public static void main(String[] args) {
        int[] array = {1, 2, 3 ,4};
        int element = 5;
        findFloorOfElement(array, element);
        System.out.println(res);
    }

    public static void findFloorOfElement(int[] array, int element) {
        int start = 0;
        int end = array.length-1;
        helperFunction(array, start, end, element);
    }
    private static void helperFunction(int[] array, int start, int end, int element) {
        if (start > end) {
            return;
        }
        int mid = (start+end)/2;
        if (array[mid] == element) {
            helperFunction(array, start, mid-1, element);
        }
        else if (array[mid] < element) {
            res = array[mid];
            helperFunction(array, mid+1, end, element);
        }
        else {
            helperFunction(array, start, mid-1, element);
        }
    }
    public static int getResult() {
        return res;
    }
}
