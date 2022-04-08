package com.scaler.strings;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println(solve("AbcaZeoB"));
	}
	
	public static String solve(String A) {
		StringBuilder str = new StringBuilder(A);
        str.append(str);
        StringBuilder opt = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                opt.append("#");
            } else if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                opt.append(str.charAt(i) + "");
            }
        }
        return opt.toString();
    }
	
}
