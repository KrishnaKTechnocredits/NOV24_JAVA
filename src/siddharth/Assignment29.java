package siddharth;

//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
public class Assignment29 {

	void printAscii(char ch) {
		int num = ch;
		System.out.println(ch+" > "+num);
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		System.out.println("Uppercase (A-Z):");
		for(char ch='A';ch<='Z';ch++) {
			assignment29.printAscii(ch);
		}
		System.out.println("lowercase (a-z):");
		for(char ch='a';ch<='z';ch++) {
			assignment29.printAscii(ch);
		}
		System.out.println("digits (0-9):");
		for(char ch='0';ch<='9';ch++) {
			assignment29.printAscii(ch);
		}
	}
}
