package com.basic;
import java.lang.reflect.Constructor;
public class ReflectionEx {
	public static void main(String[] args) {
		try {
			Class cl=Class.forName("com.basic.WorstCaseDemo");
			Constructor c[]= cl.getConstructors();
			for(int i=0;i<c.length;i++)
			{
				System.out.println(c[i]);
			}
			Constructor w=c[2];
			System.out.println(w);
		}catch(Exception e)
		{
			System.out.println("kfugih");
		}
	}
}

