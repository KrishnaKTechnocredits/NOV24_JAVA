/*Assignment - 19 : 24rd Nov'2024 [20 mins]
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
package pooja.stringassignments;

public class Assignment_19 {

	void printInputChars(String str) {
		System.out.println("The given string is    : " + str);
		System.out.print("The reversed string is : ");

		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment_19 assignment_19 = new Assignment_19();
		assignment_19.printInputChars("te ch3no");
	}
}