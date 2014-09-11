package com.fsakura.sort;

public class Main {
  public static void main(String[] args) {
    InsertionSort is = new InsertionSort();
    int[] arr = { 1, 5, 6, 2, 4, 5, 7, 7, 34, 3, 79, 25, 26, 19, -1, 4 };
    is.sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println("");
  }
}
