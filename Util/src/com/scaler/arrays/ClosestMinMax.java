package com.scaler.arrays;

public class ClosestMinMax {

	public static int solve(int[] A) {
        int min = A[0];
        int max = A[0];

        for(int i = 0; i < A.length; i++) {
            if(min > A[i]) {
                min = A[i];
            } else if(max < A[i]) {
                max = A[i];
            }
        }

        int last_min = -1;
        int last_max = -1;
        int minL = Integer.MAX_VALUE;
        int minT = minL;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == min) {
                last_min = i;
            } else if(A[i] == max) {
                last_max = i;
            }

            if((last_max != -1 && last_min != -1) && last_max > last_min)
                minT = last_max - last_min + 1;
            else if(last_min > last_max && (last_max != -1 && last_min != -1))
                minT = last_min - last_max + 1;

            if(minL > minT)
                minL = minT;
        }        
        
        return minL;
    }
	
	public static void main(String[] args) {
		System.out.println(solve(new int[] {814, 761, 697, 483, 981}));
		
		System.out.println(solve(new int[] {377, 448, 173, 307, 108}));
		
		System.out.println(solve(new int[] {4, 4, 4, 4, 4, 4, 4}));
	}
	
}
