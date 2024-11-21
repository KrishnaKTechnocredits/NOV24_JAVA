package poojaR;
class Assignment2{
	int num1 = 10;
	int num2 = 2;
	int addAns,subAns,mulAns,divAns,ans;
	
	void addition(){
		addAns = num1 + num2;
		System.out.println("Addition is = " + addAns);
	}
	void subtract(){
		subAns = num1 - num2;
		System.out.println("Subtraction is = " + subAns);		
	}	
	
	void multiply(){
		mulAns = num1 * num2;
		System.out.println("Multiplication is = " + mulAns);
	}
	
	void division(){
		divAns = num1 / num2;
		System.out.println("Division is = " + divAns);
	}	
	
	void printTotalAns(){
		ans = addAns + subAns + mulAns + divAns;
		System.out.println("Total Answer is = " + ans);
	}
	
	public static void main(String[] arg){
		Assignment2 assignment2 = new Assignment2();
		assignment2.addition();
		assignment2.subtract();
		assignment2.multiply();
		assignment2.division();
		assignment2.printTotalAns();
	}
}