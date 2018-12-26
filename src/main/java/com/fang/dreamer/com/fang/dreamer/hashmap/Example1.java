package com.fang.dreamer.com.fang.dreamer.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different
 * string in the array, always with the value 0. For example the string "hello" makes the pair
 * "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
 *
 * <p>word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0} word0(["a", "b", "a", "c", "b"]) → {"a": 0,
 * "b": 0, "c": 0} word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 *
 * <p>References : 1) https://codingbat.com/prob/p152303 2)
 * https://techdevguide.withgoogle.com/paths/foundational/word-zero-problem-warmup/#!
 */
public class Example1 {

  public static void main(String[] args) {
    System.out.println(word0(new String[] {"a", "b", "a", "b"}));
  }

  public static Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < strings.length; i++) {
      map.put(strings[i], 0);
    }
    return map;
  }
}
