package com.scaler.arrays; 

public class ReverseTheGivenArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int temp = 0;
        for(int i = 0, j = A.length - 1; i < A.length && j > 0; i++, j--) {
            if(i < j) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}
