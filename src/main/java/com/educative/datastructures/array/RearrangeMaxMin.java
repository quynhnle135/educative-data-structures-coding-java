package com.educative.datastructures.array;

public class RearrangeMaxMin {
    static void rearrangeMaxMin(int[] arr) {
        int[] res = new int[arr.length];
        int largePointer = arr.length - 1;
        int smallPointer = 0;
        boolean switched = true;
        for (int i = 0; i < arr.length; i++) {
            if (switched) {
                res[i] = arr[largePointer--];
            } else {
                res[i] = arr[smallPointer++];
            }
            switched = !switched;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
