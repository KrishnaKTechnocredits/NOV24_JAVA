package siddharthK;

class Calculator2{
	
	int num1 = 10;
	int num2 = 2;
	int addAns; 
	int subAns; 
	int multAns; 
	int divAns; 
	
	void add(){
		addAns = num1+num2;
		System.out.println("Addition answer is "+addAns);
	}
	
	void sub(){
		subAns = num1-num2;
		System.out.println("Substraction answer is "+subAns);
	}
	
	void mult(){
		multAns = num1*num2;
		System.out.println("Multiplication answer is "+multAns);
	}
	
	void div(){
		divAns = num1/num2;
		System.out.println("Division Answer is "+divAns);
	}
	
	void printAns(){
		System.out.println("Answer is "+(addAns+subAns+multAns+divAns));
	}
	
	public static void main(String[] args){
		Calculator2 calculator2 = new Calculator2();
		calculator2.add();
		calculator2.sub();
		calculator2.mult();
		calculator2.div();
		calculator2.printAns();
	}
}