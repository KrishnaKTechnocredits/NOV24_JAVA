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
package nitesh;

public class ReverseString {
	
	void printReverseString(String value) {
		for(int i=value.length()-1;i >= 0;i--) {
			System.out.println(value.charAt(i));
		}
	}
	public static void main(String[] args) {
		new ReverseString().printReverseString("te ch3no"); 
	}
}	
