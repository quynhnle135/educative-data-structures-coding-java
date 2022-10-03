package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingTest {
    @Test
    public void testFirstNonRepeating() {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = 9;
        Assertions.assertTrue(actual == expected);
    }

    @Test
    public void testFirstNonRepeatingNegative() {
        int[] arr = {-9, -2, -3, -2, -6, -6};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = -9;
        Assertions.assertTrue(actual == expected);
    }

    @Test
    public void testFirstNonRepeatingMix() {
        int[] arr = {-9, -2, 3, 2, 6, 6};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = -9;
        Assertions.assertTrue(actual == expected);
    }

    @Test
    public void testFirstNonRepeatingMix2() {
        int[] arr = {-2, -2, 9, 3, 2, 6, 6};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = 9;
        Assertions.assertTrue(actual == expected);
    }

    @Test
    public void testFirstNonRepeatingMix3() {
        int[] arr = {-9, 2, 3, -2, 6, 6};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = -9;
        Assertions.assertTrue(actual == expected);
    }


    @Test
    public void testFirstNonRepeatingMix4() {
        int[] arr = {2, 54, 7, 2, 6, 54};
        int actual = FirstNonRepeating.firstNonRepeating(arr);
        int expected = 7;
        Assertions.assertTrue(actual == expected);
    }
}
