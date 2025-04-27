package diya;

public class Assignment2Calc {
	int a=10;
	int b=5;
	int total;
	
	void add(){
		System.out.println("Answer is"+" "+ (a+b));
	}
	
	void substract(){
		
		System.out.println("Answer is"+" "+ (a-b));
	}
	
	void multiply(){
		;
		System.out.println("Answer is"+" "+ (a*b));
	}
	
	void divide(){
		
		System.out.println("Answer is"+" "+ (a/b));
	}
	
	void total(){
		total=((a+b)+(a-b)+(a*b)+(a/b));
		System.out.println("Addition of all the answers is"+" "+total);
			
		
	}
	public static void main(String[] args){
		Assignment2Calc Assignment2Calc=new Assignment2Calc();
		Assignment2Calc.add();
		Assignment2Calc.substract();
		Assignment2Calc.multiply();
		Assignment2Calc.divide();
		Assignment2Calc.total();
	}
}