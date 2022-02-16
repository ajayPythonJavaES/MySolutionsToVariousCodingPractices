package com.sandp.ds;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(1);

        for(int i = 2; i < N; i++) {
            int x = i;
            int sum = 0;
            while(x >= 1) {
                sum += Math.pow((x%10), 3);
                x = x/10;
            }
            //System.out.println(sum);
            if(sum == i)
                System.out.println("Armstrong: "+i);
        }
	}
	
}
