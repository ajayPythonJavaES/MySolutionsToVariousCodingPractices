package com.scaler.strings;

public class ToLower {

	public static void main(String[] args) {
		to_lower(new char[] {'a','b','A'});
		substr("aaaabaaa");
		substr("abbcccbbbcaaccbababcbcabca");
	}
	
	public static char[] to_lower(char[] A) {
        for(int i = 0; i < A.length; i++) {
            if((int)A[i] >= 65 && (int)A[i] <= 90)
                A[i] = (char)(A[i] + 32);
            else 
                A[i] = (char)A[i];
        }
        return A;
    }
	
	public static void substr(String A) {
		int max_len = 0;
		String max_pal = "";
		for(int i = 0; i < A.length(); i++) {
            for(int j = i; j <= A.length(); j++) {
                String x = A.substring(i, j);
                if(x.equals(new StringBuilder(x).reverse().toString()) && max_len < x.length()) {
                	max_len = x.length();
                	max_pal = x;
                }
            }
        }
		System.out.println(max_pal);
	}
	
}
