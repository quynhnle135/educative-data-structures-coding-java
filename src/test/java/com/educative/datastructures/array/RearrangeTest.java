package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RearrangeTest {
    @Test
    public void testRearrange() {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        Rearrange.rearrange(arr);
        int[] expected = {-1, -9, -6, 10, 20, 4, 5};
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testRearrangeInPlace() {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        Rearrange.rearrangeInPlace(arr);
        int[] expected = {-1, -9, -6, 4, 5, 10, 20};
        Assertions.assertArrayEquals(expected, arr);
    }
}
