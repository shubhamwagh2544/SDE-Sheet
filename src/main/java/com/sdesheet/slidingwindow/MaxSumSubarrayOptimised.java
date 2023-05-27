package com.sdesheet.slidingwindow;

import java.util.Scanner;

public class MaxSumSubarrayOptimised {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 2, 9, 1};
        int n = array.length;
        int k = new Scanner(System.in).nextInt();
        if (k > 0 && k <= n) {
            System.out.println(maxSumSubarrayOptimised(array, n, k));
            System.out.println(maxSumSubarrayOptimised2(array, n, k));
        }
        else {
            System.out.println("wrong input");
        }
    }

    private static int maxSumSubarrayOptimised2(int[] array, int n, int k) {
        int i=0;
        int j=0;
        int sum = 0;
        int ans = 0;
        while (i < k && i < n) {
            sum+=array[i];
            i++;
            ans = Math.max(ans, sum);
            if (i == k) {
                sum = sum-array[j];
                j++;
                k++;
            }
        }
        return ans;
    }


    private static int maxSumSubarrayOptimised(int[] array, int n, int k) {
        int contiguousSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            contiguousSum += array[j];
            if (j-i+1 == k) {
                maxsum = Math.max(contiguousSum, maxsum);
                contiguousSum = contiguousSum - array[i];
                i++;
            }
            j++;
        }
        return maxsum;
    }
}
