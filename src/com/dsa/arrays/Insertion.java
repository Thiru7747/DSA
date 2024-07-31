package com.dsa.arrays;

public class Insertion {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
		int element = 34;
		int index = 5;
		int capacity = 10;
//		int addedIndex = insertionAtEnd(arr, element, capacity, index);
//		System.out.println("after insertion");
//		for (int i = 0; i < addedIndex; i++) {
//			System.out.print(arr[i]+",");
//		}
//		System.out.println();
		
		
		int position = 3;
		insertAtAnyPosition(arr, position, element, index);
		index+=1;
		for (int j = 0; j < index; j++) {
			System.out.print(arr[j]+",");
		}
		
		
		
	}

	private static void insertAtAnyPosition(int[] arr, int position, int element, int index) {
		int temp;
		if(position > arr.length) {
			System.out.println("out of the index");
		}else {
			for(int i = index; i >= position; i-- ) {
				arr[i+1] = arr[i];
			}
			arr[position] = element;
		}
		
	}

	private static int insertionAtEnd(int[] arr, int element, int capacity, int index) {
		if(index >= capacity) {
			return index;
		}
		arr[index] = element;
		return index+1;
	}

}
