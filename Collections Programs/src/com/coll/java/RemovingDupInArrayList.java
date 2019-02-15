package com.coll.java;

import java.util.ArrayList;

public class RemovingDupInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			if(!al1.contains(al.get(i))) {
				al1.add(al.get(i));
			}
		}
		System.out.println(al1);
	}

}
