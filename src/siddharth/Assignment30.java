package siddharth;

//Sum of all the even digits present in a given String. 
public class Assignment30 {
	
	void getEvenSum(String str) {
		int sum = 0;
		System.out.println("Input : " + str);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					sum = sum + num;
				}
			}
		}
		System.out.println("Output : " + sum);
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.getEvenSum("te1ch2no3cre7dits");
		assignment30.getEvenSum("techno");
		assignment30.getEvenSum("4563");
	}
}
