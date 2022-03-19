package com.scaler.arrays;

public class MagicNumber {

	public static void main(String[] args) {
		System.out.println(solve(10));
	}
	
	public static int solve(int A) {
		int pow = 1;
        int ans = 0;
        while(A > 0) {
            pow = pow * 5;
            if((int)(A&1) == 1)
                ans += pow;
            A = A>>1;
        }
        return ans;
    }
}
