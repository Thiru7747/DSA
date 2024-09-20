package com.dsa.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
//		int majorityElement = getMajorityElement(arr);
		int majorityElement = getMajorityElementUsingMap(arr);
		if (majorityElement == -1)
			System.out.println("Majoirty element not found");
		else
			System.out.println("Majoirty element : " + majorityElement);
	}

	private static int getMajorityElementUsingMap(int[] nums) {
		HashMap<Integer, Integer> countMap = new HashMap<>();
		int majorityCount = nums.length / 2;
		for (int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
			if (countMap.get(num) > majorityCount) {
				return num;
			}
		}
		return -1;
	}

	private static int getMajorityElement(int[] arr) {
		int index = -1;
		int maxcount = 0;
		int majorityElement = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
				if (count > arr.length / 2) {
					return arr[i];
				}
			}
		}
		return -1;
//		if (maxcount > arr.length / 2)
//			majorityElement = arr[index];
//		return majorityElement;
	}

}
