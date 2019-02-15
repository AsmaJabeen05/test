package com.coll.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("yogi");
		al.add("123");
		al.add("nag");
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			Object s=itr.next();
			System.out.println(s);
		}
		
	}

}
