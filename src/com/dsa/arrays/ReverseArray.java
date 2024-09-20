package com.dsa.arrays;

import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = arr.length - 1;
		reverseArray(arr, start, end);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	private static void reverseArray(int[] arr, int start, int end) {

		int temp;
		if (start > end) {
			return;
		}
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		reverseArray(arr, start, end);

	}

}
