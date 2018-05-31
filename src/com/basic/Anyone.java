package com.basic;
import java.util.Scanner;
public class Anyone {
public static void main(String[] args) {
	int a,b;
	System.out.println("enter any 2 nos");
	  Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
       if(a%b==0)
    	  System.out.print("multiple of 2");
       else
    	   System.out.println("oo");
	}

}
