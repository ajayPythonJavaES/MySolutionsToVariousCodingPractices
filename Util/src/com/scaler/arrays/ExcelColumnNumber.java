package com.scaler.arrays;

public class ExcelColumnNumber {

	public static int excelColumnNumber(String A) {
		if(A.length() == 1)
            return A.charAt(0) - 'A' + 1;

        int result = 0;
        for(int i = 0; i < A.length(); i++) {
            result *= 26;
            result += A.charAt(i) - 'A' + 1;
        }
        return result;
	}
	
	public static void main(String[] args) {
		System.out.println(excelColumnNumber("AA"));
	}
	
}
