package com.scaler.arrays;

import java.lang.*;
import java.util.*;

public class KRotations {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int temp = 0;
        for(int i = 0, j = x - 1; i < x && j > 0; i++, j--) {
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if(k > x) 
            k = k % x;

        /*for(int i =  x - k, j = x - 1; i < x && j > x - k; i++, j--) {
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int i = 0, j = k; i < k && j > 0; i++, j--) {
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }*/

        for(int i = 0, j = k - 1; i < k && j > 0; i++, j--) {
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }        
        }

        for(int i = k, j = x - 1; i < x - 1 && j > k; i++, j--) {
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}