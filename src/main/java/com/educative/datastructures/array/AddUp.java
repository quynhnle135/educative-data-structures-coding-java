package com.educative.datastructures.array;

import java.util.Arrays;

public class AddUp {
    //    public static int[] findSum(int[] arr, int n) {
//        int[] res = new int[2];
//        // sort array
//        Arrays.sort(arr);
//        // l r pointer, if sum == n, return, sum > n, r-- else l++, i
//        int l = 0;
//        int r = arr.length - 1;
//        while (l < r) {
//            int lNum = arr[l];
//            int rNum = arr[r];
//            int sum = lNum + rNum;
//            if (sum == n) {
//                return new int[] {lNum, rNum};
//            } else if (sum > n) {
//                r--;
//            } else {
//                l++;
//            }
//        }
//        return res;
//    }
    static int[] addUp(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i] + arr[j];
                if (sum == n) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

//    static int[] addUpSort(int[] arr, int n) {
//        Arrays.sort(arr);
//        int l = 0;
//        int r = arr.length - 1;
//        while (l < r) {
//            if (arr[l] + arr[r])
//        }
//    }
}
