package com.coll.java;

import java.util.ArrayList;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		ArrayList<Integer> y=x;
		y.add(3);
		ArrayList<Integer> z=new ArrayList<Integer>(x);
		z.add(4);
		z.add(5);
		System.out.println(x+"..."+y+"..."+z);

	}

}
