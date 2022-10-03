package com.educative.datastructures.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOfProductsTest {
    @Test
    public void testArrayOfProducts() {
        int[] arr = {1, 2, 3, 4};
        int[] actual = ArrayOfProducts.findProduct(arr);
        int[] expected = {24, 12, 8, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsNegative() {
        int[] arr = {-1, -2, -3, -4};
        int[] actual = ArrayOfProducts.findProduct(arr);
        int[] expected = {-24, -12, -8, -6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsMixed() {
        int[] arr = {-1, 2, -3, 4};
        int[] actual = ArrayOfProducts.findProduct(arr);
        int[] expected = {-24, 12, -8, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsZero() {
        int[] arr = {1, 2, 3, 0};
        int[] actual = ArrayOfProducts.findProduct(arr);
        int[] expected = {0, 0, 0, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsOpt() {
        int[] arr = {1, 2, 3, 4};
        int[] actual = ArrayOfProducts.findProductOpt(arr);
        int[] expected = {24, 12, 8, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsNegativeOpt() {
        int[] arr = {-1, -2, -3, -4};
        int[] actual = ArrayOfProducts.findProductOpt(arr);
        int[] expected = {-24, -12, -8, -6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsMixedOpt() {
        int[] arr = {-1, 2, -3, 4};
        int[] actual = ArrayOfProducts.findProductOpt(arr);
        int[] expected = {-24, 12, -8, 6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testArrayOfProductsZeroOpt() {
        int[] arr = {1, 2, 3, 0};
        int[] actual = ArrayOfProducts.findProductOpt(arr);
        int[] expected = {0, 0, 0, 6};
        Assertions.assertArrayEquals(expected, actual);
    }
}
