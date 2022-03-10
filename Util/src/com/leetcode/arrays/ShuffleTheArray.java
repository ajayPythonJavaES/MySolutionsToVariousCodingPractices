package com.leetcode.arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		shuffle(new int[] {1,2,3,4,5,6}, 3);
	}
	
	public static int[] shuffle(int[] nums, int n) {
        for(int i = n; i < nums.length; i++) {
            nums[i] = (nums[i] * 10000) + nums[i - n];
        }
        
        for(int i = 0; i < nums.length; i += 2) {
            nums[i] = nums[n] % 10000;
            nums[i + 1] = nums[n]/10000;
            n++;
        }
        return nums;
    }
}
