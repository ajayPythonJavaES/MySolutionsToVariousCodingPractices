package com.scaler.strings;

public class ReverseTheSentence {
	public static String solve(String A) {
        StringBuilder rev = new StringBuilder();
        StringBuilder rev2 = new StringBuilder();
        for(int i = A.length() - 1; i >= 0; i--) {
            if(A.charAt(i) != ' ') {
                rev.append(A.charAt(i));
            } else if(A.charAt(i - 1) != '\0'){            	
            	for(int j = rev.length() - 1; j >= 0; j--) {
            		rev2.append(rev.charAt(j));
            	}
            	if(rev2 != null && !rev2.toString().equals("") && rev2.charAt(rev2.length() - 1) != ' ') {
            		rev2.append(' ');
            	}
            	rev = new StringBuilder();            	
            }
        }
        if(!rev.isEmpty()) {
        	if(rev2.charAt(rev2.length() - 1) != ' ')
        		rev2.append(" ");
        	for(int i = rev.length() - 1; i >= 0; i--) {
        		rev2.append(rev.charAt(i));
        	}
        }
        return rev2.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(solve("Good  Weather is Bad  Climate"));
		
		System.out.println(solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv "));
	}
}
