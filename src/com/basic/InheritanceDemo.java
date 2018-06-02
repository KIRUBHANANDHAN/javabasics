package com.basic;

class DemoForInherit {
	
	public int i=2;
	
	 public DemoForInherit() {
	
		System.out.println("rames" + i);
	}
		public DemoForInherit(int i) {
			this();
			System.out.println("rames rins" + i);
		}

	}

	class Demo5 extends DemoForInherit {
		public Demo5() {
						System.out.println(++i);
		}

	
	}
public class InheritanceDemo {

	public static void main(String[] args) {
		DemoForInherit d1 = new DemoForInherit(5);
		Demo5 d2 = new Demo5();

	}
}
