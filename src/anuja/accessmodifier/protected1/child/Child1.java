package anuja.accessmodifier.protected1.child;

import anuja.accessmodifier.protected1.parent.Parent1;

public class Child1 extends Parent1 {
	
	public void m3() {
		int num2 = num;
		System.out.println(num2);
	}

	public static void main(String[] args) {
		Child1 p = new Child1();
		p.getProtectedNUm();
		p.m3();
	
	}
}
