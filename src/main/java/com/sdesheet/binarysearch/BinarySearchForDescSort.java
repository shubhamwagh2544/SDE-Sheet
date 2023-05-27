package com.sdesheet.binarysearch;

import java.util.Scanner;

public class BinarySearchForDescSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner = new Scanner(System.in);
        for (int count=1; count<=10; count++) {
            int element = scanner.nextInt();
            System.out.println(binarySearchForDescSort(arr, element));
        }
    }

    public static int binarySearchForDescSort(int[] arr, int element) {
        int start = 0;
        int end = arr.length-1;
        return getBinarySearchForDescSort(arr, start, end, element);
    }

    public static int getBinarySearchForDescSort(int[] arr, int start, int end, int element) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == element) {
            return mid;
        }
        else if (element < arr[mid]) {
            return getBinarySearchForDescSort(arr, mid+1, end, element);
        }
        else {
            return getBinarySearchForDescSort(arr, start, mid-1, element);
        }
    }
}
