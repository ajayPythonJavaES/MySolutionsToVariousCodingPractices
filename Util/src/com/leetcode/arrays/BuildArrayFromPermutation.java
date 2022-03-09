package com.leetcode.arrays;

public class BuildArrayFromPermutation {

	public static int[] buildArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums.length;
		}
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] + (nums[nums[i]/nums.length])/nums.length;
		}
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]%nums.length;
		}
		return nums;
	}

	public static void main(String[] args) {
		buildArray(new int[] {3, 1, 4, 6, 5, 0, 2});
		
		
	}

}
