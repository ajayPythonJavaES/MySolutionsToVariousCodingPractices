package com.scaler.arrays;

import java.util.ArrayList;
import java.util.List;

public class NBy3RepeatedNumber {

	public static void main(String[] args) {
		//1000441, 1000441, 1000994
		final List<Integer> list = new ArrayList<Integer>();
		list.add(1000441);
		list.add(1000441);
		list.add(1000994);
		System.out.println(repeatedNumber(list));
	}
	
	public static int repeatedNumber(final List<Integer> a) {
        int occ1 = a.get(a.size() - 1);
        //int count = 0;
        //int m[] = List.toArray(a);
        for(int i = 0; i < a.size(); i++) {
            int count = 0;
            for(int j = i + 1; j < a.size(); j++) {
                if(a.get(i).intValue() == a.get(j).intValue()) {
                    count++;
                    if(count >= a.size()/3)
                        return a.get(i);
                }
            }
        }
        return -1;
	}
}
