package com.basic;
class SavingsAmount{
 double saver1=2000.00;
   double saver2=3000.00;
static double annualInterestRate=0.04;
 public void monthlyCalculate()
 {
	double balance;
	 balance=(saver1*annualInterestRate)/12;
	 System.out.println("balance is "+balance);
	 balance+=saver1;
	 System.out.println("new balance is "+balance);
	 balance=(saver2*annualInterestRate)/12;
	 System.out.println(balance);
	 balance+=saver2;
	 System.out.println("new balance is "+balance); 
 }
 }
 public class AccountDetails {
public static void main(String[] args)
{
	SavingsAmount amount=new SavingsAmount();
	amount.monthlyCalculate();
}}


