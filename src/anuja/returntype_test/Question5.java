package anuja.returntype_test;
//out put is- even number.
//if output is true-condition is if true then print even num

public class Question5 {
	public static void main(String[] args) {
		Question5 question5 = new Question5();
		boolean flag = question5.checkOdd(4);
		if (flag) 
			print("even number");
		else
			print("odd number");
	}
	
	static String print(String string) {
		System.out.println(string);
		return string;
	}
	
	boolean checkOdd (int num) {
		if (num % 2 ==0)
			return true;
		return false;
		
	}
	
}
