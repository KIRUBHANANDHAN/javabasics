package com.basic;

class Date {
	int month, year;
	String day;
public Date(int month, int year, String day) {
		this.month = month;
	this.year=year;
	this.day=day;
	}


public void displayDate() {
	System.out.println(month+"/"+year+"/"+day);
}
}
public class Constructor {
	public static void main(String[] args) {
		Date d1 = new Date(5, 1997, "monday");
		d1.displayDate();
	}
	
}
