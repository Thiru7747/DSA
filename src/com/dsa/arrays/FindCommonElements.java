package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonElements {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 10, 20, 30));
		ArrayList<Integer> B = new ArrayList<>(List.of(5, 13, 15, 20));
		ArrayList<Integer> C = new ArrayList<>(List.of(5, 20));

		ArrayList<Integer> commonElements = getCommonElements(A, B, C);
		
		System.out.println(commonElements);
	}

	private static ArrayList<Integer> getCommonElements(ArrayList<Integer> a, ArrayList<Integer> b,
			ArrayList<Integer> c) {

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer ele : a) {
			map.put(ele, 1);
		}

		for (Integer ele : b) {
			if (map.containsKey(ele) && map.get(ele) == 1) {
				map.put(ele, 2);
			}
		}

		for (Integer ele : c) {
			if (map.containsKey(ele) && map.get(ele) == 2) {
				map.put(ele, 3);
			}
		}
		
		ArrayList<Integer> commonElements = new ArrayList<>();
		for (Integer ele : map.keySet()) {
			if(map.get(ele) == 3) {
				commonElements.add(ele);
			}
			
		}
		return commonElements;
	}

}
