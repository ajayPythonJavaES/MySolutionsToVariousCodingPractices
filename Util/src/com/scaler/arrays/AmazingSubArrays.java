package com.scaler.arrays;

public class AmazingSubArrays {

	public static void main(String[] args) {
		System.out.println(solve("abec"));
		
		System.out.println(solve("abc"));

		String str = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";

		System.out.println(solve(str));
		
		System.out.println("SolveOptimal: " + solveOptimal(str));
	}

	public static int solve(String A) {
		A = A.toUpperCase();
		int finalCount = 0;
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == 'A' || A.charAt(i) == 'O' || A.charAt(i) == 'U' || A.charAt(i) == 'E' || A.charAt(i) == 'I') {
				int count = 1;				
				for(int j = i + 1; j < A.length(); j++)
					count++;
				finalCount += count;
			}
		}
		
		return finalCount % 10003;
	}

	public static int solveOptimal(String A) {
		A = A.toUpperCase();
		int finalCount = 0;
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == 'A' || A.charAt(i) == 'O' || A.charAt(i) == 'U' || A.charAt(i) == 'E' || A.charAt(i) == 'I') {
				finalCount += A.length() - i;
			}
		}
		return finalCount % 10003;
	}
	
}
