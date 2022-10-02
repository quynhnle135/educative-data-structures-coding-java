package com.educative.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {

    }
    static int[] removeEven(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
    static List<Integer> remove(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int n : array) {
            if (n % 2 != 0) {
                result.add(n);
            }
        }
        return result;
    }
}
