package com.educative.datastructures.array;

public class RightRotate {
    static void rightRotate(int[] arr) {
        int lastValue = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastValue;
    }
}
