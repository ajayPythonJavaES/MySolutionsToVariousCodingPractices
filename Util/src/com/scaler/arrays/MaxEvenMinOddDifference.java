package com.scaler.arrays;

public class MaxEvenMinOddDifference {
    public int solve(int[] A) {
        int max_even = Integer.MIN_VALUE;
        int min_odd = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                max_even = (A[i] > max_even) ? A[i] : max_even;
            } else {
                min_odd = (A[i] < min_odd) ? A[i] : min_odd;
            }
        }

        return max_even - min_odd;

    }
    
    public static void main(String[] args) {
    	MaxEvenMinOddDifference diff = new MaxEvenMinOddDifference();
    	int k = diff.solve(new int[] {74, 9, 51, 51, 75, 0, 35, 89, 96, 77});
    	System.out.println("Difference: " + k);
	}
}
