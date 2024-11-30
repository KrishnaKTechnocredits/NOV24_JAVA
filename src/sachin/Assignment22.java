package sachin;

//write a method to return total number of digits from the given input.

//print the count in main method.
//
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//
//Hint : boolean Character.isDigit(ch)

public class Assignment22 {

	int getCount(String input) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {

			boolean flag = Character.isDigit(input.charAt(index));

			// System.out.println(flag);

			if (flag == true) {

				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Assignment22 assignment22 = new Assignment22();

		// ''System.out.println();
		System.out.println(assignment22.getCount("aa1kan33ks4h5a"));
	}

}
