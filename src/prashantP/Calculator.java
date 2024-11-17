package prashantP;

class Calculator{
	int num1=10;
	int num2=2;
	int ans;

	void add(){
	  int ans=num1+num2;
	  System.out.println("The addation is-:"+ans);
	}
	
	void sub(){
	  int ans=num1-num2;
	  System.out.println("The substraction is-:"+ans);
	}
	
	void mul(){
	  int ans=num1*num2;
	  System.out.println("The multiplication is-:"+ans);
	}
	
	void div(){
	  int ans=num1/num2;
	  System.out.println("The division is-:"+ans);
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		
	}

}