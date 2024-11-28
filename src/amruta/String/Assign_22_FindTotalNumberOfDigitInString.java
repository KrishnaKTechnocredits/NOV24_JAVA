/* Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
*/

package amruta.String;

public class Assign_22_FindTotalNumberOfDigitInString {

	static int digitCount = 0;

	int findDigitInString(String str){
		for(int index = 0; index < str.length(); index++){
			if(Character.isDigit(str.charAt(index)))
				Assign_22_FindTotalNumberOfDigitInString.digitCount++;
			}
		return digitCount;
	}	

	public static void main(String[] args) {
		String str = "aa1kan33ks4h5a";
		Assign_22_FindTotalNumberOfDigitInString a22 = new Assign_22_FindTotalNumberOfDigitInString();
		int count = a22.findDigitInString(str);
		System.out.println("Total digit count in given String is " + count);
	}
}
