package siddharth;
/*
Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
 */

public class Assignment58 {

	void getSecondMaxLength(String[] input){
		String max=input[0];
		String SecondMax=input[1];
		
		if(max.length()<SecondMax.length()) {
		max = input[1];
		SecondMax=input[0];
		}
		
		for(int i=2;i<input.length;i++) {
				if(max.length()<input[i].length()) {
					SecondMax=max;
					max=input[i];
				}else if(SecondMax.length()<=input[i].length()) { // Using <= here will give last Second maximum. < will give 1st Second max
					SecondMax=input[i];
				}
			}
			System.out.println("Output : "+SecondMax); 
	}
	
	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		assignment58.getSecondMaxLength(input);
	}
}
