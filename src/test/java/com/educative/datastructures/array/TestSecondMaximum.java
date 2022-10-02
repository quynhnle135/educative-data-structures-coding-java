package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSecondMaximum {
    @Test
    public void testSecondMaximum() {
        int[] arr = {9, 2, 3, 6};
        int actual = SecondMaximum.secondMax(arr);
        int expected = 6;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumNegative() {
        int[] arr = {-9, -2, -3, -6};
        int actual = SecondMaximum.secondMax(arr);
        int expected = -3;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximum2() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = SecondMaximum.secondMax(arr);
        int expected = 4;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximum3() {
        int[] arr = {0, 0, 0, 0, 1};
        int actual = SecondMaximum.secondMax(arr);
        int expected = 0;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximum4() {
        int[] arr = {9, -2, 3, -6};
        int actual = SecondMaximum.secondMax(arr);
        int expected = 3;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumOpt() {
        int[] arr = {9, 2, 3, 6};
        int actual = SecondMaximum.secondMaxOpt(arr);
        int expected = 6;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumNegativeOpt() {
        int[] arr = {-9, -2, -3, -6};
        int actual = SecondMaximum.secondMaxOpt(arr);
        int expected = -3;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumOpt2() {
        int[] arr = {1, 2, 3, 4, 5};
        int actual = SecondMaximum.secondMaxOpt(arr);
        int expected = 4;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumOpt3() {
        int[] arr = {0, 0, 0, 0, 1};
        int actual = SecondMaximum.secondMaxOpt(arr);
        int expected = 0;
        Assertions.assertTrue(expected == actual);
    }

    @Test
    public void testSecondMaximumOpt4() {
        int[] arr = {9, -2, 3, -6};
        int actual = SecondMaximum.secondMaxOpt(arr);
        int expected = 3;
        Assertions.assertTrue(expected == actual);
    }
}
