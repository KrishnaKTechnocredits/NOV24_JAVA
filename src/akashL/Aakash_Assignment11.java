package akashL;

public class Aakash_Assignment11 {
	
	void method1(int num1, int num2) {
		if (num1<=num2) {
			System.out.println(num1+" is smaller than "+ num2);
		
		}else {
			System.out.println(num1+" is greater than "+ num2);
		}
	}
		
	void method2(int num1, int num2) {
		if (num1>=num2) {
			System.out.println(num1+" is greater than "+num2);	
		
		}else{
			System.out.println(num2+" is greater than "+ num1);
		}
	}
	
	public static void main(String[] args) {
		Aakash_Assignment11 aakash_Assignment11=new Aakash_Assignment11();
		aakash_Assignment11.method1(10, 17);
		aakash_Assignment11.method2(10, 17);
	}

}

