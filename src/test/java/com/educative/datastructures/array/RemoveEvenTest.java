package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int[] arr = {};
        int[] result = RemoveEven.removeEven(arr);
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemoveEvenUsingList() {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> actual = RemoveEven.removeEvenUsingList(array);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(1, 3, 5));
        Assertions.assertTrue(expected.equals(actual));
    }

    @Test
    public void testRemoveEvenUsingListNegative() {
        int[] array = {-1, -2, -3, -4, -5};
        List<Integer> actual = RemoveEven.removeEvenUsingList(array);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(-1, -3, -5));
        Assertions.assertTrue(expected.equals(actual));
    }

    @Test
    public void testRemoveEvenUsingListEmpty() {
        int[] arr = {};
        List<Integer> actual = RemoveEven.removeEvenUsingList(arr);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList());
        Assertions.assertTrue(expected.equals(actual));
    }

}
