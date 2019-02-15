package com.coll.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("yogi");
		al.add("nag");
		al.add("123");
		al.add("kuttu");
		System.out.println(al);
		String[] s=al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(s));
	}

}
