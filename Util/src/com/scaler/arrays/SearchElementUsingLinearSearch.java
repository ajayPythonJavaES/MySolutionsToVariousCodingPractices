package com.scaler.arrays;

import java.lang.*;
import java.util.*;

public class SearchElementUsingLinearSearch {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //Test cases
        for(int i = 0; i < T; i++) {
            int n = sc.nextInt(); //Size of the array
            int arr[] = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt(); //read array
            }
            int B = sc.nextInt(); //element to be searched
            int present = search(arr, B); //perform search
            System.out.println(present);
        }
    }

    private static int search(int[] arr, int B) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == B)
                return 1;
        }
        return 0;
    }

}