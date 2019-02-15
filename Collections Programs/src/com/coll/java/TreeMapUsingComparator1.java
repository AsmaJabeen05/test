package com.coll.java;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1.toString();
		String s2=(String)o2.toString();

		return -s1.compareTo(s2);
		
	}
}
public class TreeMapUsingComparator1 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap(new MyComparator());
		  t.put("yogi", 1);
		  t.put("nag", 2);
		  t.put("bala", 5);
		  t.put("kuttu", 3);
		  System.out.println(t);

	}

}
