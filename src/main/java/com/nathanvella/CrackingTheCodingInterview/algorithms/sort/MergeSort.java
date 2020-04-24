package com.nathanvella.CrackingTheCodingInterview.algorithms.sort;

import java.util.Arrays;

/**
 * Merge Sort Implementation : O(n log n)
 */
public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {2, 8, 1, 6, 4, 9, 7, 3, 5};
    System.out.print("Unsorted: ");
    System.out.println(Arrays.toString(arr));

    mergeSort(arr, arr.length);

    System.out.print("Sorted:   ");
    System.out.println(Arrays.toString(arr));
  }

  static void mergeSort(int[] arr, int len) {
    if (len < 2) {
      return;
    }

    int mid = len / 2;
    int[] l = new int[mid];
    int[] r = new int[len - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = arr[i];
    }

    for (int i = mid; i < len; i++) {
      r[i - mid] = arr[i];
    }

    mergeSort(l, mid);
    mergeSort(r, len - mid);

    merge(arr, l, r, mid, len - mid);
  }

  static void merge(int[] a, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      } else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }

}
