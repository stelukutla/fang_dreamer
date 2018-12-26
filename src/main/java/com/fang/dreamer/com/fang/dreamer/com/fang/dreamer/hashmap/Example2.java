package com.fang.dreamer.com.fang.dreamer.com.fang.dreamer.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String> as follows: for each
 * string add its first character as a key with its last character as the value.
 *
 * <p>pairs(["code", "bug"]) → {"b": "g", "c": "e"} pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 *
 * References :
 * 1) https://codingbat.com/prob/p126332
 * 2) https://techdevguide.withgoogle.com/paths/foundational/pairs-problem-classic-algorithm-hard/#!
 */
public class Example2 {
    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map  = new HashMap<String, String>();
        for(int i = 0 ; i < strings.length ; i++ ){
            map.put(Character.toString(strings[i].charAt(0)),Character.toString(strings[i].charAt(strings[i].length()-1)));
        }
        return map;
    }

}


//        Expected	Run
//        pairs(["code", "bug"]) → {"b": "g", "c": "e"}	{"b": "g", "c": "e"}	OK
//        pairs(["man", "moon", "main"]) → {"m": "n"}	{"m": "n"}	OK
//        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}	{"g": "d", "m": "n", "n": "t"}	OK
//        pairs([]) → {}	{}	OK
//        pairs(["a", "b"]) → {"a": "a", "b": "b"}	{"a": "a", "b": "b"}	OK
//        pairs(["are", "codes", "and", "cods"]) → {"a": "d", "c": "s"}	{"a": "d", "c": "s"}	OK
//        pairs(["apple", "banana", "tea", "coffee"]) → {"a": "e", "b": "a", "c": "e", "t": "a"}	{"a": "e", "b": "a", "c": "e", "t": "a"}	OK
//        other tests
//        OK
//
//        All Correct