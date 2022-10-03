package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSubArrayTest {
    @Test
    public void testMaxSubArray() {
        int[] arr = {1, 7, -2, -5, 10, -1};
        int expected = 11;
        int actual = MaxSubArray.maxSubarray(arr);
        Assertions.assertTrue(expected == actual);
    }
}
