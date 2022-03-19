package com.scaler.arrays;

import java.util.Arrays;

public class ColumnSum {

	public static void main(String[] args) {
		int x[] = solve(new int[][] {{1,2,3,4},{2,3,4,5},{3,4,5,6}});
		Arrays.asList(x).forEach(m -> {
			System.out.println(m);
		});
	}
	
	public static int[] solve(int[][] A) {
		int rows = A.length - 1;
		int[] col_sum = new int[A[rows].length];
        for(int i = 0; i < A[rows].length; i++) {
            int sum = 0;
            for(int j = 0; j < A.length; j++) {
            	sum += A[j][i];
            }
            col_sum[i] = sum;
        }
        return col_sum;
    }
	
}
