package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RearrangeMaxMinTest {
    @Test
    public void testRearrangeMaxMin() {
        int[] arr = {1, 2, 3, 4, 5};
        RearrangeMaxMin.rearrangeMaxMin(arr);
        int[] expected = {5, 1, 4, 2, 3};
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testRearrangeMaxMin1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        RearrangeMaxMin.rearrangeMaxMin(arr);
        int[] expected = {7, 1, 6, 2, 5, 3, 4};
        Assertions.assertArrayEquals(expected, arr);
    }
}
