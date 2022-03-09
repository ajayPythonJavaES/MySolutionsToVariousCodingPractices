package com.leetcode.arrays;

public class RunningSum {

	public static int[] runningSum(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i == 0)
                nums[i] = nums[i];
            else
                nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
	
	public static void main(String[] args) {
		runningSum(new int[] {1,2,3,4});
	}
	
}
