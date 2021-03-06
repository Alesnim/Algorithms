package com.nishant.algorithms.BitManipulation;

import com.nishant.algorithms.BitManipulation.SingleNumber.SingleNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

  private int[] arr;

  @Before
  public void setup() {
    arr = new int[]{1, 2, 2, 1, 5};
  }

  @Test
  public void resultTest() {
    assertEquals(5, SingleNumber.singleNumber(arr));
  }
}
