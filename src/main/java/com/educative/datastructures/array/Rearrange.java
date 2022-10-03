package com.educative.datastructures.array;

public class Rearrange {
    // Using new array
    static void rearrange(int[] arr) {
        int[] res = new int[arr.length];
        int j = 0;
        for (int n : arr) {
            if (n < 0) {
                res[j++] = n;
            }
        }
        for (int n : arr) {
            if (n > 0) {
                res[j++] = n;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }

    // Rearrange in place
    static void rearrangeInPlace(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
