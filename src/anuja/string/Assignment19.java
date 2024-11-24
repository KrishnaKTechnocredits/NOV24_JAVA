package anuja.string;
/*Print all the characters of given string in reverse order. /te ch3no*/
public class Assignment19 {

	String getDirectSring(String str) {
		int stringLength = str.length();// save the string length.
		System.out.println("Output is as below to print each alphabet in normal  order in new line \n ");
		System.out.println("getDirectSring method executed \n ");
		//use for loop, to iterate entire string but in reverse ordser.
		for (int index=0;index<=stringLength-1;index++){
			System.out.println( str.charAt(index));
		}
		return str;
	}
	
	String getReverseString(String str) {
		int stringLength = str.length();// save the string length.
		System.out.println("------------------------------------");
		System.out.println("Outout is as below to print each alphabet in reverse order in new line for string.");
		System.out.println("getReverseSring method executed \n ");
		//use for loop, to iterate entire string but in reverse ordser.
		//for loop logic is, str length-1 to get index in range, and index-- to reduce till0 , and put conition to check
		//logic if index >=0 then stop it
		for (int index1=stringLength-1;index1>=0;index1--){
			System.out.println( str.charAt(index1));
		}
		return str;
	}

	//main method
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();	
		assignment19.getDirectSring("te ch3no");
		assignment19.getReverseString("te ch3no");
	}
}
