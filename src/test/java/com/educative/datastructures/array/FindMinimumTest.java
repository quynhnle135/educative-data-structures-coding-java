package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinimumTest {
    @Test
    public void testFindMinimum() {
        int[] array = {9, 2, 3, 6};
        int actual = FindMinimum.findMinimum(array);
        int expected = 2;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testFindMinimumNegative() {
        int[] array = {-9, -2, -3, -6};
        int actual = FindMinimum.findMinimum(array);
        int expected = -9;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testFindMinimumMixed() {
        int[] array = {9, 0, -3, 6};
        int actual = FindMinimum.findMinimum(array);
        int expected = -3;
        Assertions.assertTrue(expected == actual);
    }
}
