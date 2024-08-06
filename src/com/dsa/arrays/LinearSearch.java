package com.dsa.arrays;

public class LinearSearch {
	
/*
 * Time Complexity:
 *Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
 *Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
 *Average Case: O(N)
 * */	
	
	public static void main(String[] args) {
		int arr [] = {1,3,5,8,4};
		int element = 5;
		int poistion = getPosition(arr, element);
		System.out.println("position of the element: "+poistion);
	}

	private static int getPosition(int[] arr, int element) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
