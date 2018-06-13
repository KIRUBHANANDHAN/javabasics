package com.basic;

import java.util.Scanner;

public class StringExample {
	public static String[] rexam(String n)
	{
		int aa=n.length();
		int ab=aa/3;
		String fn="";
		String mn="";
		String ln="";
		if(aa%3==0)
		{
		   fn=n.substring(0,ab);
		   mn=n.substring(fn.length(),fn.length()+ab);
		   ln=n.substring(mn.length()+fn.length(),aa);
		   
		}
		//return new String[] {fn,mn,ln};
		if(aa%3==1)
		{
			fn=n.substring(0,ab);
			   mn=n.substring(fn.length(),ab*3);
			   ln=n.substring(mn.length(),aa);
		}
		if(aa%3==2)
		{
			fn=n.substring(0,ab+1);
			   mn=n.substring(fn.length());
			   ln=n.substring(mn.length(),aa);
		}
		return new String[] {fn,mn,ln};
	}
	
	public static void main(String[] args) {
		String s2[]=new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values\n");
		String s4=sc.next();
		System.out.println(s4.length());
		System.out.println("enter values\n");
		String s5=sc.next();
		System.out.println(s5.length());
		System.out.println("enter values\n");
		String s6=sc.next();
     	System.out.println(s6.length());
     	//StringExample se=new StringExample();
	//	se.exam(s4);
		String n1[]=rexam(s4);
		String n2[]=rexam(s5);
		String n3[]=rexam(s6);
		System.out.println(n1[0]+ n2[1]+ n3[2]);
		System.out.println(n1[1] +  n2[2] + n3[0]);
		System.out.println(n1[2] +  n2[0] + n3[1]);
		//System.out.println(n1[1]);
		//System.out.println(n1[2]);
				
	}}
