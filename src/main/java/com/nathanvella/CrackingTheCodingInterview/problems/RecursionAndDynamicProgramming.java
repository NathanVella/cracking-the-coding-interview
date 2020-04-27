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

  // Towers of Hanoi
  public void towersOfHanoi(int n, char from, char mid, char to) {
    if (n == 1) {
      System.out.println(String.format("Disk 1 from %s to %s.", from, to));
    } else {
      towersOfHanoi(n - 1, from, to, mid);
      System.out.println(String.format("Disk %s from %s to %s", n, from, to));
      towersOfHanoi(n - 1, mid, from, to);
    }
  }

}
