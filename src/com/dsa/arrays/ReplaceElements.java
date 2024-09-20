//package com.dsa.arrays;
////not copleted and working
//public class ReplaceElements {
//
//    public static void main(String[] args) {
//
//        int nums[] = {1, 2, 4, 6};
//        int operations[][] = {{1, 3}, {4, 7}, {6, 1}};
//        int replacedArr[] = replacedArr(nums, operations);
//        for (int i = 0; i < replacedArr.length; i++) {
//            System.out.print(replacedArr[i] + ",");
//        }
//    }
//
//    private static int[] replacedArr(int[] nums, int[][] operations) {
//
//        for (int[] operation : operations) {
//            int start = operation[0];
//            int end = operation[1];
//            for (int i = start; i <= end; i++) {
//                if (i < nums.length) { // Check if index is within bounds
//                    nums[i] = end;
//                }
//            }
//        }
//        return nums;
//    }
//}
