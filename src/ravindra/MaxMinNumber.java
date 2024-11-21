//Assignment11
package ravindra;

public class MaxMinNumber {
	void minNumber(int num1,int num2) {
		if(num1<num2) {
			System.out.println(num1+" is smaller between "+num1 +" and "+num2+".");
		}
		else {
			System.out.println(num2+" is bigger between "+num1 +" and "+num2+".");
		}
	}
	
	void maxNumber(int num1,int num2) {
		if(num2>num1) {
			System.out.println(num2+" is bigger between "+num1 +" and "+num2+".");
		}
		else {
			System.out.println(num1+" is smaller between "+num1 +" and "+num2+".");
		}
	}
	
	public static void main(String []args) {
		MaxMinNumber maxMinNumber=new MaxMinNumber();
		maxMinNumber.minNumber(10, 17);
		maxMinNumber.maxNumber(10,17);
	}
}
