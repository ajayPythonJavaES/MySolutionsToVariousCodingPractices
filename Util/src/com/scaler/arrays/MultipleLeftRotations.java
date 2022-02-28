package com.scaler.arrays;

/*
 * Test Case:
 * 
 * A : [ 93, 43, 68, 47, 80, 65, 92, 4, 82, 46, 35, 67, 65, 90, 91, 45, 92, 84, 89, 45, 21, 60, 61, 100, 90, 56, 30, 42, 21, 74, 43, 24, 44, 51, 22, 1 ]
B : [ 58, 76, 14, 8, 100, 95, 50, 83, 58, 81, 84, 19, 45, 11, 10, 62, 82, 82, 28, 36, 67, 71, 44, 29, 54, 1, 87, 4, 78 ]
 * 
 * 
 * 
 */

public class MultipleLeftRotations {

	public static void main(String[] args) {
		MultipleLeftRotations rot = new MultipleLeftRotations();
		int[] A = { 93, 43, 68, 47, 80, 65, 92, 4, 82, 46, 35, 67, 65, 90, 91, 45, 92, 84, 89, 45, 21, 60, 61, 100, 90,
				56, 30, 42, 21, 74, 43, 24, 44, 51, 22, 1 };

		int B[] = { 58, 76, 14, 8, 100, 95, 50, 83, 58, 81, 84, 19, 45, 11, 10, 62, 82, 82, 28, 36, 67, 71, 44, 29, 54,
				1, 87, 4, 78 };

		// A = new int[]{1, 2, 3, 4, 5};
		// B = new int[] {2, 3, 1, 4, 8, 5, 10, 78, 23, 65, 100, 22};

		System.out.println("A.length: " + A.length);

		int res_arr[][] = rot.solve(A, B);

		for (int i = 0; i < res_arr.length; i++) {
			for (int j = 0; j < res_arr[i].length; j++) {
				System.out.print(res_arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] solve(int[] A, int[] B) {
		int rev_arr[];
		int temp = 0;
		int n = A.length;
		int orig_arr[] = A.clone();
		for (int i = 0, j = n - 1; i < A.length && j > 0; i++, j--) {
			if (i < j) {
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		int res_arr[][] = new int[B.length][A.length];
		for (int i = 0; i < B.length; i++) {
			rev_arr = A.clone();
			// System.out.println("rev_arr");
			for (int j = 0; j < n; j++) {
				// System.out.print(rev_arr[j] + " ");
			}
			System.out.println();
			int k = B[i];
			if (k >= A.length)
				k = k % n;

			if (k != 0) {
				for (int j = 0, m = n - k - 1; j <= k && m >= 0; j++, m--) {
					if (j < m) {
						temp = rev_arr[j];
						// System.out.println("j: " + j + ", m: " + m);
						rev_arr[j] = rev_arr[m];
						rev_arr[m] = temp;
					}
				}

				for (int j = n - k, m = n - 1; j < n; j++, m--) {
					if (j < m) {
						temp = rev_arr[j];
						rev_arr[j] = rev_arr[m];
						rev_arr[m] = temp;
					}
				}

				for (int j = 0; j < n; j++) {
					// System.out.print(rev_arr[j] + " ");
				}

				res_arr[i] = rev_arr;
			} else {
				res_arr[i] = orig_arr;
			}
			// System.out.println("");

		}

		return res_arr;
	}

}
