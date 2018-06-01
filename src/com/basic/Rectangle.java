package com.basic;

class Overload{
	int length=1,width=1;
	public Overload(int length,int width) {
		int perimeter;
        perimeter=2*(length+width);
	System.out.println("perimeter is "+perimeter );	
	}

	public int areaCalculation(int length,int width) {
		if(length<20&&length>0&&width>0&&width<20)
			System.out.println("valid");
		else
			System.out.println("invalid");
		int area;
		area=length*width;
		return area;
		
	}
	}
public class Rectangle {

	public static void main(String[] args) {
		Overload over=new Overload(5,6);
				System.out.println("area is "+over.areaCalculation(4,50));
		}}
			


