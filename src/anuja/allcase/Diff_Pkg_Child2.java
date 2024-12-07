package anuja.allcase;

import anuja.anuja_oops_practice.Parent1;

public class Diff_Pkg_Child2 extends Parent1 {
	
	//child2 is present in diff package. hence imported a package with class name.
	 public void m1() {
		System.out.println("I am from diff child ");
	}
	
	public static void main(String[] args) {
		Parent1 parent1 = new Diff_Pkg_Child2();
		parent1.m2();//public method in other class and its part of other package.
		//parent1.m1(10);
		parent1.m1();//sop executed from child, ovveride method.
	}
		
}//end of class.
	

