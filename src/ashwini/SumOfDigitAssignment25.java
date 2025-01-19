package ashwini;

public class SumOfDigitAssignment25 {
	int index;
	
	int getSumDigit(String str) {
		int sum=0;
	for(int index=0;index<str.length();index++) {
	char ch=str.charAt(index);

		boolean flag = Character.isDigit(str.charAt(index));
		if(flag==true) {
		sum= sum + Character.getNumericValue(ch);
		}
	}
		
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigitAssignment25 a25 =new SumOfDigitAssignment25();
		int ans1=a25.getSumDigit("te1ch2no3cre7dits");
		int ans2=a25.getSumDigit("techno");
		int ans3=a25.getSumDigit("4563");
		System.out.println("In String te1ch2no3cre7dits sum of digits are "+ ans1);
		System.out.println("In String techno sum of digits is " +ans2);
		System.out.println("In String 4563 sum of digits are " +ans3);
		

	}

}
