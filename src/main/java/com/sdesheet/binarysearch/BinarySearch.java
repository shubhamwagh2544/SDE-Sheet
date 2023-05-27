package com.sdesheet.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        for (int count=1; count<=10; count++) {
            int element = scanner.nextInt();
            System.out.println(binarySearch(arr, element));
        }
    }

    public static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length-1;
        return getBinarySearch(arr, start, end, element);
    }

    public static int getBinarySearch(int[] arr, int start, int end, int element) {
        if (start > end) {
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid] == element) {
            return mid;
        }
        else if (element < arr[mid]) {
            return getBinarySearch(arr, start, mid-1, element);
        }
        else {
            return getBinarySearch(arr, mid+1, end, element);
        }
    }
}
