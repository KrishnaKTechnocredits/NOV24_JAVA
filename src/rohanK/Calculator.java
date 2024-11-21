package rohanK;
class Calculator{
	int num1 = 10;
	int num2 = 2;
	int ans;
	
	void add(){
		ans = num1+num2;
		System.out.println("Addition answer is "+ ans);	
	}
	
	void substract(){
		ans = num1-num2;
		System.out.println("substract answer is "+ ans);	
	}
	
	void Multiplication(){
		ans = num1*num2;
		System.out.println("Multiplication answer is "+ ans);	
	}
	
	void divition(){
		ans = num1/num2;
		System.out.println("divition answer is "+ ans);	
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.substract();
		calculator.Multiplication();
		calculator.divition();
	}
} 