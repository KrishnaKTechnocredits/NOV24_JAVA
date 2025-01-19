/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits*/

package harshada.Array3;

public class MaxLenStrFrmArr {

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		String str = getMaxLenStrFromArray(input);
		System.out.println(str);

	}

	static String getMaxLenStrFromArray(String[] input) {
		String output = "";
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i].length() < input[j].length()) {
					output = input[j];
				}
			}
		}
		return output;
	}
}
