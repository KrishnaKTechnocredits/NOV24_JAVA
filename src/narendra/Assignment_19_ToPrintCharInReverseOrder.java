package narendra;
/*
Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t 
*/

public class Assignment_19_ToPrintCharInReverseOrder {
	
	void printCharInReverse(String strInput) {
		System.out.println("Output1 - all char:");
		int strLength = strInput.length();
		for(int index=0; index<strLength; index++) {
			System.out.print(strInput.charAt(index));
		}
		
		System.out.println("\n" + "\n" + "Outupt2 -reverse char:");
		for(int index=strLength-1; index>=0; index--) {
			char chr = strInput.charAt(index);
			System.out.println(chr);
		}
		
	}

	public static void main(String[] args) {
		Assignment_19_ToPrintCharInReverseOrder printcharinreverse = new Assignment_19_ToPrintCharInReverseOrder();
		printcharinreverse.printCharInReverse("te ch3no");

	}

}