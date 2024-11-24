//Print all the characters of given string in reverse order. 
//
//input : te ch3no
//output : o
//         n
//         3
//         h
//         c
//		 
//         e 
//         t  		 
package fazrana.string;

public class FAssignment19 {
	void printChar(String str) {
		System.out.println("Word in reverse order- ");
		for(int rev=(str.length()-1);rev>=0;rev--) {
			System.out.println(str.charAt(rev));
		}
	}
	
	public static void main(String[] args) {
		new FAssignment19().printChar("Te ch3no");
	}
}
