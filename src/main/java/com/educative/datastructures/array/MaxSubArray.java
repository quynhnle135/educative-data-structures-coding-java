package com.educative.datastructures.array;

public class MaxSubArray {
    static int maxSubarray(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int curMax = 0;
        for (int i = 0; i < arr.length; i++) {
            curMax += arr[i];
            if (curMax > max) {
                max = curMax;
            }
            if (curMax < 0) {
                curMax = 0;
            }
        }
        return max;
    }
}
