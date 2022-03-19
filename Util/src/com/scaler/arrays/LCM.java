package com.scaler.arrays;

public class LCM {

	public static void main(String[] args) {
		System.out.println(solve(13, 17));
	}
	
    public static int solve(int A, int B) {
        int min = 0, max = 0;
        min = (A < B ? A : B);
        max = (min == A ? B : A);
        //int lcm = 0;
        for(int i = 2; i < max; i++){
        	int mul = min * i;
        	if(mul%max == 0)
        		return mul;        	
        }
        return A*B;
    }

	
}
