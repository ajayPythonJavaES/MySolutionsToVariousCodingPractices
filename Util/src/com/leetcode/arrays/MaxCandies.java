package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {

	public static void main(String[] args) {
		kidsWithCandies(new int[] {2, 3, 1, 5, 2}, 2);
	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> rs = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for(int can : candies) {
            if(can > max)
                max = can;
        }
        
        for(int can : candies) {
            rs.add((can+extraCandies) >= max);
        }
        
        return rs;
    }
	
}
