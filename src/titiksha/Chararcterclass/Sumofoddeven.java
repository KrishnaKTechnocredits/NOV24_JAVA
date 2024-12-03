//Assignment - 25 : 2nd Dec'2024 [20 mins]
//Sum of all the digits present in a given String. 
//input : "te1ch2no3cre7dits"
//output : 13
//input : "techno"
//output : 0
//input : "4563"
//output : 18

//Assignment - 31 : 2nd Dec'2024 [15 mins]
//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
//input : "te1ch2no3cre7dits"
//output : 9
//input : "4563"
//output : -2

package titiksha.Chararcterclass;

public class Sumofoddeven {
	
	

	int getSumOfNumbers(String str) {
		int sum=0;
		for (int index = 0; index < str.length(); index++) {
			int ch = str.charAt(index);
			boolean digit = Character.isDigit(ch);
			if (digit == true) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	int getSumOfEvenOddNumbers(String str2) {
		int sum1=0,sum2=0;
		for (int index = 0; index < str2.length(); index++) {
			int ch = str2.charAt(index);
			boolean flag1 = Character.isDigit(ch);
			if (flag1 == true) {
				int num1 = Character.getNumericValue(ch);
				if (num1 % 2 == 0) {
					sum1 += num1;
				}

				else {
					sum2 = sum2 + num1;}
			}
		}
		return sum1 - sum2;
	}
	

	public static void main(String[] args) {
		Sumofoddeven sumofoddeven = new Sumofoddeven();
		
		String Ssum = "te1ch2no3cre7dits";
		System.out.println("Sum of digits in given string is: " + sumofoddeven.getSumOfNumbers(Ssum));
		
		int sum1 = sumofoddeven.getSumOfNumbers("te4ch5no6cre3dits");
		System.out.println("Sum of digits in given 2nd string is: " + sum1);
		
		Sumofoddeven sumofoddeven1 = new Sumofoddeven();
		int sum2 = sumofoddeven1.getSumOfEvenOddNumbers("te1ch2no3cre7dits");
		int sum3 = sumofoddeven1.getSumOfEvenOddNumbers("te4ch5no6cre3dits");
		System.out.println("The output from even -odd digits from given string is: " + sum2);
		System.out.println("The output from even -odd digits from given string is: " + sum3);
	}
}
