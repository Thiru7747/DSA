package com.dsa.arrays;

public class TwoPointer {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,7,10,11,19,20};
		int target = 7;
        int solArr[] = getTheIndicesOfTwoNumbers(arr, target);
        for (int i = 0; i < solArr.length; i++) {
			System.out.print(solArr[i]+",");
		}
	}

	private static int[] getTheIndicesOfTwoNumbers(int[] arr, int target) {
		int[] result = new int[2];
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high] == target) {
				result[0] = low;
				result[1] = high;	
				return result;
			}else if(arr[low]+arr[high] > target) {
				high--;
			}else {
				low++;
			}
		}

		return new int[]{};
	}

}
