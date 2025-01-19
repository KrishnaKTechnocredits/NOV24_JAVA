package vrushali.assciiProgram;
//Assignment - 27 : 2nd Dec'2024 [10 mins]
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

public class GetCharForAsciiValue {
	
	
	char getCharForGivenAsciiValue(int asciiValue)
	{
		char ch=(char) asciiValue;
		return ch;
	}
 public static void main(String[] args) {
	 GetCharForAsciiValue getCharForAsciiValue = new GetCharForAsciiValue();
	 
	 char ch=getCharForAsciiValue.getCharForGivenAsciiValue(65);
	 System.out.println("65  is  Ascii value of -> "+ch);
	 
	 ch=getCharForAsciiValue.getCharForGivenAsciiValue(90);
	 System.out.println("90 is  Ascii value of  -> "+ch);
	 
	 ch=getCharForAsciiValue.getCharForGivenAsciiValue(55);
	 System.out.println("55 is  Ascii value of  -> "+ch);
	
}
}
