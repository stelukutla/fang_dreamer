package com.fang.dreamer.com.fang.dreamer.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a function that replaces the words in `raw` with the words in `code_words` such that the
 * first occurrence of each word in `raw` is assigned the first unassigned word in `code_words`.
 *
 * <p>encoder(["a"], ["1", "2", "3", "4"]) → ["1"] encoder(["a", "b"], ["1", "2", "3", "4"]) → ["1",
 * "2"] encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]
 *
 * <p>References : 1) https://codingbat.com/prob/p238573 2)
 * https://techdevguide.withgoogle.com/paths/foundational/encoder-problem-hard/#!
 */
public class Encoder {

    /**
     * Encode the raw string with the gives code words.
      * @param raw
     * @param code_words
     * @return
     */
      public String[] encoder(String[] raw, String[] code_words) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < raw.length; i++) {
          if (!map.containsKey(raw[i])) {
            map.put(raw[i], code_words[i]);
          }

          list.add(map.get(raw[i]));
        }
        return list.toArray(new String[0]);
      }
}

//
//        Expected	Run
//        encoder(["a"], ["1", "2", "3", "4"]) → ["1"]	["1"]	OK
//        encoder(["a", "b"], ["1", "2", "3", "4"]) → ["1", "2"]	["1", "2"]	OK
//        encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]	["1", "2", "1"]	OK
//        encoder(["a", "a"], ["1", "2", "3", "4"]) → ["1", "1"]	["1", "1"]	OK
//        encoder(["a", "b", "b"], ["1", "2", "3", "4"]) → ["1", "2", "2"]	["1", "2", "2"]	OK
//        encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]	["1", "2", "1"]	OK
//        encoder(["a", "b", "c"], ["1", "2", "3", "4"]) → ["1", "2", "3"]	["1", "2", "3"]	OK
//        other tests
//        OK
//
//        All Correct