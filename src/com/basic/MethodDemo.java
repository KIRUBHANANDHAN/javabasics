package com.basic;

class Demo1
{
  public void Example(int a)
{   
	  int b=a%10;
	System.out.println(b);	
	int c=a/10;
	int d=c%10;
	System.out.println(d);
	int e=c/10;
	System.out.println(e);
}}
public class MethodDemo {
  public static void main(String[] args) {
	  Demo1 d1=new Demo1();
	  d1.Example(456);
  }  }
