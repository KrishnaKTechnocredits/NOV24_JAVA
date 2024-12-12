package pooja.stringassignments;

/*Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/
public class Assignment_25 {
	
	void getSumOfDigitsInString(String str) {
		int sum =0;
		System.out.println("Given String : " + str );
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num ;							
			}
		}
		System.out.println("The Sum of Digits in String : " + sum);
	}

	public static void main(String[] args) {
		Assignment_25 assignment_25 = new Assignment_25();
		assignment_25.getSumOfDigitsInString("te1ch2no3cre7dits");
		System.out.println("--------------------------------");
		assignment_25.getSumOfDigitsInString("techno");
		System.out.println("--------------------------------");
		assignment_25.getSumOfDigitsInString("4563");
	}	
}