package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoArrayTest {
    @Test
    public void testMergeTwoArray() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeTwoArrayNegative() {
        int[] arr1 = {-5, -3, -1};
        int[] arr2 = {-6, -4, -2};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {-6, -5, -4, -3, -2, -1};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeTwoArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeTwoArrayEmptyMixed() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-99, -98, -97};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {-99, -98, -97, 1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeTwoArrayEmptyMixedA() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-99, -98, 97};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {-99, -98, 1, 2, 3, 4, 5, 97};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeArr() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] actual = MergeTwoArray.merge(arr1, arr2);
        int[] expected = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeArrNegative() {
        int[] arr1 = {-5, -3, -1};
        int[] arr2 = {-6, -4, -2};
        int[] result = MergeTwoArray.merge(arr1, arr2);
        int[] expectedResult = {-6, -5, -4, -3, -2, -1};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeArrEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] result = MergeTwoArray.merge(arr1, arr2);
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeArrEmptyMixed() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-99, -98, -97};
        int[] result = MergeTwoArray.merge(arr1, arr2);
        int[] expectedResult = {-99, -98, -97, 1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMergeArrEmptyMixedA() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-99, -98, 97};
        int[] result = MergeTwoArray.mergeArray(arr1, arr2);
        int[] expectedResult = {-99, -98, 1, 2, 3, 4, 5, 97};
        Assertions.assertArrayEquals(expectedResult, result);
    }
}
