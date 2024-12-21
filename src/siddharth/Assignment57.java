package siddharth;

/*
Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
 */

public class Assignment57 {
	
	String getMaxLength(String[] input) {
		String max=input[0];
			for(int i=1;i<input.length;i++) {
				if(max.length() < input[i].length()) {
					max=input[i];
				}
			}
			return max;
	}
	
	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		String[] input ={"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		String ans = assignment57.getMaxLength(input);
		System.out.println(ans);
	}
}
