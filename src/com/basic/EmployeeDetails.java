package com.basic;
class EmployeeDetails{
	static int  j=0;
	public int getDetails(int sales[])
	{
		int a=0,amount=0,count=0;
		for(int i=0;i<sales.length;i++)
		{ 
			j=sales[i];
	         int k=(int)(j*0.09);
		     amount=200+k;
		   System.out.println("salary for 1st person is "+amount);
		}
		if(amount>200&&amount<300)
			count++;
//		if(amount>300&&amount<400)
//			count++;
//		if(amount>400&&amount<500)
//		count++;
//		if(amount>500&&amount<600)
//			count++;
//		if(amount>600&&amount<700)
//			count++;
//		if(amount>700&&amount<800)
//			count++;
//		if(amount>800&&amount<900)
//			count++;
//		if(amount>900&&amount<1000)
//			count++;
	}

	public static void main(String[] a)
	{
		 int arr[]= {3000,4000,5000};
		 EmployeeDetails person=new  EmployeeDetails();
		person.getDetails(arr);
	}

		
		
		
		
		
		
	
























public class EmployeeDetails {

	public static void main(String[] args) {
		 int sales[]= {1000,2000,3000,4000};
		 SalesPerson person=new  SalesPerson();
		 person.getDetails(sales);

	}

}
