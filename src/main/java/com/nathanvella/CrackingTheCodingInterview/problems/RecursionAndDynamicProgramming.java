package com.nathanvella.CrackingTheCodingInterview.problems;

public class RecursionAndDynamicProgramming {

  // Fibonacci Sequence
  public int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  // Greatest Common Divisor
  public int gcd(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    } else {
      return gcd(n2, n1 % n2);
    }
  }

}
