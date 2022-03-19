package com.scaler.arrays;

public class DivisibleBy8 {

	public static void main(String[] args) {
		solve("9179");
	}
	
	public static int solve(String A) {
        int convert = 0;
        if(A.length() > 3) {
            String last3 = A.substring(A.length() - 3);
            convert = Integer.parseInt(last3);
            if(convert%8 == 0)
                return 1;
            else
                return 0;
        } else {
            int x = Integer.parseInt(A);
            if(x%8 == 0)
                return 1;
            else
                return 0;
        }
        //return 0;
    }
	
	
}
