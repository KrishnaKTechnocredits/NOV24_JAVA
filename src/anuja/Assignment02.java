package anuja;
/**Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input:  
num1 = 10;
num2 = 2;

Answer is 45*/
public class Assignment02 {
	
	 int x = 10;
	 int y = 2;
	 int sum;
	 int sub;
	 float div;
	 int mult;
	 float allAns;
		
	 void add() {
		 sum = (x+y);
		 System.out.println("Sum is " + sum +"\n");
		 System.out.println("-------------------------");
	}
	 
	 void sub() {
		 sub = (x-y);
		 System.out.println("Subtraction is " + sub +"\n");
		 System.out.println("-------------------------");
	}
	 
	 void division() {
		 sub = (x/y);
		 System.out.println("Division is " + sub +"\n");
		 System.out.println("-------------------------");
	}
	 
	 void multiplication() {
		 mult = (x*y);
		 System.out.println("Multiplication is " + mult +"\n");
		 System.out.println("-------------------------");
	}
	 
	 
	 void allAnsSum() {
		 allAns = sum+sub+div+mult;
		 System.out.println("Sum of all is " + allAns +"\n");
		 System.out.println("-------------------------");
	}


	 public static void main(String[] args) {
		 Assignment02 x = new Assignment02();
		 x.add();
		 x.sub();
		 x.division();
		 x.multiplication();
		 x.allAnsSum();
	 }
}

