package com.nishant.algorithms.Sorting;

import org.junit.Before;
import org.junit.Test;

import com.nishant.algorithms.Sorting.MergeSort.MergeSort;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

  private int[] arr;

  @Before
  public void setup() {
    arr = new int[]{5, 3, 2, 1, 5};
  }

  @Test
  public void test() {
    MergeSort.sort(arr);
    assertArrayEquals(new int[]{1, 2, 3, 5, 5}, arr);
  }
}
