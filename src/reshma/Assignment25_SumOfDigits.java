package reshma;

public class Assignment25_SumOfDigits {
	int Digitcount = 0;
	char ch;

	void printSumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				Digitcount++;
				sum += Character.getNumericValue(ch);
				}
		}
		System.out.println("sum of all digits present in given string is: " + sum);

	}

	public static void main(String[] args) {
		Assignment25_SumOfDigits assignment25 = new Assignment25_SumOfDigits();
		assignment25.printSumOfDigits("te1ch2no3cre7dits");
		assignment25.printSumOfDigits("techno");
		assignment25.printSumOfDigits("4563");
		}
	
	//with return type
	/*int printSumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				Digitcount++;
				sum += Character.getNumericValue(ch);
				}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment25_SumOfDigits assignment25 = new Assignment25_SumOfDigits();
		String str="te1ch2no3cre7dits";
		int sumOfDigits=assignment25.printSumOfDigits(str);
		System.out.println("sum of all digits present in given string is: " + sumOfDigits);
		
		str="techno";
		sumOfDigits=assignment25.printSumOfDigits(str);
		System.out.println("sum of all digits present in given string is: " + sumOfDigits);
		
		str="4563";
		sumOfDigits=assignment25.printSumOfDigits(str);
		System.out.println("sum of all digits present in given string is: " + sumOfDigits);
		}*/
}
