package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementsThreePointer {
	
	public static void main(String[] args) {
		int A []= {1, 5, 10, 20, 30};
		int B []= {5, 13, 15, 20};
		int C []= {5, 20};

		ArrayList<Integer> commonElements = getCommonElements(A, B, C);
		
		System.out.println(commonElements);
	}

	private static ArrayList<Integer> getCommonElements(int[] A, int [] B,
			int [] C) {
		ArrayList<Integer> commonEle = new ArrayList<>();
		int i=0, j=0, k=0;
		while(i<A.length && j<B.length && k<C.length) {
			
			if((A[i] == B[j]) && (B[j] == C[k])) {
				commonEle.add(A[i]);
				i++;j++;k++;
				if((i<A.length) && (A[i]) == A[i-1]) i++;
				if((j<B.length) && (B[j]) == B[j-1]) j++;
				if((k<C.length) && (C[k]) == C[k-1]) k++;
			}else if(A[i]<B[j]) i++;
			else if(B[j]<C[k]) j++;
			else k++;
		}
		
		return commonEle;
	}

}
