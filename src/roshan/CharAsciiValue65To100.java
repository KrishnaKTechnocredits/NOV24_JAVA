package roshan;

public class CharAsciiValue65To100 {
	void printAllCharAscii(int ascii) {
		char ch = (char) ascii; // Converts the integer ascii to its corresponding character (char) and assigns
								// it to the variable ch
		System.out.println(ch + " is represented by ascii value " + ascii);
	}

	void printAsciiValuesForCharacter(char ch) {
		int Ascii = ch;
		System.out.println(Ascii + " is represented by ascii value " + ch);

	}

	public static void main(String[] args) {

		CharAsciiValue65To100 charasciivalue65To100 = new CharAsciiValue65To100();
		for (int asciinum = 65; asciinum <= 100; asciinum++) {
			charasciivalue65To100.printAllCharAscii(asciinum); // call in for loop to print 65-100

		}
		System.out.println();
		for (char ch1 = 'Z'; ch1 >= 'A'; ch1--) {
			charasciivalue65To100.printAsciiValuesForCharacter(ch1); // call in for loop to print 65-100
		}

	}
}

///*
// * Assignment - 28 : 2nd Dec'2024 [20 mins]
// * 
// * write a method to print all the characters having ascii value from 65 to 100.
// * 
// * output : 65 -> A 66 -> B so on ..
