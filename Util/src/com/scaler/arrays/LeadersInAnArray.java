package com.scaler.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

	public static void main(String[] args) {
		solve(new int[] {16,17,4,3,5,2});
	}
	
	
	public static int[] solve(int[] A) {
        List<Integer> leader = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++) {
            boolean flag = false;
            for(int j = i + 1; j < A.length; j++) {
                if(A[i] < A[j])
                    flag = true;
            }
            if(!flag)
                leader.add(A[i]);
        }
        int[] leadArr = new int[leader.size()];
        int i = 0;
        for(int lead : leader) {
            leadArr[i++] = lead;
        }
        return leadArr;
    }
}
