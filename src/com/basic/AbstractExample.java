package com.basic;

public abstract class AbstractExample {
     public AbstractExample()
     {
    	 System.out.println("yeah that's good");
     }
     public abstract void getCar();
	public static void main(String[] args) {
		Nandhu nan=new Nandhu(16);
          nan.getThat();
          nan.getCar();
	}

}
class Nandhu extends AbstractExample{
public void getCar() {
		 System.out.println("i got that CAR");
}
	public void getThat()
	{
		
		 System.out.println("i got that");
	}
	public Nandhu(int i) {
		
		System.out.println(i);
	}
}
