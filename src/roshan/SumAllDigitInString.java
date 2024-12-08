package roshan;

public class SumAllDigitInString {
	
static int getDigitSum(String str) {
	int sum = 0;
	for(int index=0 ; index<str.length();index++) {
		 char ch = str.charAt(index);                          //is used to get the character at a specific position in a string
		 if(Character.isDigit(ch)) {                          //It returns true if the character ch is a digit (0-9), and false otherwise
			 int digit= Character.getNumericValue(ch); //will give numeric value of character
			 sum=sum +digit;
			 
		
		 }
		
	}
			
	return sum;		
		
}
	public static void main (String[] args){
		System.out.println("sum of all digit is " + SumAllDigitInString.getDigitSum("te1ch2no3cre7dits"));
		
	}
	
	

	
}








/*
 * Assignment - 25 : 2nd Dec'2024 [20 mins]
 * 
 * Sum of all the digits present in a given String. IMP
 * 
 * input : "te1ch2no3cre7dits" output : 13
 * 
 * input : "techno" output : 0
 * 
 * input : "4563" output : 18
 */