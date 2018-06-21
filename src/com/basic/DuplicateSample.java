package com.basic;
import java.util.*;

public class DuplicateSample{
	public static void main(String a[])
	{
	int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter something");
	String one=scan.nextLine();
	String two[]=one.split("\\s");
	for(int i=0;i<two.length-1;i++)
	      {
		for(int j=0;j<two.length-1;j++)
		    {
			if(two[i].equalsIgnoreCase(two[j]))
			  {
				if(i!=j)
				count++;
		          }
		     }
	       }
	       System.out.println(count);
         }
}