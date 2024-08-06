package com.dsa.arrays;

/*
 * Binary Search Algorithm:
    Below is the step-by-step algorithm for Binary Search:

	Divide the search space into two halves by finding the middle index “mid”. 
	Compare the middle element of the search space with the key. 
	If the key is found at middle element, the process is terminated.
	If the key is not found at middle element, choose which half will be used as the next search space.
	If the key is smaller than the middle element, then the left side is used for next search.
	If the key is larger than the middle element, then the right side is used for next search.
    This process is continued until the key is found or the total search space is exhausted.
 * 
 * 
 * 
 * 
 * Time Complexity: 
	Best Case: O(1)
	Average Case: O(log N)
	Worst Case: O(log N)
	Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).
 * 

 * 
 * */

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int element = 1;
		int low = 0;
		int high = arr.length - 1;
		int position = getPosition(arr, element, low, high);
		System.out.println("position  of the element: " + position);
	}

	private static int getPosition(int[] arr, int element, int low, int high) {
		if (high < low) {
			return -1;
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (element == arr[mid]) {
				return mid;
			}
			if (element < arr[mid]) {
				high = mid - 1;
			}
			if (element > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
