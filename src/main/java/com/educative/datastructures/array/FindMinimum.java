package com.educative.datastructures.array;

public class FindMinimum {
    public static void main(String[] args) {

    }
    static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
