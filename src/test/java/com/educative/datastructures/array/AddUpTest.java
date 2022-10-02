package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddUpTest {
    @Test
    public void testAddUp() {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        int[] expected = {6, 21};
        int[] actual = AddUp.findSum(arr, value);
        Assertions.assertArrayEquals(expected, actual);
    }
}
