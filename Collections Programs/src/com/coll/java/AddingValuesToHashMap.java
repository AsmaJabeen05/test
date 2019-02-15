package com.coll.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AddingValuesToHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);
		System.out.println(h);
		Set s=h.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
	Map.Entry<String,Integer> s1=(Entry) itr.next();
		System.out.println(s1.getKey()+"...."+s1.getValue());
			
	//for(Map.Entry<String,Integer> s1:h.entrySet()){
	//	System.out.println(s1.getKey()+""+s1.getValue());
//		}
	}

}
}