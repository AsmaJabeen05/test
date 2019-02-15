package com.coll.java;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{
	static ConcurrentHashMap al=new ConcurrentHashMap();
	public void run(){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){}
		System.out.println("child thread is updating");
		al.put(40,40);
		
	}
	public static void main(String[] args) throws Exception{
		al.put(10,10);
		al.put(20,20);
		al.put(30,30);
		//System.out.println(al);
		ConcurrentHashMapExample s=new ConcurrentHashMapExample();
		s.start();
		Set set=al.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry s1=(Map.Entry)itr.next();
			System.out.println("main thread iterating list current object is:"+s1);
			Thread.sleep(2000);
		}
		System.out.println(al);

	}

}
