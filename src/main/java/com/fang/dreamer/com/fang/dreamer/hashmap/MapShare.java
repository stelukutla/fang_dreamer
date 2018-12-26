package com.fang.dreamer.com.fang.dreamer.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.


 mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

 References :
 1) https://codingbat.com/prob/p148813
 2) https://techdevguide.withgoogle.com/paths/foundational/mapshare-problem-return-given-map/#!
 */
public class MapShare {

  public static void main(String[] args) {
      Map<String, String> map = new HashMap<String, String>();
      map.put("a", "aaa");
      map.put("b", "bbb");
      map.put("c", "ccc");

    System.out.println(mapShare(map).toString());
  }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b",map.get("a"));
        }
        if(map.containsKey("c")){
            map.remove("c");
        }
        return map;
    }

}


//        Expected	Run
//        mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}	{"a": "aaa", "b": "aaa"}	OK
//        mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}	{"b": "xyz"}	OK
//        mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}	{"a": "aaa", "b": "aaa", "d": "hi"}	OK
//        mapShare({"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"}) → {"a": "xyz", "b": "xyz", "z": "zzz"}	{"a": "xyz", "b": "xyz", "z": "zzz"}	OK
//        mapShare({"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"}) → {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}	{"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}	OK
//        other tests
//        OK