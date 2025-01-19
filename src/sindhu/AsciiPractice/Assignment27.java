/*Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8*/

package sindhu.AsciiPractice;

public class Assignment27 {
	
	void getAsciiValue(int asciiVal) {
		char charval = (char)asciiVal;
		System.out.println("The character value of Ascii "+asciiVal+" is "+charval);
	}
	
	public static void main(String[] args) {
		Assignment27 assign27 = new Assignment27();
		int asciiVal = 65;
		assign27.getAsciiValue(asciiVal);
		 
		asciiVal = 90;
		assign27.getAsciiValue(asciiVal);
		
		asciiVal = 55;
		assign27.getAsciiValue(asciiVal);
	}

}
