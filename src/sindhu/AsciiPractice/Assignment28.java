/*write a method to print all the characters having ascii value from 65 to 100.

output : 
65 -> A
66 -> B 
so on .. 

write a method to print ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90*/

package sindhu.AsciiPractice;

public class Assignment28 {
	
	void getCharVal(int i){
		char asciiVal = (char)i;
		System.out.println(i +"->"+ asciiVal);
	}
	
	void getAsciiVal(char ch) {
		int charVal = ch;
		System.out.println(ch +"->"+ charVal);
	}
	
	public static void main(String[] args) {
		Assignment28 assign28 = new Assignment28();
		System.out.println("Below are the characters for the given Ascii values:");
		for(int i=65; i<=100; i++) {
			assign28.getCharVal(i);
		}
		System.out.println(" ");
		System.out.println("Below are the Ascii values for the given characters:");
		for(char ch='A'; ch<='Z'; ch++) {
			assign28.getAsciiVal(ch);
		}
	}
}
