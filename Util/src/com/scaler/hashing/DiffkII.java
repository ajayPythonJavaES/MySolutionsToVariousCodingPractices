package com.scaler.hashing;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DiffkII {

	// Diffk 2

	public static void main(String[] args) {

		System.out.println(
				pruned(new int[] { 11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13 }, 60));

		System.out.println(pruned(new int[] { 77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35,
				48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0 }, 53));

		System.out.println(bruteForce(new int[] { 77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43,
				35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0 }, 53));

		System.out.println(diffPossible(new int[] { 80, 87, 75, 11, 57, 31, 88, 48, 15, 77, 44, 22, 82, 41, 52, 52, 99,
				40, 84, 21, 30, 100, 61, 48, 96, 64, 73, 79, 84, 95, 14, 48, 80, 90, 26, 97, 33, 88, 25, 84, 85, 57, 44,
				91, 64, 16, 39, 30, 18, 17, 84, 54, 54, 50, 24, 13, 100, 80, 69, 22, 96, 12, 68, 65, 40, 47, 70, 48, 53,
				10, 39, 61, 56, 11, 46, 18, 94, 49, 59, 31, 30, 16, 64, 90, 90 }, 1));
		System.out.println(diffPossible(new int[] { 4, -4, 1, 2 }, 0));
		System.out.println(diffPossible(new int[] { 1, 1 }, 0));
		System.out.println(diffPossible(new int[] { 4, 4, 2, 4 }, 0));
		System.out.println(diffPossible(new int[] { 66, 37, 46, 56, 49, 65, 62, 21, 7, 70, 13, 71, 93, 26, 18, 84, 96,
				65, 92, 69, 97, 47, 6, 18, 17, 47, 28, 71, 70, 24, 46, 58, 71, 21, 30, 44, 78, 31, 45, 65, 16, 3, 22,
				54, 51, 68, 19, 86, 44, 99, 53, 24, 40, 92, 38, 81, 4, 96, 1, 13, 45, 76, 77, 8, 88, 50, 89, 38, 60, 61,
				49, 25, 10, 80, 49, 63, 95, 74, 29, 27, 52, 27, 40, 66, 38, 22, 85, 22, 91, 98, 19, 20, 78, 77, 48, 63,
				27 }, 31));
		System.out.println(diffPossible(new int[] { 1, 5, 3 }, 2));
	}

	public static int diffPossible(final int[] A, int B) {
		if (A.length == 1)
			return 0;

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (B == 0 && set.contains(A[i])) {
				return 1;
			}
			set.add(A[i]);
		}
		if (B == 0)
			return 0;

		/*
		 * int i = 0; for(int x : set) { if(set.contains((B - x)) && i + 1 != (B - x))
		 * return 1; i++; }
		 */

		/*
		 * if(B == 0) { for(int i = 0; i < A.length; i++) { if(A[i] < 0) {
		 * if(set.contains(set)) } } }
		 */
		for (int j = 0; j < A.length; j++) {
			if (set.contains(Math.abs(B - A[j])))
				return 1;
		}

		return 0;
	}

	private static int bruteForce(final int A[], int B) {
		for (int j = 0; j < A.length; j++) {
			for (int i = j + 1; i < A.length; i++) {
				if (Math.abs(A[i] - A[j]) == B)
					return 1;
			}
		}
		return 0;

	}

	private static int pruned(final int A[], int B) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		//A[i] - A[j] = B => A[i] = B + A[j] or A[i] - B = A[j]
		for (int i = 0; i < A.length; i++) {
			if (set.contains(B + A[i]) || set.contains(A[i] - B))
				return 1;
			else if (!set.contains(A[i]))
				set.add(A[i]);
		}

		return 0;
	}

}
