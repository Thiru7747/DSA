package com.dsa.arrays;

/*
 * Create a recursive function and compare the mid of the search space with the key. 
 * And based on the result either return the index where the key is found
 *  or call the recursive function for the next search space.
 * 
 * */

public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int element = 6;
		int low = 0;
		int high = arr.length - 1;
		int position = getPosition(arr, element, low, high);
		System.out.println("position  of the element: " + position);
	}

	private static int getPosition(int[] arr, int element, int low, int high) {
		if(low > high) {
			return -1;
		}
		
		int mid = (low+high)/2;
		if(arr[mid] == element) {
			return mid;
		}
		if(arr[mid] < element) {
			return getPosition(arr, element, mid+1, high);
		}else if(arr[mid] > element){
			return getPosition(arr, element, low, mid-1);
		}
		return -1;
	}

}
