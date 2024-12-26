/*
 * Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
 */

package rohan;

public class Assignment_59 {

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "aashvi", "GlobantPune", "Ashvik", "Technocredits", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_59 assignment = new Assignment_59();
		assignment.PrintSecMaxName(input);
	}

	void PrintSecMaxName(String[] input) {
		String max = input[0];
		String SecMax = input[1];
		if (max.length() < input[1].length()) {
			SecMax = max;
			max = input[1];
		}
		for (int i = 2; i < input.length; i++) {
			if (max.length() <= input[i].length()) {
				SecMax = max;
				max = input[i];
			} else if (SecMax.length() <= input[i].length()) {
				SecMax = input[i];
			}			
		}
		AllSecMaxName(input,SecMax.length());
	}
	void AllSecMaxName(String[] input,int Targetlength) {
		for(int i=0 ;i<input.length;i++) {
			if(input[i].length()==Targetlength) {
				System.out.println(input[i]); 
			}
		}
	}
}
