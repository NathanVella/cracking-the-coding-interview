package com.nathanvella.CrackingTheCodingInterview.algorithms.sort;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {2,8,1,6,4,9,7,3,5};
    System.out.print("Unsorted:");
    System.out.println(Arrays.toString(arr));

    bubbleSort(arr);

    System.out.print("Sorted:  ");
    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

}
