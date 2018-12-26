package com.fang.dreamer.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the
 * "span" is the number of elements between the two inclusive. A single value has a span of 1.
 * Returns the largest span found in the given array. (Efficiency is not a priority.)
 *
 * <p>maxSpan([1, 2, 1, 1, 3]) → 4 maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6 maxSpan([1, 4, 2, 1, 4, 4, 4])
 * → 6
 *
 * <p>References 1) https://codingbat.com/prob/p189576 2)
 * https://techdevguide.withgoogle.com/paths/foundational/maxspan-problem-return-largest-span-array/#!
 */
public class MaxSpan {
  public static void main(String[] args) {
    MaxSpan maxSpan = new MaxSpan();
    System.out.println(maxSpan.maxSpan(new int[] {1, 2, 1, 1, 3}));
  }

  public int maxSpan_optimized(int[] nums) {
    int highestSpan = nums.length == 0 ? 0 : 1;
    Map<Integer, Integer> firstOccurrenceMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer firstOccurrence = firstOccurrenceMap.get(nums[i]);
      if (firstOccurrence == null) {
        firstOccurrenceMap.put(nums[i], i);
      } else {
        highestSpan = Math.max(highestSpan, i - firstOccurrence + 1);
      }
    }
    return highestSpan;
  }

  public int maxSpan(int[] nums) {
    int span = 0;
    int tmp = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          tmp = j - i + 1;
          span = Math.max(tmp, span);
        }
      }
    }
    return span;
  }
}

//        Expected	Run
//        maxSpan([1, 2, 1, 1, 3]) → 4	4	OK
//        maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6	6	OK
//        maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6	6	OK
//        maxSpan([3, 3, 3]) → 3	3	OK
//        maxSpan([3, 9, 3]) → 3	3	OK
//        maxSpan([3, 9, 9]) → 2	2	OK
//        maxSpan([3, 9]) → 1	1	OK
//        maxSpan([3, 3]) → 2	2	OK
//        maxSpan([]) → 0	0	OK
//        maxSpan([1]) → 1	1	OK
//        other tests
//        OK
//
//        All Correct
