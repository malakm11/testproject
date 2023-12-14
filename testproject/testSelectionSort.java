package testproject;

import static org.junit.Assert.*;
import org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	SelectionSort sort= new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    @Test
    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};
        sort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testNegative() {
        int[] arr = {-8, -9, -7, -10, -2};
        int[] sortedArr = {-10, -9, -8, -7, -2};
        sort.basicSelectionSort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testMixed() {
        int[] arr = {-8, 9, 0, -10, 2};
        int[] sortedArr = {-10, -8, 0, 2, 9};
        sort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, 2, 8, 2, 1};
        int[] sortedArr = {1, 2, 2, 5, 8};
        sort.basicSelectionSort(arr);
        assertArrayEquals(sortedArr, arr);
    }
}


