package com.leetcode.arrays;

public class MaxNumberOfWordsFoundInASentence {

	public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String sentence : sentences) {
            int x = sentence.split(" ").length;
            if(max < x)
                max = x;
        }
        
        return max;
    }
	
	public static void main(String[] args) {
		mostWordsFound(new String[] {"Praise the lord", "I love you Jesus", "Abba, Father", "Jesus Mary Joseph"});
	}
	
}
