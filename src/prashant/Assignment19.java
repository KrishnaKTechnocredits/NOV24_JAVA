/*Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t  */	

package prashant;

public class Assignment19 {

	void printCharReverse(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {

			System.out.println(input.charAt(index));
		}

	}

	public static void main(String[] args) {

		Assignment19 assignment19 = new Assignment19();
		assignment19.printCharReverse("te ch3no");

	}

}
