package com.d1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Test
{

public static void main(String[] args){
	Test t1=new Test();
	Test t2=new Test();
	Test t3=new Test();
	ArrayList ts=new ArrayList();
	  
    // Elements are added using add() method 
	ts.add(t1);
    ts.add(t1);
    ts.add(t2);
  ts.add(t3);
//	 ts1.add(null);
  HashSet hs=new HashSet(ts);
  hs.addAll(ts);
System.out.println(hs);
}
}

