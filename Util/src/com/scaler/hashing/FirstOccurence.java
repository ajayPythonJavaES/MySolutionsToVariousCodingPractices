package com.scaler.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstOccurence {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {10, 5, 3, 4, 3, 5, 6}));
		
		System.out.println(solve(new int[] {6, 10, 5, 4, 9, 120}));
		
	}
	
	
	public static int solve(int[] A) {
        Map<Integer, Integer> first = new LinkedHashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            first.put(A[i], first.get(A[i]) != null ? first.get(A[i]) + 1 : 1);
        }
        
        System.out.println(first.entrySet().iterator().next().getKey());
        
        for(Map.Entry<Integer, Integer> entry : first.entrySet() ) {
        	if(entry != null && entry.getValue() > 1)
        		return entry.getKey();
        }
        
        return -1;
    }
}
