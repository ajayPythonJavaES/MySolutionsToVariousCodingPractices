package com.scaler.arrays;

public class RemoveElementToMakeEvenOddIndexSumEqual {
	public static int solveNonOptimized(int[] A) {
		
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			int in_arr[] = new int[A.length - 1];
			int t = 0;
			for(int l = 0; l < A.length; l++) {
				if(l != i) {
					in_arr[t++] = A[l];
				}
			}
			int even = 0, odd = 0;
			for(int c = 0; c < in_arr.length; c++) {
				if(c%2 == 0) {
					even += in_arr[c];
				} else {
					odd += in_arr[c];
				}
			}
			
			if(even == odd)
				count++;			
		}		

		return count;
	}

	public static int solve(int A[]) {
		int sum_even = 0, evenSum = 0, sum_odd = 0, oddSum = 0;
		
		for(int i = 0; i < A.length; i++) {
			if(i%2 == 0)
				sum_even += A[i];
			else
				sum_odd += A[i];
		}
		
		evenSum = sum_even;
		oddSum = sum_odd;
		
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			if(i%2 == 0)
				sum_odd = sum_odd - A[i];
			else
				sum_even = sum_even - A[i];
			
			if(sum_even == sum_odd)
				count++;
			
			sum_even = evenSum;
			sum_odd = oddSum;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		//System.out.println(solveNonOptimized(new int[] { 1, 1, 1}));
		System.out.println(solve(new int[]{2, 1, 6, 4}));
	}

}
