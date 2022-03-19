package com.scaler.arrays;

public class Bulbs {

	public static void main(String[] args) {
		bulbs(new int[] {1,0,0,1});
	}
	
	public static int bulbs(int[] A) {
		int switches = 0;
		if(A.length != 0) {
            if(A[0] == 0)
                switches++;
            for(int i = 1; i < A.length; i++) {
                if(A[i] != A[i - 1])
                    switches++;
            }
        }
		return switches;
	}
	
	
}
