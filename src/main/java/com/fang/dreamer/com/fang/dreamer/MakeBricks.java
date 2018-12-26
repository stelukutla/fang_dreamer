package com.fang.dreamer.com.fang.dreamer;

/**
 We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


 makeBricks(3, 1, 8) → true
 makeBricks(3, 1, 9) → false
 makeBricks(3, 2, 10) → true

 References :
 https://codingbat.com/prob/p183562
 https://techdevguide.withgoogle.com/paths/foundational/makebricks-problem/#!
 */
public class MakeBricks {
  public static void main(String[] args) {
    System.out.println(makeBricks(7, 1, 8));
  }

  public static boolean makeBricks(int small, int big, int goal) {
    int temp_goal;
    if (goal >= big * 5) {
      temp_goal = big * 5;
      if (temp_goal + small >= goal) return true;
    } else {
      if (goal % 5 <= small) return true;
    }
    return false;
  }
}
