package poojaR;

class Assignment1{
	int num1 = 10;
	int num2 = 2;
	int ans;
	
	void addition(){
		ans = num1 + num2;
		System.out.println("Addition is = " + ans);
	}
	void subtract(){
		ans = num1 - num2;
		System.out.println("Subtraction is = " + ans);		
	}	
	
	void multiply(){
		ans = num1 * num2;
		System.out.println("Multiplication is = " + ans);
	}
	
	void division(){
		ans = num1 / num2;
		System.out.println("Division is = " + ans);
	}	
	
	public static void main(String[] arg){
		Assignment1 assignment1 = new Assignment1();
		assignment1.addition();
		assignment1.subtract();
		assignment1.multiply();
		assignment1.division();
	}
}