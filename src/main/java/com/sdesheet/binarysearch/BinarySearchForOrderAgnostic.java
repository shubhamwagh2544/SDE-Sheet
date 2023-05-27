package com.sdesheet.binarysearch;

import java.util.Scanner;

public class BinarySearchForOrderAgnostic {
    public static void main(String[] args) {
        System.out.println("size of array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("input array elements in any sorted way");
        for (int i=0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("element to be searched");
        int element = scanner.nextInt();
        System.out.println(orderAgnosticBinarySearch(array, element));
    }

    private static int orderAgnosticBinarySearch(int[] array, int element) {
        if (array.length == 1) {
            if (array[0] == element) {
                return 0;
            }
            else return -1;
        }
        else {
            if (array[0] > array[1]) {
                return BinarySearchForDescSort.binarySearchForDescSort(array, element);
            }
            else return BinarySearch.binarySearch(array, element);
        }
    }
}
