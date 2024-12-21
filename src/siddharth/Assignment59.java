package siddharth;
/*
Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
 */

public class Assignment59 {

	void getSecondMaxLength(String[] input) {
		String max = input[0];
		String SecondMax = input[1];

		if (max.length() < SecondMax.length()) {
			max = input[1];
			SecondMax = input[0];
		}

		for (int i = 2; i < input.length; i++) {
			if (max.length() < input[i].length()) {
				SecondMax = max;
				max = input[i];
			} else if (SecondMax.length() <= input[i].length()) { // Using <= here will give last Second maximum. < will
																	// give 1st Second max
				SecondMax = input[i];
			}
		}
		printAllSecondMax(input,SecondMax.length());
	}
	
	
	void printAllSecondMax(String[] input, int targetLength) {
		System.out.println("Output :");
		for(int index=0;index<input.length;index++) {
			if(input[index].length()==targetLength) {
				System.out.println(input[index]);
			}
		}
		
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		assignment59.getSecondMaxLength(input);
	}
}