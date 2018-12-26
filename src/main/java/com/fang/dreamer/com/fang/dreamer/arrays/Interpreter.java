package com.fang.dreamer.com.fang.dreamer.arrays;

/**
 * Write a simple interpreter which understands "+", "-", and "*" operations. Apply the operations
 * in order using command/arg pairs starting with the initial value of `value`. If you encounter an
 * unknown command, return -1.
 *
 * <p>interpret(1, ["+"], [1]) → 2 interpret(4, ["-"], [2]) → 2 interpret(1, ["+", "*"], [1, 3]) → 6
 *
 * <p>References : 1) https://codingbat.com/prob/p294185 2)
 * https://techdevguide.withgoogle.com/paths/foundational/interpreter-problem-for-java/#!
 */
public class Interpreter {

    /**
     * For the give commands and args with provided initial value, design interpreter.
      * @param value
     * @param commands
     * @param args
     * @return
     */
  public int interpret(int value, String[] commands, int[] args) {
    for (int i = 0; i < commands.length; i++) {
      if (commands[i] == "+") value = value + args[i];
      else if (commands[i] == "-") value = value - args[i];
      else if (commands[i] == "*") value = value * args[i];
      else return -1;
    }
    return value;
  }
}


//        Expected	Run
//        interpret(1, ["+"], [1]) → 2	2	OK
//        interpret(4, ["-"], [2]) → 2	2	OK
//        interpret(1, ["+", "*"], [1, 3]) → 6	6	OK
//        interpret(3, ["*"], [4]) → 12	12	OK
//        interpret(0, ["?"], [4]) → -1	-1	OK
//        interpret(1, ["+", "*", "-"], [1, 3, 2]) → 4	4	OK
//        other tests
//        OK
//
//        All Correct