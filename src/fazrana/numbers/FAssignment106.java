//🔹 Assignment 106: Print Fibonacci Series
//📥 Input: 10
//📤 Output: 0 1 1 2 3 5 8 13 21 34

package fazrana.numbers;

public class FAssignment106 {
	void getFibonacci(int input) {
		int firstNum=0, secondNum=1;
		System.out.print("Output Fibonacci series: "+firstNum+" "+secondNum);
		
		for(int i=3;i<=input;i++) {
			int nextNum=firstNum+secondNum;
			System.out.print(" "+nextNum);
			firstNum=secondNum;
			secondNum=nextNum;
		}
	}
	
	public static void main(String[] args) {
		FAssignment106 fassignment106=new FAssignment106();
		fassignment106.getFibonacci(10);
	}
}
