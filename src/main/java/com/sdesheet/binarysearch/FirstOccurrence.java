package com.sdesheet.binarysearch;

public class FirstOccurrence {
    static int leftO = -1;
    public static void main(String[] args) {
        int[] array = {2, 4, 10, 10, 10, 18, 20};
        int element = 10;
        System.out.println(getFirstOccurrence(array, element));
    }

    public static int getFirstOccurrence(int[] array, int element) {
        int start = 0;
        int end = array.length-1;
        return helperFunction(array, start, end, element);
    }
    public static int helperFunction(int[] array, int start, int end, int element) {
        if (start > end) {
            return 0;
        }
        int mid = (start+end)/2;
        if (array[mid] == element) {
            leftO = mid;
            if (mid!= 0 && array[mid-1] == element) {
                helperFunction(array, start, mid-1,element);
            }
        }
        else if (element < array[mid]) {
            helperFunction(array, start, mid-1, element);
        }
        else {
            helperFunction(array, mid+1, end, element);
        }
        return leftO;
    }
}
