/*Assignment - 30 : 2nd Dec'2024 [15 mins]

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10
*/
package pramod;
class Assignment30 {

	void printSumOfEvenNumber(String str) {
		System.out.println("Given string is: " + str);
		int sum=0, digit=0;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				digit = Character.getNumericValue(ch);
				if(ch%2==0) {
					sum = sum + digit;
				}
			}
		}
		System.out.println("Sum of all even number present in given string is :" + sum);
	}
	
	public static void main(String[] args) {
		Assignment30 sumofeven = new Assignment30();
		sumofeven.printSumOfEvenNumber("te1ch2no3cre7dits");
		sumofeven.printSumOfEvenNumber("techno");
		sumofeven.printSumOfEvenNumber("4563");
	}
}