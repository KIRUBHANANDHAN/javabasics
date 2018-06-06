package com.basic;

 class PoongaVanam1 {
	 String a="work";
	}
	 class Perum extends PoongaVanam1
	{ 
		public void printDetails()
		{
		System.out.println(a);
	}}
	 class Sara extends PoongaVanam1
		{
			public void printDetails1()
			{
				System.out.println("my son will take care all");
			}
		}
	public class PoongaVanam 
	{
		public static void main(String[] args)
		{
			Perum poo=new Perum();
			poo.printDetails();
			Sara poo1=new 	Sara();
			poo1.printDetails1();
		}
	}


