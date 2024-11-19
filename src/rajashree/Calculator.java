package rajashree;
class Calculator{
	int num1 = 10;
	int num2 = 2;
	int ans;
	
	void add(){
		ans = num1+num2;
		System.out.println("Addition is" + ans);
	}
	
	void subtraction(){	
		ans = num1-num2;
		System.out.println("Substaction is" + ans);
	}
	
	void multiply(){
		ans =num1*num2;
		System.out.println("Multiplication is" + ans);
	}
	
	void division(){	
		ans =num1/num2;
		System.out.println("Division is" + ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subtraction();
		calculator.multiply();
		calculator.division();
	}
}
		