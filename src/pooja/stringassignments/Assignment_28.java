package pooja.stringassignments;

/*
 * Assignment - 28 : 2nd Dec'2024 [20 mins]

write a method to print all the characters having ascii value from 65 to 100.

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
public class Assignment_28 {

	void printCharactersWithinRange() {
		for (int i = 65; i <= 100; i++) {
			System.out.println(i + " -> " + (char) i);
		}
	}

	void printAsciiForAtoZ() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i + " -> " + i);
		}
	}

	public static void main(String[] args) {
		Assignment_28 assignment_28 = new Assignment_28();
		System.out.println("-----characters having ascii value from 65 to 10-----");
		assignment_28.printCharactersWithinRange();
		System.out.println("-----ascii values for character A to Z-----");
		assignment_28.printAsciiForAtoZ();
	}
}