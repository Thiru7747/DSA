package com.dsa.arrays;

import java.util.Stack;

public class RotateArray {
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		int n= arr.length;
		int d = 2;
		
		rotateArr(arr, d, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void rotateArr(int[] arr, int d, int n) {
			while(d>0) {
			 int temp = arr[0];
			 int index = n-1;
			 for (int j = 0; j < index; j++) {
				arr[j] = arr[j+1];
			}
			 arr[arr.length-1] = temp;
			 d--;
			}		
		}
		
	}
	

