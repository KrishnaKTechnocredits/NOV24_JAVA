//Assignment - 25 : 2nd Dec'2024 [20 mins]  ==== my time 10mins
//
//Sum of all the digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 13
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 18

//sum of all the even digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 2
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 10

//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
//
//input : "te1ch2no3cre7dits"
//output : 9
//
//input : "4563"
//output : -2

package komal.RelatedToAscii;

public class Assignment25 {
	int sum = 0, sumOfEven = 0, sumOfOdd = 0;

	int sumOfDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
				// for even num
				if (num % 2 == 0) {
					sumOfEven = sumOfEven + num;
				}
				// for odd num
				if (num % 2 != 0) {
					sumOfOdd = sumOfOdd + num;
				}
			}
		}
		System.out.println("Total sum of digits is : " + sum);
		int differnce = sumOfOdd - sumOfEven;

		return differnce;
	}

	public static void main(String args[]) {

		Assignment25 assignment25 = new Assignment25();
		int differnce = assignment25.sumOfDigit("te1ch2no3cre7dits");
		System.out.println("Sum of Even numbers : " + assignment25.sumOfEven);
		System.out.println("Sum of Odd numbers : " + assignment25.sumOfOdd);
		System.out.println("Differnce between  Odd numbers  and even number is: " + differnce);

	}
}
