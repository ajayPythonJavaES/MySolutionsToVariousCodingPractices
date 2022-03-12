package com.leetcode.arrays;

public class XORedArray {

	public static void main(String[] args) {
		decode(new int[] {1,2,3}, 1);
	}
	
    public static int[] decode(int[] encoded, int first) {
        int ans[] = new int[encoded.length + 1];
        ans[0] = first;
        ans[1] = first ^ encoded[0];
        for(int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] ^ encoded[i - 1];
        }
        return ans;
        
    }

	
}
