package com.fang.dreamer.com.fang.dreamer.arrays;

/**

 Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 canBalance([1, 1, 1, 2, 1]) → true
 canBalance([2, 1, 1, 2, 1]) → false
 canBalance([10, 10]) → true


 * Referencese
 * https://codingbat.com/prob/p158767
 * https://techdevguide.withgoogle.com/paths/foundational/hangman-challenge-archetypal/#!
 */
public class CanBlanaceArray {
  public static void main(String[] args) {
    int[] nums = new int[] {10, -1, 1, 0, 10};

    System.out.println(canBalance(nums));
  }

  /**
   * Return true if there is place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
   * @param nums
   * @return
   */
  public static boolean canBalance(int[] nums) {
    int leftSum = 0;
    int rightSum = 0;
    int visitCount = 0;
    int j_index = 0;

    for (int i = 0; i < nums.length; i++) {
      if(leftSum <= rightSum + nums[nums.length-1  - j_index])
      leftSum = leftSum + nums[i];
      visitCount++;
      if (i == 0) {
        rightSum = rightSum + nums[nums.length - 1];
        j_index++;
        visitCount++;
      }

      for (int j = nums.length - j_index - 1; j >= 0 && j >= i; j--) {
        if (leftSum == rightSum && visitCount == nums.length) {
          return true;
        } else if (leftSum <= rightSum) {
          break;
        } else {
          rightSum = rightSum + nums[j];
          j_index++;
          visitCount++;
        }
      }
    }
    return false;
  }
}
