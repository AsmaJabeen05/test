
package com.coll.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToIntegerArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(3);
		System.out.println(al);
		int[] a=new int[al.size()];
		int index=0;
		
		for (int i = 0; i <al.size(); i++) {
			a[index++]=al.get(i);
		}
		System.out.println(Arrays.toString(a));
	}
}
