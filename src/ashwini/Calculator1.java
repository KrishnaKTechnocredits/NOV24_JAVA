package ashwini;

class Calculator1{
	int num1 = 10;
	int num2 = 2;
	int addAns;
	int subAns;
	int multAns;
	int divAns;
	int total;

	void addition(){
		addAns = num1+num2;
	}
	
	void substraction(){
		subAns = num1 - num2;
	}
	
	void multiplication(){
		multAns = num1*num2;
	}
	
	void division(){
		divAns = num1/num2;
	}
	
	void printTotalAns(){
		total= addAns + subAns + multAns + divAns;
		System.out.println("Total Answer is "+ total);
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.addition();
		calculator1.substraction();
		calculator1.multiplication();
		calculator1.division();
		calculator1.printTotalAns();
	}
}