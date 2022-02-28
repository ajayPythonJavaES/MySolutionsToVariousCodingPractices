package com.scaler.arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		System.out.println(solve(new int[] {0,0,0,0,0,0,0}));
	}
	
	public static int solve(int[] A) {

		int PF[] = new int[A.length];
        //PF[0] = A[0];
        for(int i = 0; i < A.length; i++) {
            if(i == 0) 
                PF[i] = A[i];
            else                
                PF[i] = PF[i - 1] + A[i];
        }

        boolean all_zero = false;
        for(int i = 0; i < PF.length; i++) {
            if(PF[i] != 0)
                all_zero = true;
        }
        System.out.println(all_zero);
        int equ_index = 0;
        if(all_zero) {
            int left_sum = 0, right_sum = 0; 
            for(int i = 0; i < PF.length; i++) {
                if(i == 0) 
                    left_sum = 0;
                else {
                    left_sum = PF[i - 1];
                    right_sum = PF[PF.length - 1] - PF[i];
                    if(left_sum == right_sum)
                        equ_index = i;
                }
            }
        } else {
            return 0;
        }
        
        

        return (equ_index > 0 ? equ_index : -1);
    }
	
}
