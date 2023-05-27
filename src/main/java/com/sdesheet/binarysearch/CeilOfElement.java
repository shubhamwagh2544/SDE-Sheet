package com.sdesheet.binarysearch;
/*
 ceil of element :>
 1. if present then number itself
 2. if not present, then smallest number greater than the element
 */
public class CeilOfElement {
    static int res = -1;
    public static void main(String[] args) {
        //int[] array = {1, 2, 3, 4, 6, 7, 8};
        int[] array = {4, 5, 6, 7, 8, 9, 10};
        //int element = 5;
        int element = 3;
        findCeilOfElement(array, element);
        System.out.println(res);
    }

    public static void findCeilOfElement(int[] array, int element) {
        int start = 0;
        int end = array.length-1;
        helperFunction(array, start, end, element);
    }
    private static void helperFunction(int[] array, int start, int end, int element) {
        if (start > end) {
            return;
        }
        int mid = (start+end)/2;
        if (array[mid] < element) {
            helperFunction(array, mid+1, end, element);
        }
        else if (array[mid] == element) {
            helperFunction(array, mid+1, end, element);
        }
        else {
            res = array[mid];
            helperFunction(array, start, mid-1, element);
        }
    }
    public static int getResult() {
        return res;
    }
}
