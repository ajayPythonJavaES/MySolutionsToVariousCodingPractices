package com.scaler.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShaggyAndDistances {

	public int solve(int[] A) {
        Map<Integer, Integer> set = new LinkedHashMap<Integer, Integer>();
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++) {
            if(set.containsKey(A[i])) {
                int x = i - set.get(A[i]);
                if(min > x)
                    min = x;
            } else {
                set.put(A[i], i);
            }
        }
        return (min == Integer.MAX_VALUE ? -1 : min);
    }
	
}
