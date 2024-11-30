package mahesh;

public class CompareNumbers {
	
	void smallerNumber (int num1, int num2) {
		
		if (num1<num2) {
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}
		else if (num1>num2) {
			System.out.println(num2+" is smaller between "+num1+" and "+num2);
		}
		else {
			System.out.println("Both numbers "+num1+" and "+num2+" are equal.");
		}
		System.out.println("---------------------------------------------------");
	}
	

	void biggerNumber (int num1, int num2) {
		
		if (num1>num2) {
			System.out.println(num1+" is bigger between "+num1+" and "+num2);
		}
		else if (num1<num2) {
			System.out.println(num2+" is bigger between "+num1+" and "+num2);
		}
		else {
			System.out.println("Both numbers "+num1+" and "+num2+" are equal.");
		}
	}
	
	public static void main(String[] args) {
		CompareNumbers comparenumbers = new CompareNumbers();
		comparenumbers.smallerNumber(10, 17);
		comparenumbers.biggerNumber(10, 17);
	}
}
