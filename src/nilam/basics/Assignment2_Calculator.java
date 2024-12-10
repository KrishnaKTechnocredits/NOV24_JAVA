package nilam.basics;

public class Assignment2_Calculator {
	int num1=10;
	int num2=2;
	int ans1,ans2,ans3,ans4,ans;
		
	void displaynum() {
		System.out.println("Num1=" +num1+ " "+ "Num2=" + num2);
	}
				
	void add(){
		ans1 = num1+num2;
		System.out.println("Addition = " +ans1);
	}
			
	void sub(){
		ans2 = num1-num2;
		System.out.println("Substraction= " +ans2);
	}
			
	void mul(){
		ans3 = num1*num2;
		System.out.println("Multiplication= " +ans3);
	}
			
	void div(){
		ans4 = num1/num2;
		System.out.println("Division= " +ans4);
	}
			
	void ans(){
		System.out.println("Total= " +(ans1 +ans2 +ans3 +ans4));
	}
			
	public static void main(String[] args){			
		Assignment2_Calculator assignment2_calculator= new Assignment2_Calculator();
		assignment2_calculator.displaynum();
		assignment2_calculator.add();
		assignment2_calculator.sub();
		assignment2_calculator.mul();
		assignment2_calculator.div();
		assignment2_calculator.ans();
	}
}

