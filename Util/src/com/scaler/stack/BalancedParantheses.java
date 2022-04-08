package com.scaler.stack;
public class BalancedParantheses {

    int top = -1;

    public int solve(String A) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == '(') {
                top++;
            } else if(A.charAt(i) == ')' && top == -1) {
                return 0;
            } else if(A.charAt(i) == ')') {
                top--;
            }
        }
        if(top == -1) 
            return 1;
        else
            return 0;
    }
}
