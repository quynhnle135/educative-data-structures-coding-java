package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveEvenTest {
    @Test
    public void testRemoveEven() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = RemoveEven.removeEven(array);
        int[] expectedResult = {1, 3, 5};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemoveEvenNegative() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] result = RemoveEven.removeEven(array);
        int[] expectedResult = {-1, -3, -5};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemoveEvenEmpty() {
        int[] arr= {};
        int[] result = RemoveEven.removeEven(arr);
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
