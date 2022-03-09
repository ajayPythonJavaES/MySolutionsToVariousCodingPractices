package com.leetcode.arrays;

public class RichestCustomerWealth {

	public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
	
	public static void main(String[] args) {
		maximumWealth(new int[][] {{1,2,3},{2,1,5}});
	}
}
