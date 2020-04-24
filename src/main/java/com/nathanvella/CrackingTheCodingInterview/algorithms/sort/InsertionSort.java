package com.nathanvella.CrackingTheCodingInterview.algorithms.sort;

import java.util.Arrays;

/**
 * Insertion Sort Implementation : O(n^2)
 */
public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {2, 8, 1, 6, 4, 9, 7, 3, 5};
    System.out.print("Unsorted: ");
    System.out.println(Arrays.toString(arr));

    insertionSort(arr);

    System.out.print("Sorted:   ");
    System.out.println(Arrays.toString(arr));
  }

  static void insertionSort(int[] arr) {
    int len = arr.length;
    for (int i = 1; i < len; i++) {
      int key = arr[i];
      int j = i - 1;
      while ((j > -1) && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
}
