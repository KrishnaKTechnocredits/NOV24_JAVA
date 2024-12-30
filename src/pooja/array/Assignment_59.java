package pooja.array;
import java.util.Arrays;
/*Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
*/
public class Assignment_59 {

	void getSecondMaxStringsFromArray(String[] input) {
		String maxString = input[0];
		String secondMaxString = input[1];

		if (maxString.length() < secondMaxString.length()) {
			maxString = input[1];
			secondMaxString = input[0];
		}
		for (int i = 2; i < input.length - 1; i++) {
			if (input[i].length() > maxString.length()) {
				secondMaxString = maxString;
				maxString = input[i];
			} else if (input[i].length() >= secondMaxString.length()) {
				secondMaxString = input[i];
			}
		}
//			System.out.println(secondMaxString);	
		printAllSecondMaxStringFromArray(input, secondMaxString);
	}

	void printAllSecondMaxStringFromArray(String[] arr, String secondMaxString) {
		System.out.print("All Seconnd maximum length strings are : ");
		System.out.print(" [ ");
		for (int i = 2; i < arr.length; i++) {
			String str = arr[i];
			if (str.length() == secondMaxString.length()) {
				System.out.print(str + " ");
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_59 assignment_59 = new Assignment_59();
		System.out.println("The given String array is : " + Arrays.toString(input));
		assignment_59.getSecondMaxStringsFromArray(input);
	}
}