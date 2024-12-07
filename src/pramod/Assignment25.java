/*Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18

*/

package pramod;

class Assignment25 {
	
	int sumOfDigits(String str) {
		System.out.println("Given string is " + str);
		int sum=0;
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment25 sd = new Assignment25();
		int answer;
		answer = sd.sumOfDigits("te1ch2no3cre7dits");
		System.out.println("Sum of all the digits present in a string is " + answer);

		answer = sd.sumOfDigits("techno");
		System.out.println("Sum of all the digits present in a string is " + answer);

		answer = sd.sumOfDigits("4563");
		System.out.println("Sum of all the digits present in a string is " + answer);
	}
}