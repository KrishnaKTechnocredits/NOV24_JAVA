//Assignment - 26 : 2nd Dec'2024 [10 mins]
//
//Write a method which returns ascii value of given character. 
//
//input : 'A'
//output : 65
//
//input : 'x'
//output : 120
//
//input : ' '
//output : 32
//
//input : '.'
//output : 46

package fazrana.ascii;

public class FAssignment26 {
	
	void getAsciiValue(char cr) {
		int value= cr;
		System.out.println("Ascii value of "+cr+" is "+value);
//		return value;
	}
	
	public static void main(String[] args) {
		FAssignment26 fassignment26=new FAssignment26();
		fassignment26.getAsciiValue('A');
		fassignment26.getAsciiValue('x');
		fassignment26.getAsciiValue(' ');
		fassignment26.getAsciiValue('.');
	}

}
