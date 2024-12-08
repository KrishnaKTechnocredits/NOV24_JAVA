/*write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/

package pankaj.asciiAssignment;

public class Assignment29 {
	
	int upperCase(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " " + "is the char of the ascii code" + " " + ascii);
		
		return ascii;
		
	}
	
	int lowerCase(int ascii) {
		
		char ch = (char) ascii;
		System.out.println(ch + " " + "is the char of the ascii code" + " " + ascii);
		return ascii;
	} 
	
	int digits(char ch) {
		int ascii = (char) ch;
		
		return ascii;

	}

	public static void main(String[] args) {
		
		Assignment29 A29=new Assignment29();
		
		System.out.println("===============================================");
		for (char ascii = 'A'; ascii <= 'Z'; ascii++) {
			 A29.upperCase(ascii);
			// System.out.println(num);
		}
		System.out.println("===============================================");
		for (char ascii = 'a'; ascii <= 'z'; ascii++) {
			 A29.lowerCase(ascii);
			// System.out.println(num);
		}
		System.out.println("===============================================");
		for (char ascii = '0'; ascii <= '9'; ascii++) {
			int num= A29.digits(ascii);
			System.out.println(ascii + " " + "is represented by the ascii value" + " " + num);
			
		}
		
	}

}
