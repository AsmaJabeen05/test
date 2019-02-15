package com.coll.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1{
	int eid;
	String ename;
	double esal;
	
	public Employee1(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	@Override
	public String toString() {
		return "Id:"+eid+"----"+"Name:"+ename+"-----"+"Sal:"+esal;
	}
}

class MyComparator10 implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 d1, Employee1 d2) {
	
		return d2.ename.compareTo(d1.ename); 
		
	}
	
}
public class ComparatorSortingOnName {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new Employee1(1,"yogi",10000));
		al.add(new Employee1(3,"nag",30000));
		al.add(new Employee1(6,"siva",5000));
		al.add(new Employee1(5,"kuttu",50000));
		Collections.sort(al, new MyComparator10());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
