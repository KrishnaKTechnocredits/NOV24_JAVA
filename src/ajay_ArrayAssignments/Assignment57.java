/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
------------------------------------------------------------------------------------------*/
package ajay_ArrayAssignments;

public class Assignment57 {
	
	
	String getMaxLengthString(String[] input) {
		String maxLengthString = ""; // To store the longest string
		
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLengthString.length()) {
				maxLengthString = input[i];
			}
		}
		
		return maxLengthString;
	}

	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune", "PuGlobantne"};
		
		
		String result = assignment57.getMaxLengthString(input);
		System.out.println("The maximum length string is: " + result +" and length is : " +result.length());
	}
}
