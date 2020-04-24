package com.nathanvella.CrackingTheCodingInterview.algorithms.sort;

import java.util.Arrays;

/**
 * Quick Sort Implementation O(n^2) slower than Insertion Sort
 */
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {2, 8, 1, 6, 4, 9, 7, 3, 5};
    System.out.print("Unsorted: ");
    System.out.println(Arrays.toString(arr));

    selectionSearchAscending(arr);

    System.out.print("Sorted:   ");
    System.out.println(Arrays.toString(arr));
  }

  public static void selectionSearchAscending(final int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minElementIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minElementIndex] > arr[j]) {
          minElementIndex = j;
        }
      }

      if (minElementIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minElementIndex];
        arr[minElementIndex] = temp;
      }
    }
  }

  public static void selectionSearchDescending(final int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int maxElementIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[maxElementIndex] < arr[j]) {
          maxElementIndex = j;
        }
      }

      if (maxElementIndex != i) {
        int temp = arr[i];
        arr[i] = arr[maxElementIndex];
        arr[maxElementIndex] = temp;
      }
    }
  }

}
