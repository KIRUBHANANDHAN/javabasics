package com.basic;

import java.util.*;
//import java.lang.*;

public class Linkedlist {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] num=new int[5];
	for (int i = 0; i <num.length; i++) {
		num[i]=sc.nextInt();
	
	}
	LinkedList<Integer> lone=new LinkedList<>();
    for(Integer s:num)
    {
    	
    	lone.add(s);
    	System.out.println(s);
    	
    }
    
    Iterator<Integer> it=lone.descendingIterator();
	lone.sort(null);
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	sc.close();
}
	

}
