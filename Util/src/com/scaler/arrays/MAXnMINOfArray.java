package com.scaler.arrays;

import java.lang.*;
import java.util.*;

public class MAXnMINOfArray {
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.print(max + " " + min);

	}
}