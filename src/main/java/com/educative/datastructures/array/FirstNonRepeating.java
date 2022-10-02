package com.educative.datastructures.array;



public class FirstNonRepeating {
    public static void main(String[] args) {

    }

    /**
     *
     * arr = {9, 2, 3, 2, 6, 6}, output: 9
     */
    static int firstNonRepeating(int[] arr) {
        boolean isRepeated = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated == false) {
                return arr[i];
            } else {
                isRepeated = false;
            }
        }
        return -1;
    }
}
