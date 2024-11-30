package nitish;

public class Conditional_Assignment11 {
	
	void greater(int num1,int num2) {
		if(num1>num2) {
			System.out.println("The greater no. between "+num1+" and "+num2+" is "+num1);
		}else {
			System.out.println("The greater no. between "+num1+" and "+num2+" is "+num2);
		}
	}
	
	void smaller(int num1,int num2) {
		if(num1>num2) {
			System.out.println("The smaller no. between "+num1+" and "+num2+" is "+num2);
		}else {
			System.out.println("The smaller no. between "+num1+" and "+num2+" is "+num1);
		}
	}

	public static void main(String[] args) {
		Conditional_Assignment11 conditional_Assignment11 = new Conditional_Assignment11();
		conditional_Assignment11.greater(111,222);
		conditional_Assignment11.smaller(150,190);

	}

}
