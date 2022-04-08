package com.scaler.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printRev(str, str.length() - 1);
        //System.out.println(printRev(str, str.length() - 1));
        sc.close();
    }

    private static String printRev(String str, int pos) {
    	if(pos < 0)
    		return null;
    	System.out.print(str.charAt(pos--) + "");
       return printRev(str, pos);
    }

}