package com.coll.java;

import java.util.ArrayList;
import java.util.Collections;

public class ToMakeALAsImmutableExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al.size());
		ArrayList al1=(ArrayList) Collections.unmodifiableList(al);
		al1.add(5);
		System.out.println(al);

	}
}
