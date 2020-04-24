package com.nathanvella.CrackingTheCodingInterview.algorithms.sort;

import java.util.Arrays;

/**
 * Quick Sort Implementation O(n log n)
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {2, 8, 1, 6, 4, 9, 7, 3, 5};
    System.out.print("Unsorted: ");
    System.out.println(Arrays.toString(arr));

    quickSort(arr, 0, arr.length - 1);

    System.out.print("Sorted:   ");
    System.out.println(Arrays.toString(arr));
  }

  public static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

  private static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;

        int swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
      }
    }

    int swapTemp = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = swapTemp;

    return i + 1;
  }

}
