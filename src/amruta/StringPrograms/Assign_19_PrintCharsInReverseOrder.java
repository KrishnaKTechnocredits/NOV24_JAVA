/*
 * Assignment - 19 : 24rd Nov'2024 [20 mins]
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

package amruta.StringPrograms;

public class Assign_19_PrintCharsInReverseOrder {

	void printCharacterInReverseOrder(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assign_19_PrintCharsInReverseOrder a19 = new Assign_19_PrintCharsInReverseOrder();
		a19.printCharacterInReverseOrder("te ch3no");
	}
}
