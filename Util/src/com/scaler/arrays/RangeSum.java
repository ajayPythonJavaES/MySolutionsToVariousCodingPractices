package com.scaler.arrays;

public class RangeSum {

	 public long[] rangeSum(int[] A, int[][] B) {
	        long PF[] = new long[A.length + 1];
	        PF[0] = 0;
	        for(int i = 1; i <= A.length; i++) {
	            PF[i] = PF[i - 1] + A[i - 1];
	        }

	        long ret[] = new long[B.length];
	        for(int i = 0; i < B.length; i++) {
	            int s = B[i][0];
	            int e = B[i][1];	            
	            ret[i] = PF[e] - PF[s - 1];

	        }        

	        return ret;
	    }
	
	 	public static void main(String[] args) {
			RangeSum range = new RangeSum();
			long rangeAr[] = range.rangeSum(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 4}, {2, 3}});
			for(int i = 0; i < rangeAr.length; i++) {
				System.out.print(rangeAr[i] + " ");
			}
			
		}
	 
}
