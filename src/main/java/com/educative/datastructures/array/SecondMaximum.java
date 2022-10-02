package com.educative.datastructures.array;

public class SecondMaximum {
    // Traverse the array twice
    static int secondMax(int[] arr) {
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        for (int n : arr) {
            if (n < max && n > secondMax) {
                secondMax = n;
            }
        }
        return secondMax;
    }

    // Traverse the array once
    static int secondMaxOpt(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
