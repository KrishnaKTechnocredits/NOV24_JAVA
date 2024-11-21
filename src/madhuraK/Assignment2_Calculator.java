package madhuraK;

public class Assignment2_Calculator {
		 
		 int num1 = 10;
		 int num2 = 2;
		 int ans;
		 
		 void add(){
			ans = num1 + num2;
			System.out.println ("Addition is " + ans);
		}
		
		void subtract(){
			ans = num1 - num2;
			System.out.println ("Subtraction is " + ans);
		}
		
		void multiply(){
			ans = num1 * num2;
			System.out.println ("Multiplication is " + ans);
		}
		
		void division(){
			ans = num1/num2;
			System.out.println ("Division is " + ans);
		}

		public static void main (String [] args){
			Assignment2_Calculator calculator = new Assignment2_Calculator();
			calculator.add();
			calculator.subtract();
			calculator.multiply();
			calculator.division();
		}
	}
