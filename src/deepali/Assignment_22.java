package deepali;

/*Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
*/
public class Assignment_22 {
	int count;

	void getDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true) {
				count++;
			}
		}
		System.out.println("Total"+" "+ count+" "+ "digits are their in input");
	}

	public static void main(String[] args) {
		Assignment_22 assignment = new Assignment_22();
		assignment.getDigit("aa1kan33ks4h5a");
	}
}
