package ravindra;

public class SumOfEvenDigitInString {
	int evenNumSum(String name) {
		int sumOfEvenNum=0;
		for(int i=0;i<name.length();i++) {			
			char chars=name.charAt(i);
			if(Character.isDigit(chars)) {
				int digit=Character.getNumericValue(chars);
				if(digit%2==0) {
					sumOfEvenNum=sumOfEvenNum+digit;
				}
			}
		}return sumOfEvenNum;
	}
	
	public static void main(String[] args) {
		SumOfEvenDigitInString a=new SumOfEvenDigitInString();
		int sum=a.evenNumSum("te1ch2no3cre7dits");
		System.out.println(sum);
		
		int sum2=a.evenNumSum("techno");
		System.out.println(sum2);
		
		int sum3=a.evenNumSum("4563");
		System.out.println(sum3);
	}
}