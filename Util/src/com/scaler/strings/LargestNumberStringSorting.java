package com.scaler.strings;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberStringSorting {

	public static void main(String[] args) {
		solution(new int[] {98, 23, 90, 99, 9, 1, 234});
	}
	
	public static void solution(int nums[]) {
		String nums2[] = new String[nums.length];
		for(int i = 0; i < nums.length; i++) {
			nums2[i] = String.valueOf(nums[i]);
		}
		//nums = new String[] {"98","23","90","99","9","1","234"};
		Arrays.sort(nums2, new Comparator<String>(){
			@Override
			public int compare(String i, String j) {
				String s1 = i + j;
				String s2 = j + i;
				return s2.compareTo(s1);
			}
		});
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < nums.length; i++) {
			res.append(nums[i]);
		}
		System.out.println(res.toString());
	}
	//1232349098999
	//9998909432321
	
}
