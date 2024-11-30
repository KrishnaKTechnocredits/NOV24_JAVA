package technocredits.loopdemo;

public class Assignment3 {
		int num1=10;
		int num2=2;
		int addans;
		int subans;
		int mulans;
		int divans;
		//int Total;
		
		void addition(){
			addans = num1+num2;
			System.out.println("Addition is " + addans );
		}
		void subtraction(){
			subans = num1-num2; 
			System.out.println("Subtraction is " + subans );
		}
		void multiplication(){
			mulans = num1*num2;
			System.out.println("Multiplication is " + mulans );
		}
		void division(){
			divans = num1/num2;
			System.out.println("Division is " + divans );
		}
		void printTotalAns(){
			//Total = divans + mulans + subans + addans;
			System.out.println("Total answer is " + (divans + mulans + subans + addans) );
			
		}
		public static void main(String[]args){
			Assignment3 assignment3 = new Assignment3();
			assignment3.addition();
			assignment3.subtraction();
			assignment3.multiplication();
			assignment3.division();
			assignment3.printTotalAns();
		}
			
}
