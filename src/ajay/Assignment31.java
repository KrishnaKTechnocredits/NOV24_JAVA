package ajay;

public class Assignment31 {
	int sumOdd=0;
	int sumEven=0;
	int diff;
	void sumOfOddNumber(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean flag=Character.isDigit(ch);
			if(flag) {
				int odd_digit=Character.getNumericValue(ch);
				if(odd_digit%2==1) {
					sumOdd=sumOdd+odd_digit;
				}
			}
		
		}
	}
	
	void sumOfEvenNo(String str){
		for(int j=0;j<str.length();j++) {
			char ch=str.charAt(j);
			boolean flag=Character.isDigit(ch);
			if(flag) {
				int even_digit=Character.getNumericValue(ch);
				if(even_digit%2==0) {
					sumEven=sumEven+even_digit;
				}
			}
		}
	}
	
	void difference() {
		
		diff=sumOdd-sumEven;
		System.out.println("Difference of Sum of All Odd Nos and Even Nos in given String is " +diff);
	}

	public static void main(String[] args) {
		Assignment31 assignment31=new Assignment31();
		assignment31.sumOfOddNumber("te1ch2no3cre7dits");
		assignment31.sumOfEvenNo("te1ch2no3cre7dits");
		assignment31.difference();
		assignment31.sumOdd = 0;
	    assignment31.sumEven = 0;
		assignment31.sumOfOddNumber("4563");
		assignment31.sumOfEvenNo("4563");
		assignment31.difference();

	}

}
