package com.scaler.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommmonPrefix(new String[] {"abcdefgh", "aefghijk", "abcefgh"}));
		
		System.out.println(longestCommmonPrefix(new String[] {"abab", "ab", "abcd"}));
		
		System.out.println(longestCommmonPrefix(new String[] {"abcd", "abcdfhc", "abxyim", "abyzofkl"}));
		
		System.out.println(longestCommmonPrefix(new String[] {"abcd","abcd","abcd","abcd","abcd"}));
		
		System.out.println(longestCommmonPrefix(new String[] {"abcd","abcd","abcd","abcd","abc"}));
		
	}
	
	public static String longestCommmonPrefix(String[] A) {
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i].length() == 0)
                count++;
        }
        if(count > 0 && count == A.length)
            return A[0];

        boolean flag = true;
        for(int i = 1; i < A.length; i++) {
        	if(!A[i].equals(A[i-1]))
        		flag = false;
        }        
        
        if(flag)
        	return A[0];
        
        int short_len = Integer.MAX_VALUE;
        String short_str = "";
        for(int i = 0; i < A.length; i++) {
            if(short_len >= A[i].length()) {
                short_len = A[i].length();
                short_str = A[i];
            }
        }



        char ch[] = new char[short_str.length()];

        for(int i = 0; i < ch.length; i++) {
            ch[i] = short_str.charAt(i);            
        }

        String common = "";

        for(int i = 0; i < A.length; i++) {
            if(!short_str.equals(A[i])) {
                int k = 0;
                StringBuilder tempC = new StringBuilder();
                for(int j = 0; j < A[i].length(); j++) {
                    if(k < short_len && ch[k++] == A[i].charAt(j)) {
                        tempC.append(A[i].charAt(j));
                    } else {
                    	break;
                    }
                }
                if(common.equals("")) {
                    common = tempC.toString();
                } else if(!common.equals("") && common.length() > tempC.length()) {
                    common = tempC.toString();
                }
            }
        }
        return common;
	}
	
}
