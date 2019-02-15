package com.coll.java;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1.toString();
		String s2=(String)o2.toString();
		if(s1.length()==s2.length()){
			return s1.compareTo(s2);
		}
		if(s1.length()>s2.length()){
			return 1;
		}
		if(s1.length()<s2.length()){
			return -1;
		}
		return 0;
	}
}
public class TreeSetUsingComparator1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		  t.add("A");
		  t.add(new StringBuffer("ABC"));
		  t.add("BCA");
		  t.add("AA");
		  System.out.println(t);
	}                                                                                    
}
