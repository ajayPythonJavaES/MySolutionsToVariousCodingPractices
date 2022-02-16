package com.sandp.ds;

public class PerfectSquareUsingBinarySearch {

	public static void main(String[] args) {
		PerfectSquareUsingBinarySearch a = new PerfectSquareUsingBinarySearch();
		a.solve(1065024);
	}

	public int solve(int a) {
        int mid = 0, high = a, low = 1;        
        boolean flag = false;
        do {
            
            mid = (low + high)/2;
            long sq = (long)mid*mid;
            if(sq == a) {
                flag = true;
                //mid = -1;
            } else if(sq > a) {
                high = mid - 1;
            } else if(sq < a) {
                low = mid + 1;
            }
        } while(((!flag) && (low <= high)) || a == 1);

        System.out.println(flag + " " + mid);

        if(!flag) {
            mid = -1;
        }
        return mid;
    }
	
}
