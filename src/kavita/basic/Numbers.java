package kavita.basic;
/*Assignment - 11 :Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
Time: 10m */

public class Numbers {
	
	void maxnumber(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+ " is greater between "+num1+ " and " +num2);
		}else {
			System.out.println(num2+ " is greater between "+num1+ " and " +num2);
		}
	}
	
	void minnumber(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1+ " is smaller between "+num1+ " and " +num2);
		}else {
			System.out.println(num2+ " is smaller between "+num1+ " and " +num2);
		}
	}
	
	public static void main(String[] args) {
		Numbers number=new Numbers();
		number.maxnumber(10,17);
		number.minnumber(10,17);
	}	
}
