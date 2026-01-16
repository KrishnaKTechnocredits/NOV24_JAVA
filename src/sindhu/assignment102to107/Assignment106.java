/*Print Fibonacci Series
📥 Input: 10
📤 Output: 0 1 1 2 3 5 8 13 21 34*/

package sindhu.assignment102to107;

public class Assignment106 {
	public static void main(String[] args) {
		int num =10;
		Assignment106 a106 = new Assignment106();
		a106.getFibonacciSeries(num);
	}
	
	public void getFibonacciSeries(int num) {
		int first=0, second=1;
		System.out.println("The fibonacci series of given num is: ");
		System.out.println(first);
		System.out.println(second);
		for(int count=3; count<num; count++){
			int next = first + second;
			first=second;
			second = next;
			System.out.println(next);
		}
		
	}
}
