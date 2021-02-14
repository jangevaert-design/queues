package edu.cnm.deepdive;

import java.util.Arrays;

public class Only14 {
//Given an array of ints, return true if every element is a 1 or a 4.
  public static void main(String[] args) {
    int [] newNums = new int[] {1, 4, 2, 4};
    System.out.println("the int[] " + Arrays.toString(newNums) + " gives as outcome: " + only14(newNums));
  }

  public static boolean only14(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 1 && nums[i] != 4) {
        return false;
      }
    }    return true;
  }
}


