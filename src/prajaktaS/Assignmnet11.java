package prajaktaS;

public class Assignmnet11 {
	
	void max(int num1, int num2) {
		if (num1<num2)
		{
		System.out.println("num1: "+num1);
		System.out.println("num1: "+num2);
		System.out.println(num2 +" greater than "+ num1+ " between "+num1 +" and "+num2);
		}
	}
	
	void min(int num1, int num2) {
		if (num1<num2)
		{
			System.out.println("num1: "+num1);
			System.out.println("num1: "+num2);
			System.out.println(num1 +" smaller than "+ num2 + " between "+num1 +" and "+num2);
		}
	} 
	
	public static void main(String[] args) {
		Assignmnet11 assignment11=new Assignmnet11();
		assignment11.max(15, 30);
		assignment11.min(15,30);
	}

}
