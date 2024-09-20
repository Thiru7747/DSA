package com.dsa.arrays;

public class SplitTheArray {

	public static void main(String[] args) {

		int nums[] = {6,1,3,1,1,8,9,2};
		boolean isPossible = isPossibleToSplit(nums);
		System.out.println(isPossible);
	}

	public static boolean isPossibleToSplit(int[] nums) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int count2 = 0;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					count2++;
					if(count2 >= 2) {
						return false;
					}
				}
			}
		}
		System.out.println(count);
		if (count == nums.length - 1) {
			return false;

		}
		return true;
	}

}
