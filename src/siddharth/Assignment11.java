package siddharth;

public class Assignment11 {

	void biggerNumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println("Sample Input: "+num1+", "+num2);
			System.out.println("Output: Number "+num1+" is bigger between "+num1+" & "+num2);
		}else {
			System.out.println("Sample Input: "+num1+", "+num2);
			System.out.println("Output: Number "+num2+" is bigger between "+num1+" & "+num2);
		}
	}
		
		void smallerNumber(int num1, int num2) {
			if(num1<num2) {
				System.out.println("Sample Input: "+num1+", "+num2);
				System.out.println("Output: Number "+num1+" is smaller between "+num1+" & "+num2);
			}else {
				System.out.println("Sample Input: "+num1+", "+num2);
				System.out.println("Output: Number "+num2+" is smaller between "+num1+" & "+num2);
			}
	}
		
		public static void main(String[] args) {
			Assignment11 assignment11 = new Assignment11();
			assignment11.biggerNumber(10,17);
			assignment11.smallerNumber(10,17);
		}
}
