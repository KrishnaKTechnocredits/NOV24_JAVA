package AmrutaK;

public class Assignment_2 {
		int num1 = 10;
		int num2 = 2;
		
		void add(){
			int output = num1 + num2;
			System.out.println("Sum of "+num1+" and "+num2+" is -- "+output);
		}
		
		void subtract(){
			int output = num1 - num2;
			System.out.println("Subtraction of "+num1+" and "+num2+" is -- "+output);
		}
		
		void multiplication(){
			int output = num1 * num2;
			System.out.println("Multiplication of "+num1+" and "+num2+" is  -- "+output);
		}
		
		void division(){
			int output = num1 / num2;
			System.out.println("Sum of "+num1+" and "+num2+" is -- "+output);
		}
		
		public static void main(String[] args){
			Assignment_2 a2 = new Assignment_2();
			a2.add();
			a2.subtract();
			a2.multiplication();
			a2.division();
		}
}
