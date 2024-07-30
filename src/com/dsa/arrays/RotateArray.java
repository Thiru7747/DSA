package com.dsa.arrays;

import java.util.Stack;

public class RotateArray {
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		int n= arr.length;
		int d = 2;
		
		rotateArr(arr, d, n);
	}

	private static void rotateArr(int[] arr, int d, int n) {
		Stack<Integer> stack = new Stack<>();
		for (int element : arr) {
			stack.push(element);
		}
		
		for (Integer element : stack) {
			if(d > 0) {
			int popEle = stack.pop();
			stack.push(popEle);
			d--;
			}
		}
System.out.println(stack);
		
	}
	
	

}
