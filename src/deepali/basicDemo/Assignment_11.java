package deepali.basicDemo;
/*Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
*/
public class Assignment_11 {
	
	void maxNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num2 +" " + "is smaller between "+ num1+" "+"&"+" "+num2 );
		}else {
			System.out.println(num2 +" " + "is greater between "+ num1+" "+"&"+" "+num2 );
		}	
	}
	void minNumber(int num1,int num2) {
		if(num1<num2) {
			System.out.println(num1 +" " + "is smaller between "+ num1+" "+"&"+" "+num2 );
		}else {
			System.out.println(num1 +" " + "is greater between "+ num1+" "+"&"+" "+num2 );
		}	
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment = new Assignment_11();
		assignment.minNumber(10,17);
		assignment.maxNumber(10,17);
	}
}
