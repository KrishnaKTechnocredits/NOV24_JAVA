package premG;

public class Calculator {
		int num1 =5;
		int num2 =10;
		int ans1;
		int ans2;
		int ans3;
		int ans4;
		
		void add(int num1, int num2){		
			ans1 = num1 +num2;	
			System.out.println("Addition answer is :" + ans1);
		}	
		void sub(){			
			ans2 = num1 -num2;
			System.out.println("Substraction answer is: " + ans2);
		}	
		void mul(){		
			ans3 = num1 *num2;
			System.out.println("Multiplication answer is: " + ans3);
			
		}	
		void div(){		
			ans4 = num1 /num2;
			System.out.println("Division answer is: " + ans4);
		}
		
		public static void main(String[] args){
			Calculator calculator = new Calculator();
			int x= 10, y =12;
			calculator.add(x,y);
			calculator.sub();
			calculator.mul();
			calculator.div();
	}
}
