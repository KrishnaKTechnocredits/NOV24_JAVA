package vrushali.assciiProgram;

//Assignment - 28 : 2nd Dec'2024 [20 mins]
//
//write a method to print all the characters having ascii value from 65 to 100.
//
//output : 
//65 -> A
//66 -> B 
//so on .. 
//
//write a method to print ascii values for character A to Z.
//output : 
//A -> 65
//B -> 66
//..
//..
//Z -> 90

public class PrintAsciiValueForAtoZ {
	void PrintAsciiValueForAtoZChar() {
		char ch = 'A';
		int j = 0;
		for (int i = 0; i < 26; i++) {
			j = ch;
			System.out.println("Ascii value for character " + ch + " is  -> " + j);
			ch++;
		}
	}

	void printCharForGivenRangeAsciiValue(int startValue, int endValue) {
		char ch;
		for (int i = startValue; i <= endValue; i++) {
			ch = (char) i;
			System.out.println(i + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		PrintAsciiValueForAtoZ printAsciiValueForAtoZ = new PrintAsciiValueForAtoZ();
		printAsciiValueForAtoZ.PrintAsciiValueForAtoZChar();
		printAsciiValueForAtoZ.printCharForGivenRangeAsciiValue(65, 90);

	}
}
