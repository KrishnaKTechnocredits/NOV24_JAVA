//Assignment - 26 : 2nd Dec'2024 [10 mins] === my time 5min
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
//------------------------------------
package komal.RelatedToAscii;

public class Assignment26 {
	void getAsciiValue(char ch) {
		int asciiValue = ch;
		System.out.println("Ascii value of ch is : " + asciiValue);
	}

	public static void main(String args[]) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.getAsciiValue(' ');
	}
}
