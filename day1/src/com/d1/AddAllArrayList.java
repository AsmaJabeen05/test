package com.d1;

import java.util.ArrayList;

public class AddAllArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("yogi");
		al1.add("123");
		al1.add("nag");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("bala");
		al2.add("kuttu");
		al2.addAll(al1);
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println(al1);
	}

}
