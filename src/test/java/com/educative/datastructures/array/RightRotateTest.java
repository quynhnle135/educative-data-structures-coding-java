package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightRotateTest {
    @Test
    public void testRightRotate() {
        int[] arr = {1, 2, 3, 4, 5};
        RightRotate.rightRotate(arr);
        int[] expected = {5, 1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, arr);
    }
}
