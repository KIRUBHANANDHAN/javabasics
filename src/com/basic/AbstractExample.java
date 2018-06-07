package com.basic;

public abstract class AbstractExample {
     public AbstractExample()
     {
    	 System.out.println("yeah that's good");
     }
	public static void main(String[] args) {
		//AbstractExample abi=new AbstractExample();
          Nandhu nan=new Nandhu();
          nan.getThat();
	}

}
class Nandhu extends AbstractExample{
	public void getThat()
	{
		
		 System.out.println("i got that");
	}
}
