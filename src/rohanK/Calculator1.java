package rohanK;
class Calculator1{
	int num1 =10;
	int num2 =2;

	void Addition(){
		int add = num1+num2;
		System.out.println("Addition is "+add);
	}
	void substraction(){
		int sub = num1-num2;
		System.out.println("Substraction is "+sub);
	}
	void multiplication(){
		int mul = num1*num2;
		System.out.println("Multiplication is "+mul);
	}
	void divition(){
		int div = num1/num2;
		System.out.println("Divition is "+div);
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.Addition();
		calculator1.substraction();
		calculator1.multiplication();
		calculator1.divition();
	}
}