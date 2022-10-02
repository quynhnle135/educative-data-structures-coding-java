package com.educative.datastructures.array;

import java.util.Arrays;

public class AddUp {
    public static int[] findSum(int[] arr, int n) {
        int[] res = new int[2];
        // sort array
        Arrays.sort(arr);
        // l r pointer, if sum == n, return, sum > n, r-- else l++, i
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int lNum = arr[l];
            int rNum = arr[r];
            int sum = lNum + rNum;
            if (sum == n) {
                return new int[] {lNum, rNum};
            } else if (sum > n) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
}
