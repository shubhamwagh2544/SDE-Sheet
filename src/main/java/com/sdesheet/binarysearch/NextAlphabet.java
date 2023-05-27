package com.sdesheet.binarysearch;

public class NextAlphabet {
    static char res = 0;
    public static void main(String[] args) {
        char[] array = {'c', 'f', 'h'};
        char alphabet = 'a';
        nextAlphabet(array, alphabet);
        System.out.println(res);
    }

    private static void nextAlphabet(char[] array, char alphabet) {
        int start = 0;
        int end = array.length-1;
        helperFunction(array, start, end, alphabet);
    }
    private static void helperFunction(char[] array, int start, int end, char alphabet) {
        if (start > end) {
            return;
        }
        int mid = (start+end)/2;
        if (array[mid] == alphabet) {
            helperFunction(array, mid+1, end, alphabet);
        }
        else if (array[mid] > alphabet) {
            res = array[mid];
            helperFunction(array, start, mid-1, alphabet);
        }
        else {
            helperFunction(array, mid+1, end, alphabet);
        }

    }
}
