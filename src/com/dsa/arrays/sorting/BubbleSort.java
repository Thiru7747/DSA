package com.dsa.arrays.sorting;

import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);

	}
	
	private static void bubbleSort(int[] arr, int n) {
		
		boolean swapped;
		for (int i = 0; i < arr.length-1; i++) {
//			swapped = false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
//					swapped = true;
				}
			}
//			if(swapped == false) break;
		}
		
	}

	static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
