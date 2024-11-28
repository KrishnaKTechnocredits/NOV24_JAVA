//Print sum of digits in given string and for characters find ascii of it .Then find sum of all ascii values.

package titiksha.Chararcterclass;

public class Sumofdigitingiven_string {
	int count;
	int sum;
	int ascii;
	int sum1;

	int getSumOfDigit(String name) {

		for (int index = 0; index < name.length(); index++) {
			int ch = name.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);
				count++;
			} else {
				char num = name.charAt(index);
				ch = (int) num;
				sum1 = sum1 + ch;
				System.out.println("The ascii value of:" + num + " is " + ch);
			}
		}
		System.out.println("\n" + "The sum of ascii value is:" + sum1);
		System.out.println("\n" + "The sum of digits are:");
		return sum;
	}

	public static void main(String[] args) {
		Sumofdigitingiven_string sumofdigit = new Sumofdigitingiven_string();
		int sumdigit = sumofdigit.getSumOfDigit("Te3chnocre12dit5");
		System.out.println(sumdigit);
	}

}
