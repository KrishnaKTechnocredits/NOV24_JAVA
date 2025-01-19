/*Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
*/
package pramod;
class Assignment29 {
	
	void printAsciiOfAToZ(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print("Ascii value of " + ch +"-> ");
			int ascii = str.charAt(i);
			System.out.println(ascii);
		}
	}
	
	void printAsciiOfaToz(String str) {
		System.out.println("------------------------------------------");
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print("Ascii value of " + ch +"-> ");
			int ascii = str.charAt(i);
			System.out.println(ascii);
		}
	}
	
	void printAsciiOfZeroToNine(String str) {
		System.out.println("------------------------------------------");
		for(int i=0; i<str.length(); i++) {
			//char ch = str.charAt(i);
			int answer = str.charAt(i);
			System.out.println("Character of " +i+" -> " + answer);
		}
	}
	
	public static void main(String[] args){
		Assignment29 ascii = new Assignment29();
		String input1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ascii.printAsciiOfAToZ(input1);
		String input2 = "abcdefghijklmnopqrstuvwxyz";
		ascii.printAsciiOfaToz(input2);
		String input3 = "0123456789";
		ascii.printAsciiOfZeroToNine(input3);
	}
}