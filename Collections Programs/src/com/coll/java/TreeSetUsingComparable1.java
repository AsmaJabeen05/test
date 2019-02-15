package com.coll.java;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable{
	String ename;
	int eid;
	Employee(String ename,int eid){
		this.ename=ename;
		this.eid=eid;
	}
	public String toString(){
		return ename+"...."+eid;
	}
	public int compareTo(Object obj){
		int eid1=this.eid;
		Employee e=(Employee) obj;
		int eid2=e.eid;
		if(eid1<eid2){
			return 1;
		}
		else if(eid1>eid2){
			return -1;
		}
		return 0;
	}
}

public class TreeSetUsingComparable1 {
	public static void main(String[] args) {
		Employee e1=new Employee("yogi",101);
		Employee e2=new Employee("nag",105);
		Employee e3=new Employee("bala",103);
		Employee e4=new Employee("kuttu",106);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		Iterator itr=t.iterator();
		while(itr.hasNext()) {
			Employee emp=(Employee) itr.next();
			System.out.println(emp.eid+"----"+emp.ename);
		}
	}
}
