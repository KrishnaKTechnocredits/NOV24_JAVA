package siddharth;

public class Assignment28 {

	void printChar(int num) {
		char ch = (char) num;
		System.out.println(num+" > "+ch);
	}

	void printAscii(char ch) {
		int num = ch;
		System.out.println(ch+" > "+num);
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		for(int num=65;num <=100;num++) {
			assignment28.printChar(num);
		}
		for(char ch= 'A';ch<='Z';ch++) {
			assignment28.printAscii(ch);
		}
	}
}
