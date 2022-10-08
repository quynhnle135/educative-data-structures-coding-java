package com.educative.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {

    }

    static int[] removeEven(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int n : nums) {
            if (n % 2 != 0) {
                result[index++] = n;
            }
        }
        return result;
    }

    static List<Integer> removeEvenUsingList(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            if (n % 2 != 0) {
                result.add(n);
            }
        }

        return result;
    }
}
