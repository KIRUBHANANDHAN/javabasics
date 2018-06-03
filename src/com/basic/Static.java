package com.basic;
class Sakthi{
	static  double interest;
	private  double balance;
	public Sakthi(double bal)
	{
		this.balance=bal;
	}
	public static void Sakthi(double interest)
	{
		Sakthi.interest=interest;
	}
public void calculate()
{
	double a=(balance*interest)/12;
	 balance+=a;
System.out.println(balance);
}
}

public class Static {
	public static void main (String args[])
	{
		Sakthi sa=new Sakthi(4300);
		sa.calculate();
		
	}

}
