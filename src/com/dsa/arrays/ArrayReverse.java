package com.dsa.arrays;

import java.util.Iterator;
import java.util.Stack;

public class ArrayReverse {

	public static void main(String[] args) {
		int originalArr[] = { 1, 2, 3, 4, 5 };
		reversedWithExtraArray(originalArr);
		reversedWithTwoPointer(originalArr, 0, originalArr.length - 1);
		reversedWithRecursion(originalArr, 0, originalArr.length - 1);
		reversedWithStack(originalArr);
	}

	/*
	 * Time Complexity: O(n) Auxiliary Space Complexity: O(n)
	 */
	private static void reversedWithStack(int[] originalArr) {
		Stack<Integer> stack = new Stack<>();
		for (int element : originalArr) {
			stack.push(element);
		}

		for (int i = 0; i < originalArr.length; i++) {
			originalArr[i] = stack.pop();
		}

		System.out.print("reversedWithStack : ");
		for (int i : originalArr) {
			System.out.print(i + ",");
		}
		System.out.println();

	}

	/*
	 * Time Complexity: O(n) Auxiliary Space Complexity: O(n)
	 */
	private static void reversedWithRecursion(int[] originalArr, int start, int end) {
		int temp;
		if (start >= end) {
			return;
		}
		temp = originalArr[start];
		originalArr[start] = originalArr[end];
		originalArr[end] = temp;
		reversedWithRecursion(originalArr, start + 1, end - 1);

		System.out.print("reversedWithRecursion : ");
		for (int i : originalArr) {
			System.out.print(i + ",");
		}
		System.out.println();

	}

	/*
	 * Time Complexity: O(n) Auxiliary Space Complexity: O(1)
	 */
	private static void reversedWithTwoPointer(int[] originalArr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = originalArr[start];
			originalArr[start] = originalArr[end];
			originalArr[end] = temp;
			start++;
			end--;
		}

		System.out.print("reversedWithTwoPointer : ");
		for (int i : originalArr) {
			System.out.print(i + ",");
		}
		System.out.println();

	}

	/*
	 * Time Complexity: O(n) Auxiliary Space Complexity: O(n)
	 */
	private static void reversedWithExtraArray(int[] originalArr) {
		int reversedArr[] = new int[originalArr.length];
		for (int i = 0; i < originalArr.length; i++) {
			reversedArr[i] = originalArr[originalArr.length - i - 1];
		}

		System.out.print("reversedWithExtraArray : ");
		for (int i : reversedArr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
