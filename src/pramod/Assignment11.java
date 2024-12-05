/*Assignment - 11 : 20th Nov'2024 [15 mins]

Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17. */

package pramod;
class Assignment11 {
	
	void printMinNumber(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}
		else {
			System.out.println(num2+" is smaller between "+num1+" and "+num2);
		}
	}
	
	void printMaxNumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+" is bigger between "+num1+" and "+num2);
		}
		else {
			System.out.println(num2+" is bigger between "+num1+" and "+num2);
		}	
	}
	
	public static void main(String[] args) {
		Assignment11 numbers = new Assignment11();
		numbers.printMinNumber(10,17);
		numbers.printMaxNumber(10,17);
	}
}