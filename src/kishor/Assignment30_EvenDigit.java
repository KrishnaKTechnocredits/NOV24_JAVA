package kishor;
//Sum of all the even digits present in a given String. 

public class Assignment30_EvenDigit {
	
	void displayEvenDigitSum(String str) {
		int evenSum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				if(ch%2==0) {
					int numericNumber = Character.getNumericValue(ch);
					evenSum = evenSum+numericNumber;
				}
			}
		}
		System.out.println("The sum of even number in given string is:- "+evenSum);
	}
	
	public static void main(String[] args) {
		Assignment30_EvenDigit assignment30 = new Assignment30_EvenDigit();
		assignment30.displayEvenDigitSum("te1ch2no3cre7dits");
		assignment30.displayEvenDigitSum("techno");
		assignment30.displayEvenDigitSum("4563");
	}
}
