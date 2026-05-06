package roshan.IMpNumberlogic;

public class PrintFibonacciSeries106 {
	  void getFibonacciSeries(int num) {
		  int num1=0;
		  int num2=1;
		  System.out.println(" " + num1 + "\n" +" " + num2);
		  for(int i=2;i<num;i++) {
			  int nextNum= num1 +num2;
			  System.out.println(" "+ nextNum );
			  num1=num2;
			  num2=nextNum;	  
		  }
		  
	  }
	

	public static void main(String[] args) {
		PrintFibonacciSeries106 printfibonacciseries106 = new PrintFibonacciSeries106();
		printfibonacciseries106.getFibonacciSeries(10);
	}
}
