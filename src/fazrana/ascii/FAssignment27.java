//Assignment - 27 : 2nd Dec'2024 [10 mins]
//
//Write a method which returns character of given ascii value.
//
//input : 65
//output : A
//
//input : 90
//output : Z
//
//input : 55
//output : 8 

package fazrana.ascii;

public class FAssignment27 {
	
	char getChar(int asciiValue) {
		char ch=(char) asciiValue;
		return ch;
	}
	
	public static void main(String[] args) {
		FAssignment27 fassignment27=new FAssignment27();
		char ret=fassignment27.getChar(65);
		System.out.println("Character of value 65 is "+ret);
		
		System.out.println("Character of value 90 is "+fassignment27.getChar(90));
		System.out.println("Character of value 55 is "+fassignment27.getChar(55));
	}
}
