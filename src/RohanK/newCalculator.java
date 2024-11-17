package RohanK;
class newCalculator{
	int num1 =10;
	int num2 =2;
	int add;
	int sub;
	int mul;
	int div;
	int totle;

	void Addition(){
		add = num1+num2;
		System.out.println("Addition is "+add);
	}
	void substraction(){
		sub = num1-num2;
		System.out.println("Substraction is "+sub);
	}
	void multiplication(){
		mul = num1*num2;
		System.out.println("Multiplication is "+mul);
	}
	void divition(){
		div = num1/num2;
		System.out.println("Divition is "+div);
	}
	void totle(){
		totle = add+sub+mul+div;
		System.out.println("All totle is "+totle);
	}
	
	public static void main(String[] args){
		newCalculator calculator1 = new newCalculator();
		calculator1.Addition();
		calculator1.substraction();
		calculator1.multiplication();
		calculator1.divition();
		calculator1.totle();
	}
}