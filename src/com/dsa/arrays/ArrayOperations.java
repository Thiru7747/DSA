package com.dsa.arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 7 };
		arrayTraversal(arr);
		int pos = findPosition(arr, 6);
		System.err.println("position of the element :" + pos);
//		deleteElement(arr, 3);

	}
	
private static void deleteElement(int[] arr, int position) {
	int n = arr.length;
		if(position < 0) {
			System.out.println("elemet not found");
		}else {
			for (int i = position; i < n - 1; i++) {
				arr[i] = arr[i+1];
			}
			n = n -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

//	Find the position of element
	private static int findPosition(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

//	Array traversal involves visiting all the elements of the array once.
//	Below is the implementation of Array traversal in different Languages
	private static void arrayTraversal(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
