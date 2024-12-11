package kishor;
//return the difference of Sum of all the odd digits and even digits present in a given String.

public class Assignment31_ReturnNumber {
	
	int getDifferenceNumber(String str) {
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				if(ch%2==0) {
					int evenNumber = Character.getNumericValue(ch);//ch will give ascii value,thats why convert to numeric
					evenSum = evenSum+evenNumber;
				}
				else {
					int oddNumber = Character.getNumericValue(ch);
					oddSum = oddSum+oddNumber;
				}
			}
		}
		int difference = oddSum-evenSum;
		return difference;
	}
	
	public static void main(String[] args) {
		Assignment31_ReturnNumber assignment31 = new Assignment31_ReturnNumber();
		int ans1=assignment31.getDifferenceNumber("te1ch2no3cre7dits");
		System.out.println("The different of all the odd and even sum is:- "+ ans1);
		int ans2=assignment31.getDifferenceNumber("4563");
		System.out.println("The different of all the odd and even sum is:- "+ ans2);
	}
}
