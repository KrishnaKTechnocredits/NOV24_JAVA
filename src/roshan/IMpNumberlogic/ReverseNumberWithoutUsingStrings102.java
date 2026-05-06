package roshan.IMpNumberlogic;

public class ReverseNumberWithoutUsingStrings102 {
	int getReverseNum(int num) {
		int reverseNum = 0; //mitake declared this inside loop
		
		while(num !=0) {
		int lastDigit = num % 10; //will give last digit
		reverseNum = reverseNum * 10 + lastDigit; //will give reverse lastDiigt(first digit)
		num = num / 10;  //remove last digit

	}
		return reverseNum;

	}
	
	public static void main(String[] args) {
		int num = 1045;
		ReverseNumberWithoutUsingStrings102 reversenumberwithoutusingstrings102 = new ReverseNumberWithoutUsingStrings102();
		int result = reversenumberwithoutusingstrings102.getReverseNum(num);
		System.out.println("reverse no is: " + result);
	}

}
