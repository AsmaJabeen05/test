package com.coll.java;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		Map<String,Integer> m=new TreeMap<String,Integer>();
		//m.put(null, "yogi");//null cannot be given
		m.put("nag",2);
		m.put("bala",3);
		m.put("kuttu",4);
		System.out.println(m);//maintains ascending order
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> e=(Entry<String,Integer>) itr.next();
			System.out.println(e.getKey()+"..."+e.getValue());
		}
	}
}
