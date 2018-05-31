package com.basic;

import java.util.Scanner;

class Demo {
	String firstName, lastName;
	double monthlySalary;	
	public String getFirstname() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public void getMonthlySalary(double monthlySalary) {
		if(monthlySalary<0)
			System.out.println("invalid");
	}

public void setMonthlysalary(double monthlySalary) {
	      monthlySalary*=12;
	      monthlySalary*=0.1;
	      System.out.println(monthlySalary);
	
	}

}


class Employee {
	public static void main(String[] args) {
		double monthlySalary;
		System.out.print("enter salry");
		Scanner sc = new Scanner(System.in);
		monthlySalary=sc.nextDouble();
		Demo d1=new Demo();
		d1.getMonthlySalary(monthlySalary);
		Demo d2=new Demo();
		d2.setMonthlysalary(monthlySalary);
     
	}

}
