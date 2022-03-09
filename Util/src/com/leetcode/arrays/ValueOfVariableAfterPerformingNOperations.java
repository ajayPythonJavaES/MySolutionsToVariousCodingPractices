package com.leetcode.arrays;

public class ValueOfVariableAfterPerformingNOperations {

	public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for(String op : operations) {
            if(op.toUpperCase().equals("X++") || op.toUpperCase().equals("++X")) {
                x += 1;
            } else if(op.toUpperCase().equals("X--") || op.toUpperCase().equals("--X")){
                x -= 1;
            }
        }
        
        return x;
    }
	
	public static void main(String[] args) {
		finalValueAfterOperations(new String[] {"x++", "--x", "x++"});
	}
}
