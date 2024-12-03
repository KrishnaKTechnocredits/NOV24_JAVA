package siddharth;

//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
public class Assignment31 {

	int getSumDiff(String str) {
		int sumEven = 0;
		int sumOdd = 0;
		System.out.println("Input is : "+str);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					sumEven = sumEven + num;
				} else {
					sumOdd = sumOdd + num;
				}
			}
		}
		return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		int ans1 = assignment31.getSumDiff("te1ch2no3cre7dits");
		System.out.println("Output is : "+ans1);
		int ans2 = assignment31.getSumDiff("4563");
		System.out.println("Output is : "+ans2);
	}
}
