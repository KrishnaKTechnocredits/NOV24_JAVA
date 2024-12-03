package anuja.string;

/*Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/
public class Assignment25 {

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		
		String str1 = "te1ch2no3cre7dits";
		int result1 = assignment25.getSumOfAllDigitFromString(str1);
		System.out.println("Sum of all digits from string: " + str1 + " is -> " + result1 + ". \n");
		
		String str2 = "techno";
		int result2 = assignment25.getSumOfAllDigitFromString(str2);
		System.out.println("Sum of all digits from string: " + str2 + " is -> " + result2 + ". \n");
		
		String str3 = "4563";
		int result3 = assignment25.getSumOfAllDigitFromString(str3);
		System.out.println("Sum of all digits from string: " + str3 + " is -> " + result3 + ". \n");
	}

	public int getSumOfAllDigitFromString(String str) {
		int sum = 0;
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			//get digit from the char, method from character class.
			if (Character.isDigit(str.charAt(i))) {
				num = Character.getNumericValue(str.charAt(i));
				sum = sum + num;
			}
		}
		return sum;

	}

}
