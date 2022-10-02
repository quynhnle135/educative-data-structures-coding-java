package com.educative.datastructures.array;

public class ArrayOfProducts {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] res = findProductOpt(arr);
        for (int n : res) {
            System.out.println(n);
        }
    }
    static int[] findProduct(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            res[i] = product;
        }
        return res;
    }

    static int[] findProductOpt(int[] arr) {
        int[] res = new int[arr.length];
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            res[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] *= temp;
            temp *= arr[i];
        }
        return res;
    }
}
