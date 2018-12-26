package com.fang.dreamer;

/**
 * public int blackjack(int a, int b) { if( a > 21 ){ if( b <=21) return b; else return 0; }else if
 * (b > 21){ if(a <=21) return a; else return 0; }else if (a <=21 && a <= 21){ if(a > b) return a;
 * else return b; }else return 0; }
 *
 * <p>References : https://codingbat.com/prob/p117019
 * https://techdevguide.withgoogle.com/paths/foundational/software-debugging-warmup/#!
 */
public class Blackjack {
  public static void main(String[] args) {
    System.out.println(blackjack(21,25));

  }

  public static int blackjack_optimized(int a, int b){
      if(a <= 21 &&  b <=21){
          if( a > b) return  a;
          else return  b;

      }else if (a >= 21 || b >= 21){
          if (a <= 21 )
                  return a;
          else return  b;
      }

      else return 0;
  }

    /**
     * Find the find the blackjack from the given two numbers.
     * @param a
     * @param b
     * @return
     */
  public static int blackjack(int a, int b) {
    if (a > 21) {
      if (b <= 21) return b;
      else return 0;
    } else if (b > 21) {
      if (a <= 21) return a;
      else return 0;
    } else if (a <= 21 && a <= 21) {
      if (a > b) return a;
      else return b;
    } else return 0;
  }
}

//
//        blackjack(19, 21) → 21	21	OK
//        blackjack(21, 19) → 21	21	OK
//        blackjack(19, 22) → 19	19	OK
//        blackjack(22, 19) → 19	19	OK
//        blackjack(22, 50) → 0	0	OK
//        blackjack(22, 22) → 0	0	OK
//        blackjack(33, 1) → 1	1	OK
//        blackjack(1, 2) → 2	2	OK
//        blackjack(34, 33) → 0	0	OK
//        blackjack(17, 19) → 19	19	OK
//        blackjack(18, 17) → 18	18	OK
//        blackjack(16, 23) → 16	16	OK
//        blackjack(3, 4) → 4	4	OK
//        blackjack(3, 2) → 3	3	OK
//        blackjack(21, 20) → 21	21	OK
//        other tests
//        OK