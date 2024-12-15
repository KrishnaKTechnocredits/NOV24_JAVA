/*
Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 56
output : 8

*/
package pramod;
class Assignment27 {

	char printAscii(int num) {
		char ch = (char)num;
		return ch;
	}
	
	public static void main(String[] args) {
		Assignment27 Pascii = new Assignment27();
		char Answer;
		Answer=Pascii.printAscii(65);
		System.out.println("Character of ascii value "+65+" -> "+Answer);
		Answer=Pascii.printAscii(90);
		System.out.println("Character of ascii value "+90+" -> "+Answer);
		Answer=Pascii.printAscii(56);
		System.out.println("Character of ascii value "+8+" -> "+Answer);
	}
	
}