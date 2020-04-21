package com.sandp.ds;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Solution {

	private int i = 0;

	private static Date date;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		/*
		 * Scanner sc = new Scanner(System.in); int noOfString; noOfString =
		 * sc.nextInt(); String[] inputString = new String[noOfString];
		 * 
		 * for (int i = 0; i < inputString.length; i++) { inputString[i] = sc.next(); }
		 */
		// solution(inputString);
		/*
		 * int count = 0; for (int i = -100; i <= 100; i++) { count++; }
		 * 
		 * System.out.println(count); System.out.println(fib(Integer.MAX_VALUE));
		 */
		/*
		 * int x = 9999999; while(x != 1) { System.out.println(x%10); x = x / 10; }
		 */

		// ArrayList<Integer> list = new ArrayList<Integer>();
		// list = [2, 5, 6, 8, 6, 1, 2, 4, 5 ];
		// int arr[] = { 2, 5, 6, 8, 6, 1, 2, 4, 5 };

		/*
		 * list.add(2); list.add(5); list.add(6); list.add(8); list.add(6); list.add(1);
		 * list.add(2); list.add(4); list.add(5);
		 */

		// 0 3 7 6 4 0 5 5 5

		/*
		 * list.add(0); list.add(3); list.add(7); list.add(6); list.add(4); list.add(0);
		 * list.add(5); list.add(5); list.add(5);
		 * 
		 * 
		 * 
		 * System.out.println("Input: " + list); System.out.println("Output: " +
		 * plusOne(list));
		 */

		// calculateTime(100);

		ArrayList<Integer> A = new ArrayList<Integer>();

		// 9 -1 2 3 7 -6 5 -1 8 -7

		/*
		 * A.add(-1); A.add(2); A.add(3); A.add(7); A.add(-6); A.add(5); A.add(-1);
		 * A.add(8); A.add(-7);
		 */

		/*
		 * A.add(1); A.add(-5); A.add(-2); A.add(1); A.add(-10);
		 */

		// 1, 2, 5, -7, 2, 5

		// A.add(1477171087);

		// 0, 0, -1, 0

		/*
		 * A.add(0); A.add(0); A.add(-1); A.add(0);
		 */

		// 1967513926, 1540383426, -1303455736, -521595368

		// 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069,
		// 1059961393, 628175011, -1131176229, -859484421

		/*
		 * A.add(336465782); A.add(-278722862); A.add(-2145174067); A.add(1101513929);
		 * A.add(1315634022); A.add(-1369133069); A.add(1059961393); A.add(628175011);
		 * A.add(-1131176229); A.add(-859484421);
		 */

		/*
		 * A.add(1); A.add(2); A.add(5); A.add(-7); A.add(2); A.add(5);
		 */
		// System.out.println(maxSubArray(A));

		int x = binaryGap(895687458);
		System.out.println(x);

		// System.out.println(maxset(A));
	}

	public static void solution(final String[] array) {
		// write your code in Java SE 8
		int totalStrings = array.length;
		boolean result = false;

		if (totalStrings == 1) {
			result = false;
		} else {
			int count = 0;
			/*
			 * for (int j = 0; j < totalStrings; j++) { for (int i = 1; i < totalStrings;
			 * i++) { if ((i != j) && (array[j].charAt(0) ==
			 * array[i].charAt(array[i].length() - 1)) || (array[j].charAt(array[j].length()
			 * - 1) == array[i].charAt(0))) { count++; } } if (count > 0) { result = false;
			 * break; } else { count = 0; } }
			 */
			String fStr = array[0];
			for (String str : array) {
				if (str.startsWith(fStr.charAt(fStr.length() - 1) + "") || str.endsWith(fStr.charAt(0) + ""))
					count++;
			}

			if (count > 0) // && count == array.length - 1
				result = true;

			System.out.println(count);
		}

		System.out.println((result) ? "yes" : "no");
	}

	public static int solution(int[] A) {

		int[] s = new int[A.length];

		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0)
				s[i] = -1;
			else
				s[i] = 1;
		}

		int k = 0, val = 0;

		for (int a : A) {
			val += a * s[k];
			k++;
		}

		return val;
	}

	private static int fib(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void calculateTime(int minutes) {
		date = Calendar.getInstance().getTime();

		Time time = new Time(date.getTime());

		LocalTime localTime = time.toLocalTime();

		System.out.println("Current time: " + time);

		if (minutes > 60) {
			int extraTime = minutes - 60;

			extraTime = localTime.getMinute() + extraTime;
			if (extraTime > 60) {
				int moreTime = extraTime - 60;
				System.out.println("New time: " + (localTime.getHour() + 1) + ":" + extraTime);
			}

		}
	}

	public int coverPoints(ArrayList<Integer> a, ArrayList<Integer> b) { // scored 123/150 points
		int steps = 0;
		if (a.size() == b.size()) {

			for (int i = 0; i < a.size(); i++) {
				int x = a.get(i);
				int y = b.get(i);
				if ((i + 1) < a.size()) {
					int x1 = a.get(i + 1);
					int y1 = b.get(i + 1);
					int diff1 = (x > x1) ? (x - x1) : (x1 - x);
					int diff2 = (y > y1) ? (y - y1) : (y1 - y);
					if (diff1 > diff2)
						steps += diff1;
					else
						steps += diff2;
				}
			}
		}

		return steps;
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) { // This solution works but the score is 57/225
		/*
		 * String convertStr = ""; for(int a1 : a) convertStr += a1; a.clear(); int
		 * toNum = Integer.parseInt(convertStr); toNum += 1; int n = toNum; while(n !=
		 * 0) { a.add(n%10); n = n/10; } Collections.reverse(a);
		 */

		Collections.reverse(a);
		ArrayList<Integer> rList = new ArrayList<Integer>();
		boolean flag = false;
		int k = 0;
		for (int a1 : a) {
			if (flag && a1 > 8) {
				a1 = 0;
			} else if (a1 > 8 && k == 0) {
				a1 = 0;
				flag = true;
			} else if (a1 <= 8) {
				if (flag || k == 0)
					a1 += 1;
				if (flag)
					flag = false;
			} else if (flag && (k == a.size() - 1)) {
				a1 = 0;
			}
			k++;
			rList.add(a1);
		}
		if (flag)
			rList.add(1);
		if (rList.get(rList.size() - 1) == 0) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			boolean visit = false;
			for (int i = rList.size() - 1; i >= 0; i--) {
				if (rList.get(i) != 0 || visit) {
					temp.add(rList.get(i));
					visit = true;
				}
			}
			Collections.reverse(temp);
			rList = temp;
		}
		Collections.reverse(rList);

		return rList;
	}

	public static int maxSubArray(final List<Integer> A) { // This solution does not work
		int maxSum = 0;

		int tot = 0;
		for (int i : A)
			tot += i;
		if (maxSum < tot)
			maxSum = tot;

		int j = 1;
		tot = 0;
		for (int i = j; i < A.size(); i++) {
			if (tot > maxSum)
				maxSum = tot;
			tot += A.get(i);
			/*
			 * if(i == (A.size() - 1) && j != (A.size() - 1)) i = j + 1;
			 */
		}

		int temp = maxSum + A.get(0);
		if (temp > maxSum)
			maxSum = temp;

		return maxSum;

	}

	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		// ArrayList<ArrayList<Integer>> subArray = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> retArr = new ArrayList<Integer>();
		int count = 0;
		int maxSum = 0;
		if (A.size() == 1 && A.get(0) > 0) {
			retArr.add(A.get(0));
		} else {
			for (int x : A) {
				if (x >= 0) {
					count += x;
					temp.add(x);
					if (count < 0 || count == maxSum) {
						if (temp.size() > retArr.size()) {
							retArr.clear();
							retArr.addAll(temp);
						} else if (temp.size() == retArr.size()) {
							System.out.println("Reached!!");
						}
					}
					if (count > maxSum) {
						retArr = new ArrayList<Integer>();
						retArr.addAll(temp);
						maxSum = count;
					}
				} else {
					if (count >= maxSum) {
						retArr = new ArrayList<Integer>();
						retArr.addAll(temp);
					}
					temp.clear();
					count = 0;
				}
			}
		}
		return retArr;
	}

	public static int binaryGap(int N) {
		int x = N;
		StringBuffer app = new StringBuffer();

		while (x != 0) {
			int r = x % 2;
			// System.out.print(r);
			app.append(r);

			x = x / 2;
		}

		app.reverse();

		int count = 0;
		int maxSum = 0;
		for (int i = 0; i < app.length(); i++) {
			switch (app.charAt(i)) {
			case '0':
				count++;
				break;
			case '1':
				if (count > maxSum)
					maxSum = count;
				count = 0;
				break;
			default:
				System.out.println("D");
			}
		}

		System.out.println(app);
		return maxSum;
	}

	
	
}
