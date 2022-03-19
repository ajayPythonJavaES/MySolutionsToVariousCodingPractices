package com.scaler.arrays;

import java.util.List;

public class EvenSubarrays {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {2,4,6,8,1}));
		System.out.println(simple(new int[] {2,3,5,10}));
		//System.out.println(solve(new int[] { 540, 881, 266, 917, 768, 245, 646, 197, 709, 778, 540, 54 }));
	}
	
	public static String solve(int[] A) {
        int k = 2;
        boolean flag = true;
        for(int i = 0; i < A.length; i+=k) {
            if(A.length % k == 0) {
                for(int j = i; j < A.length; j+=k) {
                    if(A[j]%2 == 0 || ((j + k - 1) < A.length && A[j + k - 1]%2 == 0))
                        flag = false;
                }
            }
            k += 2;
        }
        if(A.length%2 == 0 && (A[0]%2 != 0 || A[A.length - 1]%2 != 0)) 
            flag = true;
        if(flag)
            return "NO";
        else
            return "YES";
    }
	
	public static String simple(int[] A) {
		if(A.length%2 == 0 && A[0]%2 == 0 && A[A.length - 1]%2 == 0)
			return "YES";
		return "NO";
	}
}
