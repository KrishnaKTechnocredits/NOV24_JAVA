//Assignment - 22 : 25th Nov'2024 [20 mins]
//
//write a method to return total number of digits from the given input.
//print the count in main method.
//
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//
//Hint : boolean Character.isDigit(ch)
// 

package komal.String;

public class NumberCount {
	int getCountOfDigit(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NumberCount numberCount = new NumberCount();
		int count = numberCount.getCountOfDigit("aa1kan33ks4h5a");
		System.out.println("Total " + count + " digits are there in given input.");
	}

}
